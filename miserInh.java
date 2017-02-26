/*
 * PPL-Assignment-lit2015007
 * @author Vaibhav
 */

package com.pplAssignment.strcuture.withInheritance;

import com.pplAssignment.examples.withInheritance.staticFunctionsInh;

/** 
 * Class for The Miser. 
 * Superclass: boyInh.
 */
public class miserInh extends boyInh{
    
    /**
     * Constructor for Miser
     * @param minAttr Minimum attractiveness requirement 
     * @param name Name
     * @param att Attractiveness
     * @param iLevel Intelligence Level
     * @param Budget Budget
     */
    public miserInh(int minAttr, String name, int att, int iLevel, int Budget) {
        super(minAttr, name, att, iLevel, Budget);
        this.type = "The Miser";
    }
    
    /**
     * Getter for Happiness.
     * Happiness of Miser is given by the total unspent money from their budget.
     * @return Happiness of Miser boyInh
     */
    @Override
    public double getHpns(){
        return ( this.Budget - this.gbasket.getNetPrice() );
    }
    
    /**
     * Method for setting Gift Basket.
     * MIser gift their girlfriend with enough gifts, equal or just over the maintenance cost.
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
        k = 0;
        int l = 0;
        while(prc < this.grlfrnd.Budget && k < staticFunctionsInh.length(gList) ){
            this.gbasket.items[l] = gList[k];
            prc += gList[k].price;
            k++;
            l++;
        }
        
        k=0;
        lList = staticFunctionsInh.sortByCost(lList);
        while(prc < this.grlfrnd.Budget && k < staticFunctionsInh.length(lList)){
            this.gbasket.items[l] = lList[k];
            prc += lList[k].price;
            k++;
            l++;
        }       
    }
}
