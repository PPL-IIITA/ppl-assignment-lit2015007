/*
 * PPL-Assignment-lit2015007
 * @author Vaibhav
 */
package com.pplAssignment.strcuture.withInheritance;

import com.pplAssignment.examples.withInheritance.staticFunctionsInh;

/** 
 * Class for The Generous. 
 * Superclass: boyInh.
 */
public class generousInh extends boyInh{
    
    /**
     * Constructor for Generous
     * @param minAttr Minimum attractiveness requirement 
     * @param name Name
     * @param att Attractiveness
     * @param iLevel Intelligence Level
     * @param Budget Budget
     */
    public generousInh(int minAttr, String name, int att, int iLevel, int Budget) {
        super(minAttr, name, att, iLevel, Budget);
        this.type = "The Generous";
    }
    
    /**
     * Getter for Happiness.
     * Happiness of generous boys is given by the happiness of the girlfriend.
     * @return Happiness of Generous boyInh
     */
    @Override
    public double getHpns(){
        return this.grlfrnd.getHpns();
    }
    
    /**
     * Method for setting Gift Basket.
     * Generous gift their girlfriend with maximum cost gifts, equal to or just under their budget.
     * @param esGifts Essential gift list 
     * @param uGifts Utility gift list
     * @param lGifts Luxury gift list
     */
    @Override
    public void fillBasket(essentialGiftInh[] esGifts, utilityGiftInh[] uGifts, luxuryGiftInh[] lGifts) {
        giftInh []gList = new giftInh[10000];
        giftInh []lList;
        int k = 0;
        for(essentialGiftInh item : esGifts){
            if(item == null)    break;
            gList[k++] = item;
        }
        for(utilityGiftInh item : uGifts){
            if(item == null)    break;
            gList[k++] = item;
        }
        
        lList = lGifts;
        
        gList = staticFunctionsInh.sortByCost(gList);
        
        
        double prc = 0;
        while (true){
            k = staticFunctionsInh.length(gList) - 1;
            int l = 0;
            while(prc < this.Budget && k>=0){
                while(gList[k].price > (this.Budget - prc) )    k--;
                
                this.gbasket.items[l] = gList[k];
                prc += gList[k].price;
                k--;
                l++;
            }

            k = staticFunctionsInh.length(lList) - 1;
            lList = staticFunctionsInh.sortByCost(lList);
            while(prc < this.Budget && k>=0){
                while(lList[k].price > (this.Budget - prc) )    k--;
                this.gbasket.items[l] = lList[k];
                prc += lList[k].price;
                k--;
                l++;
            }
            
            
            if(prc > this.Budget){
                prc -= this.gbasket.items[l].price;
                this.gbasket.items[l] = null;
            }
            
            if(prc > 0) break;
            else this.Budget = gList[0].price;
         
        }       
    }
}
