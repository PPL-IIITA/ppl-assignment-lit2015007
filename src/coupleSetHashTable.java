/*
 * PPL-Assignment-lit2015007,
 * @author Vaibhav
 */
package com.pplAssignment.structure.inheritance;


/** Data Structure storing Couples in Hash Table*/

public class coupleSetHashTable extends coupleSet{
    
    /**
     * Constructor for Couple Set List
     */
    public coupleSetHashTable() {
        super();
        end = 999;
    }
  
    /**
     * Method for adding couple in Couple Set
     * @param cp Couple to be added
     */
    @Override
    public void addCouple(couple cp){
        int idx = Math.abs(cp.boyC.name.hashCode()) % 1000;
        while(cpList[idx] != null){
            idx = (idx + 1) % 1000;
        }
        cpList[idx] = cp;
    }
    
    /**
     * Method for displaying details of couples stored
     */
    @Override
    public void printDetails(){
        for(int i = 0; i <= end; i++)
            if(cpList[i]!=null)    cpList[i].printCoupleName();
    }
    
    /**
     * Method for finding girlfriend of given boy
     * @param boyName Name of the Boy
     * @return Name of the girlfriend of given boy if any
     */
    @Override
    public String getGrlFrnd(String boyName){
        int idx = Math.abs(boyName.hashCode()) % 1000;
        int start = idx;
        do{
            if(cpList[idx]!=null && cpList[idx].boyC.name.equals(boyName))
                return cpList[idx].grlC.name;
            idx = (idx + 1) % 1000;
        }
        while(start!=idx);
        return null;
    }
    
    
    
    
}
