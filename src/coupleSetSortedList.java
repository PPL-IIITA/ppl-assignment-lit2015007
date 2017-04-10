/*
 * PPL-Assignment-lit2015007,
 * @author Vaibhav
 */
package com.pplAssignment.structure.inheritance;

import com.pplAssignment.examples.inheritance.staticFunctions;

/** Data Structure storing Couples in Sorted Array*/

public class coupleSetSortedList extends coupleSet{
       
    /**
     * Constructor for Couple Set Sorted List
     */
    public coupleSetSortedList() {
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
        cpList = staticFunctions.sortBy(cpList, "lexicographic");
        
    }
    
    /**
     * Method for finding girlfriend of given boy
     * @param boyName Name of the Boy.
     * @return Name of the girlfriend of given boy if any.
     */
    @Override
    public String getGrlFrnd(String boyName){
        int l = 0;
        int h = this.end;
        int middle;
        while(l<=h){
            middle = (l + h)/2;
            if(boyName.compareTo(this.cpList[middle].boyC.name) == 0)
                return this.cpList[middle].grlC.name;
            else if (boyName.compareTo(this.cpList[middle].boyC.name) < 0)
                h = middle - 1;
            else
                l = middle + 1;           
        }
        return null;
        
    }
    
}
