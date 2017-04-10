/*
 * PPL-Assignment-lit2015007,
 * @author Vaibhav
 */
package com.pplAssignment.structure.inheritance;


/** Data Structure storing Couples in Array*/

public class coupleSetList extends coupleSet{
    
    /**
     * Constructor for Couple Set List
     */
    public coupleSetList() {
        super();
    }
    
    /**
     * Method for adding couple in Couple Set
     * @param cp Couple to be added
     */
    @Override
    public void addCouple(couple cp){
        this.end += 1;
        cpList[end] = cp;
    }
    
        
    /**
     * Method for finding girlfriend of given boy
     * @param boyName Name of the Boy
     * @return Name of the girlfriend of given boy if any
     */
    @Override
    public String getGrlFrnd(String boyName){
        for(int i = 0; i <= end; i++){
            if(cpList[i].boyC.name.equals(boyName))
                return cpList[i].grlC.name;
        }
        return null;
    }
    
    
    
    
}
