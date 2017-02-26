/*
 * PPL-Assignment-lit2015007.
 * @author Vaibhav.
 */

package com.pplAssignment.strcuture.withInheritance;

/** 
 * Class for Boys. 
 * Superclass: person.
 */

public abstract class boyInh extends personInh {
    
    /**
     * Minimum Attraction Requirement from a girl to be committed with.
     */
    public int minAttr;
    
    /**
     * Girlfriend of Boy when committed.
     */
    girlInh grlfrnd;

    /**
     * Constructor for Boy
     * @param minAttr Minimum attractiveness requirement 
     * @param name Name
     * @param att Attractiveness
     * @param iLevel Intelligence Level
     * @param Budget Budget
     */
    public boyInh(int minAttr, String name, int att, int iLevel, int Budget) {
        super(name, att, iLevel, Budget);
        this.minAttr = minAttr;
        this.grlfrnd = null;
    }
    
    /**
     * Interface defining fillBasket method
     * @param esGifts Essential gift list
     * @param uGifts Utility gift list
     * @param lGifts Luxury gift list
     */
    public abstract void fillBasket(essentialGiftInh []esGifts, utilityGiftInh []uGifts, luxuryGiftInh []lGifts);
        
    
}
