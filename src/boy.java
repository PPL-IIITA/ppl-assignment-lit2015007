/*
 * PPL-Assignment-lit2015007.
 * @author Vaibhav.
 */

package com.pplAssignment.structure.inheritance;

import com.pplAssignment.examples.inheritance.staticFunctions;

/** 
 * Class for Boys. 
 * Superclass: person.
 */

public abstract class boy extends person {
    
    /**
     * Minimum Attraction Requirement from a girl to be committed with.
     */
    public int minAttr;
    
    /**
     * Girlfriend of boy when committed.
     */
    girl grlfrnd;

    /**
     * Constructor for Boy
     * @param minAttr Minimum attractiveness requirement 
     * @param name Name
     * @param att Attractiveness
     * @param iLevel Intelligence Level
     * @param Budget Budget
     */
    public boy(int minAttr, String name, int att, int iLevel, int Budget) {
        super(name, att, iLevel, Budget);
        this.minAttr = minAttr;
        this.grlfrnd = null;
    }
    
    /**
     * Interface defining fillBasket method.
     * @param giftSet List of gifts available
     */
    public abstract void fillBasket(gift []giftSet);
    
    /**
     * Match Finder for boy
     * @param girlSet Set of available girls 
     * @return perfectly matched girl
     */
    public girl getMatch(girl girlSet[]){
        girl []girlList = new girl[10000];
        int idx = 0;
        for(girl item : girlSet){
            if(item == null)    break;
            girlList[idx++] = item;
        }
        girlList = (girl[]) staticFunctions.sortBy(girlList, "most attractive");       
            
        for(int i = staticFunctions.length(girlList)-1; i>=0; i--){
            if(girlList[i].cmtd == false && girlList[i].Budget <= this.Budget && this.minAttr <= girlList[i].att )
                return girlList[i];
        }
        return null;
    }
        
    
}
