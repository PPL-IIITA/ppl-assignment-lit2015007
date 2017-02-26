/*
 * PPL-Assignment-lit2015007
 * @author Vaibhav
 */

package com.pplAssignment.strcuture.withInheritance;

/**
 * Essential Gift.
 * A particular type of Gift.
 * Superclass: gift.
 */

public class essentialGiftInh extends giftInh{

    /**
     * Constructor for essentialGift.
     * @param name Name
     * @param price Price
     * @param value Value
     */
    public essentialGiftInh(String name, int price, int value) {
        super(name, price, value, "Essential Gift");
    } 
    
    /**
     * Displays Info of Essential Gift
     */
    @Override
    public void display() {
        System.out.println("Name: " + this.name 
                + "\tPrice: " + this.price 
                + "\tValue: " + this.value 
                + "\tType: " + this.type
        );
    }
}
