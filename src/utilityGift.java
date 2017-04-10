/*
 * PPL-Assignment-lit2015007
 * @author Vaibhav
 */

package com.pplAssignment.structure.inheritance;

/**
 * Utility Gift.
 * A particular type of Gift.
 * Superclass: gift.
 */

public class utilityGift extends gift{
    
    /**
     * Utility Value
     */
    public int utValue; 
    
    /**
     * Utility Class
     */
    public String utClass;    

    /**
     * Constructor for utilityGift
     * @param name Name
     * @param utValue Utility Value
     * @param utClass Utility Class
     * @param price Price
     * @param value Value
     */
    public utilityGift(String name, int utValue, String utClass, int price, int value) {
        super(name,price, value, "Utility Gift");
        this.utValue = utValue;
        this.utClass = utClass;
    }
    
    /**
     * Displays Info of Utility Gift
     */
    @Override
    public void display() {
        System.out.println("Name: " + this.name 
                + "\tPrice: " + this.price 
                + "\tValue: " + this.value 
                + "\tType: " + this.type 
                + "\tUtility Value: " + this.utValue  
                + "\tUtility Class: " + this.utClass
        );
    }
    
    
}
