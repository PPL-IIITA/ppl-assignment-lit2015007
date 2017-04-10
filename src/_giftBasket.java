/*
 * PPL-Assignment-lit2015007,
 * @author Vaibhav
 */

package com.pplAssignment.structure.basic;

/** Class defining Gift Basket */

public class _giftBasket {
    
    /**
     * List of essential gift items in the basket.
     */
    public _essentialGift[] eItems;
    
    /**
     * List of utility gift items in the basket.
     */
    public _utilityGift[] uItems;
    
    /**
     * List of luxury gift items in the basket.
     */
    public _luxuryGift[] lItems;

    /**
     * Constructor for Gift Basket
     */
    public _giftBasket() {
        this.eItems = new _essentialGift[100];
        this.uItems = new _utilityGift[100];
        this.lItems = new _luxuryGift[100];
        
    }
    
    /**
     * Getter for net cost of the gift basket.
     * Luxury Gift count double the normal value.
     * @return Net cost of the gift basket
     */
    public double getNetCost()
    {
        double cst = 0;
        for (_essentialGift item : this.eItems) {
            if(item == null)    break;
            cst += item.price/item.value;           
        }
        
        for (_utilityGift item : this.uItems) {
            if(item == null)    break;            
            cst += item.price/item.value;           
        }
        
        for (_luxuryGift item : this.lItems) {
            if(item == null)    break;            
            cst += 2*(item.price/item.value);           
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
        for (_essentialGift item : this.eItems) {
            if(item == null)    break;
            val += item.value;
        }
        
        for (_utilityGift item : this.uItems) {
            if(item == null)    break;
            val += item.value;
        }
        
        for (_luxuryGift item : this.lItems) {
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
        for (_essentialGift item : this.eItems) {
            if(item == null)    break;
            prc += item.price;
        }
        
        for (_utilityGift item : this.uItems) {
            if(item == null)    break;
            prc += item.price;
        }
        
        for (_luxuryGift item : this.lItems) {
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
        System.out.println("Gift Basket****************");
        for (_essentialGift item : this.eItems){
            if(item == null)    break;
            item.display();
        }
        
        for (_utilityGift item : this.uItems){
            if(item == null)    break;
            item.display();
        }
        
        for (_luxuryGift item : this.lItems){
            if(item == null)    break;
            item.display();
        }
        
        System.out.println();
    }  
    
}
