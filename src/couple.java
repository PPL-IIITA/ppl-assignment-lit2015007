/*
 * PPL-Assignment-lit2015007
 * @author Vaibhav
 */

package com.pplAssignment.structure.inheritance;

import com.pplAssignment.main.logger;
import java.io.IOException;

/** Class defining a couple */

public class couple {
    
    /** 
     */
    public boy boyC; 
    
    /**
     * Girl in the couple
     */
    public girl grlC; 
    
    
    /**
     * Constructor for Couple
     * @param boyC boy in the couple
     * @param grlC Girl in the couple
     * @param giftSet List of gifts available
     * @throws java.io.IOException If Log can't be written
     */
    public couple(boy boyC, girl grlC, gift []giftSet) throws IOException {
        this.boyC = boyC;
        this.grlC = grlC;
        this.boyC.cmtd = true;
        this.grlC.cmtd = true;
        this.boyC.grlfrnd = this.grlC;
        this.grlC.boyfrnd = this.boyC;
        
        giftBasket gb = new giftBasket();
        this.boyC.gbasket = gb;
        this.grlC.gbasket = gb;
        boyC.fillBasket(giftSet);
        logger.patchupLog(this);
    }
    
    /**
     * Getter for Happiness of the couple.
     * Happiness of the couple is defined as sum of the happiness of both boy and girl.
     * @return Happiness of the couple
     */
    public double getHpns() {
        return this.boyC.getHpns() + this.grlC.getHpns();
        
    }
    
    /**
     * Getter for Compatibility of the couple.
     * The compatibility of a couple is defined as the sum of: 
     * magnitude by which the budget of the boy exceeds the maintenance cost of the girl,
     * the absolute value of the difference in attractiveness, 
     * and the absolute value of the difference of intelligence.
     * @return Compatibility of the couple
     */
    public double getCmptbl() {
        return ( (this.boyC.Budget - this.grlC.Budget) +
            Math.abs(this.boyC.att - this.grlC.att) +
            Math.abs(this.boyC.iLevel - this.grlC.iLevel) ); 
        
    }
    
    /**
     * Displays Couple Information (Only Names)
     */
    public void printCoupleName(){
        if(this.boyC.cmtd == false || this.grlC.cmtd == false)  return;
        System.out.println();
        System.out.println(this.boyC.name + "-" + this.grlC.name);
    }
    
    /**
     * Displays Couple Information
     */
    public void printCouple(){
        if(this.boyC.cmtd == false || this.grlC.cmtd == false)  return;
        System.out.println();
        System.out.println(this.boyC.name + "-" + this.grlC.name);
        System.out.println();
        this.boyC.gbasket.display();
        
    }
    
    /**
     * Breakup of Couple
     * @throws IOException If log can't be written
     */
    public void breakup() throws IOException{
        logger.breakupLog(this);
        this.boyC.cmtd = false;
        this.grlC.cmtd = false;
    }
    
            
    
}
