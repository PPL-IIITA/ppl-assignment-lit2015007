/*
 * PPL-Assignment-lit2015007
 * @author Vaibhav
 */
package com.pplAssignment.structure.basic;

import com.pplAssignment.examples.basic._staticFunctions;

/** 
 * Class for The Generous. 
 */
public class _generous{
    
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
    public _giftBasket gbasket;
    
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
    public _choosy chGrlfrnd;
    
    /**
     * Normal Girlfriend of Boy when committed with.
     */
    public _normal nGrlfrnd;
    
    /**
     * Desperate Girlfriend of Boy when committed with.
     */
    public _desperate dsGrlfrnd;
    
    /**
     * Constructor for Geek
     * @param minAttr Minimum attractiveness requirement 
     * @param name Name
     * @param att Attractiveness
     * @param iLevel Intelligence Level
     * @param Budget Budget
     */
    public _generous(int minAttr, String name, int att, int iLevel, int Budget) {
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
     * Happiness of _generous boys is given by the happiness of the girlfriend.
     * @return Happiness of Generous boy
     */
    public double getHpns(){
        switch(this.grlType){
            case "The Choosy":
                return this.chGrlfrnd.getHpns();
            case "The Normal":
                return this.nGrlfrnd.getHpns();
            case "The Desperate":
                return this.dsGrlfrnd.getHpns();
                
        }
        return 0;
    }
    
    /**
     * Method for setting Gift Basket.
     * Generous gift their girlfriend with maximum cost gifts, equal to or just under their budget.
     * @param esGifts Essential gift list 
     * @param uGifts Utility gift list
     * @param lGifts Luxury gift list
     */
    public void fillBasket(_essentialGift[] esGifts, _utilityGift[] uGifts, _luxuryGift[] lGifts) {
        
        this.gbasket = new _giftBasket();
        
        esGifts = _staticFunctions.sortByCost(esGifts);
        uGifts = _staticFunctions.sortByCost(uGifts);
        lGifts = _staticFunctions.sortByCost(lGifts);
        
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
        
        while (true){
            esIdx = _staticFunctions.length(esGifts) - 1;
            uIdx = _staticFunctions.length(uGifts) - 1;
            while((esIdx>=0 || uIdx>=0) && (prc < this.Budget)){
                
                while(esIdx >= 0 && esGifts[esIdx].price > (this.Budget - prc))    esIdx--;
                
                while(uIdx >= 0 && uGifts[uIdx].price > (this.Budget - prc))    uIdx--;
                
                if((esIdx >=0 && uIdx<0) || (esIdx >=0 && uIdx >=0 && esGifts[esIdx].price/esGifts[esIdx].value > uGifts[uIdx].price/uGifts[uIdx].value)){
                    this.gbasket.eItems[eItIdx] = esGifts[esIdx];
                    prc += esGifts[esIdx].price;
                    eItIdx++;
                    esIdx--;
                }
                else if(uIdx>=0) {
                    this.gbasket.uItems[uItIdx] = uGifts[uIdx];
                    prc += uGifts[uIdx].price;
                    uItIdx++;
                    uIdx--;
                }
            }

            lIdx = _staticFunctions.length(lGifts) - 1;
            
            while(lIdx>=0 && prc < this.Budget ){
                while(lIdx>=0 && lGifts[lIdx].price > (this.Budget - prc) )    lIdx--;
                if(lIdx >= 0){
                    this.gbasket.lItems[lItIdx] = lGifts[lIdx];
                    prc += lGifts[lIdx].price;
                    lIdx--;
                    lItIdx++;
                }
            }
            
            
            if(prc > this.Budget){
                if(this.gbasket.lItems[lItIdx-1].price > this.gbasket.eItems[eItIdx-1].price)
                {
                    if(this.gbasket.lItems[lItIdx-1].price > this.gbasket.uItems[uItIdx-1].price)
                    {
                        prc -= this.gbasket.lItems[lItIdx-1].price;
                        this.gbasket.lItems[lItIdx-1] = null;
                    }
                    else
                    {
                        prc -= this.gbasket.uItems[uItIdx-1].price;
                        this.gbasket.uItems[uItIdx-1] = null;
                    }
                }
                else
                {
                    if(this.gbasket.eItems[eItIdx-1].price > this.gbasket.uItems[uItIdx-1].price)
                    {
                        prc -= this.gbasket.eItems[eItIdx-1].price;
                        this.gbasket.eItems[eItIdx-1] = null;
                    }
                    else
                    {
                        prc -= this.gbasket.uItems[uItIdx-1].price;
                        this.gbasket.uItems[uItIdx-1] = null;
                    }
                    
                }
            }
            
            if(prc > 0) break;
            else 
            {
                if(lGifts[0].price < esGifts[0].price)
                {
                    if(lGifts[0].price < uGifts[0].price)
                    {
                        this.Budget = lGifts[0].price;
                    }
                    else
                    {
                        this.Budget = uGifts[0].price;
                    }
                }
                else
                {
                    if(esGifts[0].price > uGifts[0].price)
                    {
                        this.Budget = esGifts[0].price;
                    }
                    else
                    {
                        this.Budget = uGifts[0].price;
                    }
                    
                }
            }
         
        }       
    }
}
