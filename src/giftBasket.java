/*
 * PPL-Assignment-lit2015007,
 * @author Vaibhav
 */

package com.pplAssignment.structure.inheritance;

/** Class defining Gift Basket */

public class giftBasket {
    
    /**
     * List of gift items in the basket.
     */
    public gift[] items;

    /**
     * Constructor for Gift Basket
     */
    public giftBasket() {
        this.items = new gift [1000];
    }
    
    /**
     * Getter for net cost of the gift basket.
     * Luxury Gift count double the normal value.
     * @return Net cost of the gift basket
     */
    public double getNetCost()
    {
        double cst = 0;
        for (gift item : this.items) {
            if(item == null)    break;
            if("Luxury Gift".equals(item.type))
                cst += 2*(item.price);
            else
                cst += item.price;
        }
        return cst;
    }
    
    /**
     * Getter for net value of the gift basket.
     * @return Net value of the gift basket.
     */
    public double getNetValue()
    {
        double val = 0;
        for (gift item : this.items) {
            if(item == null)    break;
            val += item.value;
        }
        return val;
    }
    
    /**
     * Displays Info of the gift basket.
     */
    public void display()
    {
        System.out.println("\nGift Basket-");
        System.out.println("------------");
        for (gift item: this.items){
            if(item == null)    break;
            item.display();
        }
        System.out.println();
    }    
}
