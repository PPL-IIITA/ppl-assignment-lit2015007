/*
 * PPL-Assignment-lit2015007,
 * @author Vaibhav
 */

package com.pplAssignment.structure.basic;

/**
 * Luxury Gift.
 * A particular type of Gift.
 */

public class _luxuryGift {

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
     * Luxury rating
     */
    public int lRating; 
    
    /**
     * Difficulty to Obtain.
     */
    public int dfclt; 
    

    /**
     * Constructor for luxuryGift.
     * @param name Name
     * @param lRating  Luxury rating of the gift
     * @param dfclt Difficulty to Obtain the gift
     * @param price Price of the gift
     * @param value Value of the gift
     */
    public _luxuryGift(String name, int lRating, int dfclt, int price, int value) {
        this.name = name;
        this.price = price;
        this.value = value;     
        this.lRating = lRating;
        this.dfclt = dfclt;
    }
    
    /**
     * Displays Info of Luxury Gift
     */
    public void display() {
        System.out.println("\tName: " + this.name 
                + "\tPrice: " + this.price 
                + "\tValue: " + this.value 
                + "\tType: " + "Luxury Gift"
                + "\tLuxury Rating: "+this.lRating
                + "\tDifficulty to obtain: "+this.dfclt
        );
    }
    
    
}
