/*
 * PPL-Assignment-lit2015007
 * @author Vaibhav
 */

package com.pplAssignment.structure.inheritance;

/** 
 * Class for Girls of Type : The desperate.
 * Superclass: girl.
 */
public class desperate extends girl{
    
    /**
     * Getter for Happiness.
     * Happiness of a desperate is exponential to the total cost of gifts received over maintenance, including luxury gifts.
     * @return Happiness of Desperate Girl
     */
    @Override
    public double getHpns(){
        double h = this.gbasket.getNetCost() - this.Budget;
        if(h<=0)    return 0;
        return Math.exp(h);
    }
    
    /**
     * Constructor for Desperate
     * @param crit Criterion of choosing the boy to date. Either of: most attractive, most rich or most intelligent.
     * @param name Name
     * @param att Attractiveness
     * @param iLevel intelligence Level
     * @param Budget Maintenance Budget
     */
    public desperate(String crit, String name, int att, int iLevel, int Budget) {
        super(crit, name, att, iLevel, Budget);
        this.type = "The Desperate";
    }
}
