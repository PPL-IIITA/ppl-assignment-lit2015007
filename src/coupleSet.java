/*
 * PPL-Assignment-lit2015007,
 * @author Vaibhav
 */
package com.pplAssignment.structure.inheritance;

import com.pplAssignment.structure.inheritance.*;

/** Interface of Data Structure storing Couples */

public abstract class coupleSet {
    
    /**
     * Array of couples
     */
    public couple []cpList;
    
    /**
     * Index of the last couple in the array 
     */
    int end;
    
    /**
     * Constructor for Couple Set
     */
    public coupleSet() {
        cpList = new couple[1000];
        end = -1;
    }
    
    /**
     * Interface for adding new Couple in Set  
     * @param cp Couple which will be added
     */
    public abstract void addCouple(couple cp);
    
    /**
     * Interface for finding girlfriend of given boy
     * @param boyName Name of Boy
     * @return Name of girlfriend if any
     */
    public abstract String getGrlFrnd(String boyName);
    
    /**
     * Method for displaying details of couples stored
     */
    public void printDetails(){
        for(int i = 0; i <= end; i++)
            cpList[i].printCoupleName();
    }
}
