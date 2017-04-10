/*
 * PPL-Assignment-lit2015007
 * @author Vaibhav
 */

package com.pplAssignment.structure.basic;

/**
 * Essential Gift.
 * A particular type of Gift.
 */

public class _essentialGift {
    
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
     * Constructor for essentialGift.
     * @param name Name
     * @param price Price
     * @param value Value
     */
    public _essentialGift(String name, int price, int value) {
        this.name = name;
        this.price = price;
        this.value = value;
    } 
    
    /**
     * Displays Info of Essential Gift
     */
    public void display() {
        System.out.println("\tName: " + this.name 
                + "\tPrice: " + this.price 
                + "\tValue: " + this.value 
                + "\tType: " + "Essential Gift"
        );
    }
}
