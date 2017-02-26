/*
 * PPL-Assignment-lit2015007,
 * @author Vaibhav
 */

package com.pplAssignment.strcuture.withInheritance;

/** Class defining Gift Basket */

public class giftBasketInh {
    
    /**
     * List of gift items in the basket.
     */
    public giftInh[] items;

    /**
     * Constructor for Gift Basket
     */
    public giftBasketInh() {
        this.items = new giftInh [1000];
    }
    
    /**
     * Getter for net cost of the gift basket.
     * Luxury Gift count double the normal value.
     * @return Net cost of the gift basket
     */
    public double getNetCost()
    {
        double cst = 0;
        for (giftInh item : this.items) {
            if(item == null)    break;
            if("Luxury Gift".equals(item.type))
                cst += 2*(item.price/item.value);
            else
                cst += item.price/item.value;
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
        for (giftInh item : this.items) {
            if(item == null)    break;
            val += item.value;
        }
        return val;
    }
    
    /**
     * Getter for net price of the gift basket.
     * @return Net price of the gift basket.
     */
    public double getNetPrice()
    {
        double prc = 0;
        for (giftInh item : this.items) {
            if(item == null)    break;
            prc += item.price;
        }
        return prc;
    }
    
    /**
     * Displays Info of the gift basket.
     */
    public void display()
    {
        System.out.println("\nGift Basket-");
        System.out.println("------------");
        for (giftInh item: this.items){
            if(item == null)    break;
            item.display();
        }
        System.out.println();
    }    
}
