/*
 * PPL-Assignment-lit2015007
 * @author Vaibhav
 */

package com.pplAssignment.strcuture.withInheritance;

/** 
 * Class for Girls of Type : The normal.
 * Superclass: girl.
 */
public class normalInh extends girlInh {
    
    /**
     * Getter for Happiness.
     * Happiness of a normal girl is linear to the total cost of gifts achieved over maintenance, including luxury gifts. 
     * The value of all gifts is added additional to the cost.
     * @return Happiness of Normal Girl
     */
    @Override
    public double getHpns(){
        return (this.gbasket.getNetCost() + this.gbasket.getNetValue());
    }
    
    /**
     * Constructor for Normal
     * @param crit Criterion of choosing the boy to date. Either of: most attractive, most rich or most intelligent.
     * @param name Name
     * @param att Attractiveness
     * @param iLevel intelligence Level
     * @param Budget Maintenance Budget
     */
    public normalInh(String crit, String name, int att, int iLevel, int Budget) {
        super(crit, name, att, iLevel, Budget);
        this.type = "The Normal";
    }
}
