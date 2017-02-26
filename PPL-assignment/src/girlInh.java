/*
 * PPL-Assignment-lit2015007
 * @author Vaibhav
 */

package com.pplAssignment.strcuture.withInheritance;

/** 
 * Class for Girls.
 * Superclass: person.
 */

public abstract class girlInh extends personInh{
   
    /**
     * Criterion of choosing the boyInh to date.
     * Either of: most attractive, most rich or most intelligent.
     */
    public String crit; 
    
    /**
     * Boyfriend of girl when committed.
     */
    boyInh boyfrnd;

    /**
     * Constructor for Girl
     * @param crit Criterion of choosing the boyInh to date. Either of: most attractive, most rich or most intelligent.
     * @param name Name
     * @param att Attractiveness
     * @param iLevel intelligence Level
     * @param Budget Maintenance Budget
     */
    public girlInh(String crit, String name, int att, int iLevel, int Budget) {
        super(name, att, iLevel, Budget);
        this.crit = crit;
        this.boyfrnd = null;
    }    
}
