/*
 * PPL-Assignment-lit2015007
 * @author Vaibhav
 */
package com.pplAssignment.structure.inheritance;

import com.pplAssignment.examples.inheritance.staticFunctions;

/** Default Gift Allocation System*/

public class giftSelectorDefault extends giftSelector {
    
    /**Default method for allocating gifts to giftBasket
     * @param giftSet Set of available gifts
     * @param curBoy Boy who is performing gifting
     * @param gb Gift Basket to be filled
     */
    @Override
    public void allocate(gift giftSet[], boy curBoy, giftBasket gb){
        gift []gList = new gift[10000];
        gift []lList = new gift[10000];
        int k = 0, lIdx = 0 ;
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
            k++;
            l++;
        }
        
        k=0;
        lList = staticFunctions.sortByCost(lList);
        while(prc < curBoy.grlfrnd.Budget && k < staticFunctions.length(lList)){
            curBoy.gbasket.items[l] = lList[k];
            prc += lList[k].price;
            k++;
            l++;
        }
        
        if(prc > curBoy.Budget)
            curBoy.gbasket.items[l-1] = null;
        
    }
}
