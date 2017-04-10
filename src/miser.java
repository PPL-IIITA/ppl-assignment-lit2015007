/*
 * PPL-Assignment-lit2015007
 * @author Vaibhav
 */

package com.pplAssignment.structure.inheritance;

import com.pplAssignment.examples.inheritance.staticFunctions;

/** 
 * Class for The Miser. 
 * Superclass: boy.
 */
public class miser extends boy{
    
    /**
     * Constructor for Miser
     * @param minAttr Minimum attractiveness requirement 
     * @param name Name
     * @param att Attractiveness
     * @param iLevel Intelligence Level
     * @param Budget Budget
     */
    public miser(int minAttr, String name, int att, int iLevel, int Budget) {
        super(minAttr, name, att, iLevel, Budget);
        this.type = "The Miser";
    }
    
    /**
     * Getter for Happiness.
     * Happiness of Miser is given by the total unspent money from their budget.
     * @return Happiness of Miser boy
     */
    @Override
    public double getHpns(){
        return ( this.Budget - this.gbasket.getNetCost());
    }
    
    /**
     * Method for setting Gift Basket.
     * Miser gift their girlfriend with enough gifts, equal or just over the maintenance cost.
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
        
        if(prc > this.Budget)
            this.gbasket.items[l-1] = null;
    }
}
