/*
 * PPL-Assignment-lit2015007
 * @author Vaibhav
 */

package com.pplAssignment.structure.inheritance;

/** 
 * Class for Girls of Type : The choosy.
 * Superclass: girl.
 */
public class choosy extends girl{
    
    /**
     * Getter for Happiness.
     * Happiness of a choosy is logarithmic of the total cost of gifts achieved over maintenance.
     * @return Happiness of Choosy Girl
     */
    @Override
    public double getHpns(){
        double h = this.gbasket.getNetCost() - this.Budget;
        if(h<=0)    return 0;
        return Math.log(h);
    }
    
    /**
     * Constructor for Choosy
     * @param crit Criterion of choosing the boy to date. Either of: most attractive, most rich or most intelligent.
     * @param name Name
     * @param att Attractiveness
     * @param iLevel intelligence Level
     * @param Budget Maintenance Budget
     */
    public choosy(String crit, String name, int att, int iLevel, int Budget) {
        super(crit, name, att, iLevel, Budget);
        this.type = "The Choosy";
    }
}
