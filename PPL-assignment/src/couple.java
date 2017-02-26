/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pplAssignment.structure.withoutInheritance;

/**
 *
 * @author Vaibhav
 */
public class couple {
    /**
     * Name of Boy
     */
    public String boyName;
    
    /**
     * Name of Girl
     */
    public String grlName;
    
    /**
     * Compatibility of couple
     */
    public double cmptblt;
    
    /**
     * Happiness of couple
     */
    public double hpns;
    
    /**
     * Gift Basket
     */
    public giftBasket gb;
    
    public void display(){
        System.out.println("\n\n" + this.boyName + "-" + this.grlName + " Compatibility: " +this.cmptblt +" Happiness: "+this.hpns+"\n");
        gb.display();
    }
    public void displayName(){
        System.out.println(this.boyName + "-" + this.grlName + "\n");
    }
    
    
    
}
