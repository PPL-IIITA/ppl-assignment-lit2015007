/*
 * PPL-Assignment-lit2015007
 * @author Vaibhav
 */
package com.pplAssignment.structure.inheritance;

import com.pplAssignment.examples.inheritance.staticFunctions;

/** Special Gift Selector Class */

public class giftSelectorSpecific extends giftSelector{
    
    /**Specific method for allocating gifts to giftBasket atleast one gift of each type 
     * @param giftSet Set of available gifts
     * @param curBoy Boy who is performing gifting
     * @param gb Gift Basket to be filled
     */
    @Override
    public void allocate(gift giftSet[], boy curBoy, giftBasket gb){
        gift []gList = new gift[10000];
        gift []lList = new gift[10000];
        int k = 0, lIdx = 0 ;
        boolean eGiftSel = false, uGiftSel = false, lGiftSel = false;
        for(gift item : giftSet){
            if(item == null)    break;
            
            if(item.type.equals("Luxury Gift"))
                lList[lIdx++] = item;
            else
                gList[k++] = item;
        }
                
        gList = staticFunctions.sortByCost(gList);
        
               
        int prc = 0;
        k = 0;
        int l = 0;
        while(prc < curBoy.grlfrnd.Budget && k < staticFunctions.length(gList) ){
            curBoy.gbasket.items[l] = gList[k];
            prc += gList[k].price;
            if(gList[k].type.equals("Utility Gift"))
                uGiftSel = true;
            else 
                eGiftSel = true;
            k++;
            l++;
        }
        
        k=0;
        lList = staticFunctions.sortByCost(lList);
        while(prc < curBoy.grlfrnd.Budget && k < staticFunctions.length(lList)){
            curBoy.gbasket.items[l] = lList[k];
            prc += lList[k].price;
            lGiftSel = true;
            k++;
            l++;
        }
        
        if(prc > curBoy.Budget)
            curBoy.gbasket.items[l-1] = null;
        
        
        if(eGiftSel == false){
            for(int i = 0; i < staticFunctions.length(gList); i++){
                if(gList[i].type.equals("Essential Gift")){
                    curBoy.gbasket.items[l++] = gList[i]; 
                    prc += gList[i].price;
                    break;
                }
            }
        }
        
        
        if(uGiftSel == false){
            for(int i = 0; i < staticFunctions.length(gList); i++){
                if(gList[i].type.equals("Utility Gift")){
                    curBoy.gbasket.items[l++] = gList[i]; 
                    prc += gList[i].price;
                    break;
                }
            }
        }
        
        
        if(lGiftSel == false){
            curBoy.gbasket.items[l++] = lList[0]; 
            prc += lList[0].price;
        }
        
        if(prc > curBoy.Budget)
            curBoy.Budget = prc;
        
    }
}
