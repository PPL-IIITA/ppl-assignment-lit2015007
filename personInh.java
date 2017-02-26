/*
 * PPL-Assignment-lit2015007.
 * @author Vaibhav.
 */

package com.pplAssignment.strcuture.withInheritance;

/** Abstract class defining a person */

public abstract class personInh {

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
     * Type when committed.
     * A girl can be either of: The Choosy, The Normal, The Desperate.
     * A Boy can be either of: The Miser, The Generous, The Geeks.
     */
    public String type; 
    
    /**
     * Gift Basket.
     * Boy gives a Gift Basket to girl when committed,
     * Girl receives a Gift Basket when committed.
     */
    public giftBasketInh gbasket;
    
        
    /**
     * Interface of Getter for happiness of committed person.
     * @return happiness of committed person
     */
    public abstract double getHpns();

    /**
     * Constructor for Person.
     * @param name Name 
     * @param att Attractiveness 
     * @param iLevel Intelligence 
     * @param Budget Budget
     */
    public personInh(String name, int att, int iLevel, int Budget) {
        this.name = name;
        this.att = att;
        this.iLevel = iLevel;
        this.Budget = Budget;
        this.cmtd = false;
        this.type = null;
        this.gbasket = null;
    }    
}
