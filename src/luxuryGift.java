/*
 * PPL-Assignment-lit2015007,
 * @author Vaibhav
 */

package com.pplAssignment.structure.inheritance;

/**
 * Luxury Gift.
 * A particular type of Gift.
 * Superclass: gift.
 */

public class luxuryGift extends gift{

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
    public luxuryGift(String name, int lRating, int dfclt, int price, int value) {
        super(name, price, value, "Luxury Gift");
        this.lRating = lRating;
        this.dfclt = dfclt;
    }
    
    /**
     * Displays Info of Luxury Gift
     */
    @Override
    public void display() {
        System.out.println("Name: " + this.name 
                + "\tPrice: " + this.price 
                + "\tValue: " + this.value 
                + "\tType: " + this.type
                + "\tLuxury Rating: "+this.lRating
                + "\tDifficulty to obtain: "+this.dfclt
        );
    }
    
    
}
