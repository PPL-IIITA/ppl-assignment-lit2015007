/*
 * PPL-Assignment-lit2015007
 * @author Vaibhav
 */

package com.pplAssignment.strcuture.withInheritance;

/** 
 * Class for Girls of Type : The desperate.
 * Superclass: girl.
 */
public class desperateInh extends girlInh{
    
    /**
     * Getter for Happiness.
     * Happiness of a desperate is exponential to the total cost of gifts received over maintenance, including luxury gifts.
     * @return Happiness of Desperate Girl
     */
    @Override
    public double getHpns(){
        return Math.exp(this.gbasket.getNetCost());
    }
    
    /**
     * Constructor for Desperate
     * @param crit Criterion of choosing the boy to date. Either of: most attractive, most rich or most intelligent.
     * @param name Name
     * @param att Attractiveness
     * @param iLevel intelligence Level
     * @param Budget Maintenance Budget
     */
    public desperateInh(String crit, String name, int att, int iLevel, int Budget) {
        super(crit, name, att, iLevel, Budget);
        this.type = "The Desperate";
    }
}
