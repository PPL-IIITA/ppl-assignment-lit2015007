/*
 * PPL-Assignment-lit2015007
 * @author Vaibhav
 */

package com.pplAssignment.structure.withoutInheritance;

/**
 * Utility Gift.
 * A particular type of Gift.
 */

public class utilityGift {
    
    /**
     * Name
     */
    public String name; 
    
    /**
     * Price
     */
    public int price;
    
    /**
     * Value
     */
    public int value;
    
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
        this.name = name;
        this.price = price;
        this.value = value;
        this.utValue = utValue;
        this.utClass = utClass;
    }
    
    /**
     * Displays Info of Utility Gift
     */
    public void display() {
        System.out.println("\tName: " + this.name 
                + "\tPrice: " + this.price 
                + "\tValue: " + this.value 
                + "\tType: " + "Utility Gift"
                + "\tUtility Value: " + this.utValue  
                + "\tUtility Class: " + this.utClass
        );
    }
    
    
}
