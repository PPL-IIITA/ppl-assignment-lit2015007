/*
 * PPL-Assignment-lit2015007
 * @author Vaibhav
 */

package com.pplAssignment.structure.withoutInheritance;

import com.pplAssignment.examples.withoutInheritance.staticFunctions;

/** 
 * Class for The Miser. 
 */
public class miser {
    
    /**
     * Name will be used as ID.
     * Never be common between any two people.
     */
    public String name; 
    
    /**
     * Attractiveness.
     */
    public int att; 
    
    /**
     * Intelligence Level.
     */   
    public int iLevel; 
    
    /**
     * Budget for buying gifts.
     */
    public int Budget; 
    
    /**
     * Boolean variable for person's current status: Committed or Not.
     * True if Committed else False.
     */
    public boolean cmtd; 
    
    
    /**
     * Gift Basket.
     * Boy gives a Gift Basket to girl when committed,
     * Girl receives a Gift Basket when committed.
     */
    public giftBasket gbasket;
    
    /**
     * Minimum Attraction Requirement from a girl to be committed with.
     */
    public int minAttr;
    
    /**
     * Type of Boy's Girlfriend
     */
    String grlType;
    
    /**
     * Choosy Girlfriend of Boy when committed with.
     */
    public choosy chGrlfrnd;
    
    /**
     * Normal Girlfriend of Boy when committed with.
     */
    public normal nGrlfrnd;
    
    /**
     * Desperate Girlfriend of Boy when committed with.
     */
    public desperate dsGrlfrnd;
    
    /**
     * Constructor for Miser
     * @param minAttr Minimum attractiveness requirement 
     * @param name Name
     * @param att Attractiveness
     * @param iLevel Intelligence Level
     * @param Budget Budget
     */
    public miser(int minAttr, String name, int att, int iLevel, int Budget) {
        this.minAttr = minAttr;
        this.name = name;
        this.att = att;
        this.iLevel = iLevel;
        this.Budget = Budget;
        this.cmtd = false;
        this.grlType = null;
        this.chGrlfrnd = null;
        this.nGrlfrnd = null;
        this.dsGrlfrnd = null;
    }
    
    /**
     * Getter for Happiness.
     * Happiness of Miser is given by the total unspent money from their budget.
     * @return Happiness of Miser boy
     */
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
    public void fillBasket(essentialGift[] esGifts, utilityGift[] uGifts, luxuryGift[] lGifts) {
        this.gbasket = new giftBasket();
        esGifts = staticFunctions.sortByCost(esGifts);
        uGifts = staticFunctions.sortByCost(uGifts);
        lGifts = staticFunctions.sortByCost(lGifts);
        
        int grlBudget = 0;
        
        switch(this.grlType){
            case "The Chosy":
                grlBudget = this.chGrlfrnd.Budget;
                break;
            case "The Normal":
                grlBudget = this.nGrlfrnd.Budget;
                break;
            case "The Desperate":
                grlBudget = this.dsGrlfrnd.Budget;
                break;
        }
        
        double prc = 0;
        int esIdx = 0;
        int uIdx = 0;
        int lIdx = 0;
        int eItIdx = 0;
        int uItIdx = 0;
        int lItIdx = 0;
        
        
        while(prc < grlBudget && (esIdx < staticFunctions.length(esGifts) || uIdx < staticFunctions.length(uGifts))){
             if((esIdx < staticFunctions.length(esGifts) && uIdx >= staticFunctions.length(uGifts))||
                    (esIdx < staticFunctions.length(esGifts) && uIdx < staticFunctions.length(uGifts) && esGifts[esIdx].price/esGifts[esIdx].value < uGifts[uIdx].price/uGifts[uIdx].value)){
                this.gbasket.eItems[eItIdx] = esGifts[esIdx];
                prc += esGifts[esIdx].price;
                eItIdx++;
                esIdx++;
            }
            
            else if(uIdx < staticFunctions.length(uGifts)) {
                this.gbasket.uItems[uItIdx] = uGifts[uIdx];
                prc += uGifts[uIdx].price;
                uItIdx++;
                uIdx++;
            }
            
        }

        while(lIdx < staticFunctions.length(lGifts) && prc < grlBudget){
            this.gbasket.lItems[lItIdx] = lGifts[lIdx];
            prc += lGifts[lIdx].price;
            lIdx++;
            lItIdx++;
        }       
    }
}
