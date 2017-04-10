/*
 * PPL-Assignment-lit2015007
 * @author Vaibhav
 */
package com.pplAssignment.structure.inheritance;

import com.pplAssignment.examples.inheritance.staticFunctions;

/** 
 * Class for The Generous. 
 * Superclass: boy.
 */
public class generous extends boy{
    
    /**
     * Constructor for Generous
     * @param minAttr Minimum attractiveness requirement 
     * @param name Name
     * @param att Attractiveness
     * @param iLevel Intelligence Level
     * @param Budget Budget
     */
    public generous(int minAttr, String name, int att, int iLevel, int Budget) {
        super(minAttr, name, att, iLevel, Budget);
        this.type = "The Generous";
    }
    
    /**
     * Getter for Happiness.
     * Happiness of generous boys is given by the happiness of the girlfriend.
     * @return Happiness of Generous boy
     */
    @Override
    public double getHpns(){
        return this.grlfrnd.getHpns();
    }
    
    /**
     * Method for setting Gift Basket.
     * Generous gift their girlfriend with maximum cost gifts, equal to or just under their budget.
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
        k = staticFunctions.length(gList) - 1;
        int l = 0;
        while(prc < this.Budget && k >=0  ){
            this.gbasket.items[l] = gList[k];
            prc += gList[k].price;
            k--;
            l++;
        }
        
        k=staticFunctions.length(lList)-1;
        lList = staticFunctions.sortByCost(lList);
        while(prc < this.Budget && k >= 0 ){
            this.gbasket.items[l] = lList[k];
            prc += lList[k].price;
            k--;
            l++;
        }  
        
        if(prc > this.Budget)
            this.gbasket.items[l-1] = null;
    }
}
