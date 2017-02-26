/*
 * PPL-Assignment-lit2015007
 * @author Vaibhav
 */

package com.pplAssignment.strcuture.withInheritance;

/** Class defining a couple */

public class coupleInh {
    
    /** 
     */
    public boyInh boyC; 
    
    /**
     * Girl in the couple
     */
    public girlInh grlC; 
    
    
    /**
     * Constructor for Couple
     * @param boyC Boy in the couple
     * @param grlC Girl in the couple
     * @param esGifts List of essential gifts
     * @param uGifts List of Utility gifts
     * @param lGifts List of Luxury gifts 
     */
    public coupleInh(boyInh boyC, girlInh grlC, essentialGiftInh []esGifts, utilityGiftInh []uGifts, luxuryGiftInh []lGifts) {
        this.boyC = boyC;
        this.grlC = grlC;
        
        this.boyC.grlfrnd = this.grlC;
        this.grlC.boyfrnd = this.boyC;
        
        giftBasketInh gb = new giftBasketInh();
        this.boyC.gbasket = gb;
        this.grlC.gbasket = gb;
        boyC.fillBasket(esGifts, uGifts, lGifts);
    }
    
    /**
     * Getter for Happiness of the couple.
     * Happiness of the couple is defined as sum of the happiness of both boyInh and girl.
     * @return Happiness of the couple
     */
    public double getHpns() {
        return this.boyC.getHpns() + this.grlC.getHpns();
        
    }
    
    /**
     * Getter for Compatibility of the couple.
     * The compatibility of a couple is defined as the sum of: 
 magnitude by which the budget of the boyInh exceeds the maintenance cost of the girl,
 the absolute value of the difference in attractiveness, 
 and the absolute value of the difference of intelligence.
     * @return Compatibility of the couple
     */
    public double getCmptbl() {
        return ( (this.boyC.Budget - this.grlC.Budget) +
            Math.abs(this.boyC.att - this.grlC.att) +
            Math.abs(this.boyC.iLevel - this.grlC.iLevel) ); 
        
    }
    
    /**
     * Displays Couple Information
     */
    public void printCouple(){
        System.out.println("\n\n"+this.boyC.name + "-" + this.grlC.name);
    }
            
    
}
