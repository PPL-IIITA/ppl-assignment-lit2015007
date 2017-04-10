/*
 * PPL-Assignment-lit2015007
 * @author Vaibhav
 */
package com.pplAssignment.structure.inheritance;


/** 
 * Same as miser class only fillBasket method changed to satisfy specific constraints in q8
 * Superclass: miser.
 */
public class miser8 extends miser{
    
    /**
     * Constructor for Miser8
     * @param minAttr Minimum attractiveness requirement 
     * @param name Name
     * @param att Attractiveness
     * @param iLevel Intelligence Level
     * @param Budget Budget
     */
    public miser8(int minAttr, String name, int att, int iLevel, int Budget) {
        super(minAttr, name, att, iLevel, Budget);
    }
    
    /**
     * Modified fillBasket specifically for q8
     * @param giftSet List of gifts available
     */
    @Override
    public void fillBasket(gift []giftSet) {
        
        /*
         * 0 for Default
         * 1 for Special
        */
        int choose;
        
        choose = (int)Math.random();
        
        giftSelector gS;
        
        if(choose == 0)
            gS = new giftSelectorDefault();
        else
            gS = new giftSelectorSpecific();
        
        gS.allocate(giftSet, this, gbasket);
    }
            
        
        
}
