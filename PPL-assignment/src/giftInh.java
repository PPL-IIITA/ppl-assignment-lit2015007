/*
 * PPL-Assignment-lit2015007
 * @author Vaibhav
 */

package com.pplAssignment.strcuture.withInheritance;

/** Abstract class defining Gift */

public abstract class giftInh {
    
    /**
     * Name
     */
    public String name;
    
    /**
     * Type. Either of Essential Gift, Utility Gift or Luxury Gift
     */
    public String type; 
    
    /**
     * Price
     */
    public int price;
    
    /**
     * Value
     */
    public int value;

    /**
     * Constructor for gift.
     * @param name Name of the Gift
     * @param price Price of the Gift
     * @param value Value of the Gift
     * @param type Type of the Gift. Either of Essential Gift, Luxury Gift or Utility Gift
     */
    public giftInh(String name, int price, int value, String type) {
        this.name = name;
        this.price = price;
        this.value = value;
        this.type = type;
    }
    
    /**
     *Interface of display function which displays gift details.
     */
    public abstract void display();
}
