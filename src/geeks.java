/*
 * PPL-Assignment-lit2015007
 * @author Vaibhav
 */
package com.pplAssignment.structure.inheritance;

import com.pplAssignment.examples.inheritance.staticFunctions;

/** 
 * Class for The Geeks.
 * Superclass: boy.
 */
public class geeks extends boy{
    
    /**
     * Constructor for Geeks
     * @param minAttr Minimum attractiveness requirement 
     * @param name Name
     * @param att Attractiveness
     * @param iLevel Intelligence Level
     * @param Budget Budget
     */
    public geeks(int minAttr, String name, int att, int iLevel, int Budget) {
        super(minAttr, name, att, iLevel, Budget);
        this.type = "The Geeks";
    }
    
    /**
     * Getter for Happiness.
     * Happiness of geek boys is given by the intelligence of their girlfriend alone.
     * @return Happiness of Geek boy
     */
    @Override
    public double getHpns(){
        return this.grlfrnd.iLevel;
    }

    /**
     * Method for setting Gift Basket.
     * Geeks gift their girlfriend with enough gifts, equal or just over the maintenance cost.
     * They additionally give one luxury gift, if budget allows.
     * @param giftSet List of gifts available
     */
    @Override
    public void fillBasket(gift []giftSet) {
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
        
        
        double prc = 0;
        k = 0;
        int l = 0;
        while(prc < this.grlfrnd.Budget && k < staticFunctions.length(gList) ){
            this.gbasket.items[l] = gList[k];
            prc += gList[k].price;
            k++;
            l++;
        }
        
        k=0;
        lList = staticFunctions.sortByCost(lList);
        while(prc < this.grlfrnd.Budget && k < staticFunctions.length(lList)){
            this.gbasket.items[l] = lList[k];
            prc += lList[k].price;
            k++;
            l++;
        }   
        
        if(lIdx == 0 && ( lList[0].price <= (this.Budget - prc)  ) ){
           this.gbasket.items[l++] = lList[0];            
        }
        
        if(prc > this.Budget)
            this.gbasket.items[l-1] = null;
    }
}