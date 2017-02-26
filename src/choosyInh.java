/*
 * PPL-Assignment-lit2015007
 * @author Vaibhav
 */

package com.pplAssignment.strcuture.withInheritance;

/** 
 * Class for Girls of Type : The choosy.
 * Superclass: girl.
 */
public class choosyInh extends girlInh{
    
    /**
     * Getter for Happiness.
     * Happiness of a choosy is logarithmic of the total cost of gifts achieved over maintenance.
     * @return Happiness of Choosy Girl
     */
    @Override
    public double getHpns(){
        return Math.log(this.gbasket.getNetCost());
    }
    
    /**
     * Constructor for Choosy
     * @param crit Criterion of choosing the boy to date. Either of: most attractive, most rich or most intelligent.
     * @param name Name
     * @param att Attractiveness
     * @param iLevel intelligence Level
     * @param Budget Maintenance Budget
     */
    public choosyInh(String crit, String name, int att, int iLevel, int Budget) {
        super(crit, name, att, iLevel, Budget);
        this.type = "The Choosy";
    }
}
