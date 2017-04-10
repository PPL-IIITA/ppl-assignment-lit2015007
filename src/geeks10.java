/*
 * PPL-Assignment-lit2015007
 * @author Vaibhav
 */
package com.pplAssignment.structure.inheritance;

import com.pplAssignment.examples.inheritance.staticFunctions;

/** 
 * Same as geeks class only fillBasket and matchGirl method changed to satisfy specific constraints in q10. 
 * Superclass: geeks.
 */
public class geeks10 extends geeks{
    
    /**
     * Constructor for Geeks10
     * @param minAttr Minimum attractiveness requirement 
     * @param name Name
     * @param att Attractiveness
     * @param iLevel Intelligence Level
     * @param Budget Budget
     */
    public geeks10(int minAttr, String name, int att, int iLevel, int Budget) {
        super(minAttr, name, att, iLevel, Budget);
    }
    
    /**
     * Modified fillBasket specifically for q10
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
                
        random <gift> gSet = new random <> (gList);
        gift selected;
        
        double prc = 0;
        int l = 0;
        while(prc < this.Budget){
            selected = gSet.fetch();
            this.gbasket.items[l] = selected;
            prc += selected.price;
            l++;
        }

        random <gift> lSet = new random <> (lList);
        
        while(prc < this.Budget){
            selected = lSet.fetch();
            this.gbasket.items[l] = selected;
            prc += selected.price;
            l++;
        }
        
        selected = lSet.fetch();
        if(lSet.fetchLimit == staticFunctions.length(lList) - 1 && ( selected.price <= (this.Budget - prc)  ) ){
           this.gbasket.items[l++] = selected;            
        }
        
        if(prc > this.Budget)
            this.gbasket.items[l-1] = null;
    }
    
    /**
     * Modified Match Finder specifically for q10
     * @param girlSet Set of available girls
     * @return perfectly matched girl
     */
    @Override
    public girl getMatch(girl girlSet[]){
        girl []girlList = new girl[10000];
        int idx = 0;
        for(girl item : girlSet){
            if(item == null)    break;
            girlList[idx++] = item;
        }
        
        random <girl> gSet = new random<>(girlList); 
        girl selected;
        
        int iteratorCount = 0;
        while(iteratorCount++ < 200){
            selected = gSet.fetch();
            if(selected.cmtd == false && selected.Budget <= this.Budget && this.minAttr <= selected.att )
                return selected;
        }
        return null;
    }
}
