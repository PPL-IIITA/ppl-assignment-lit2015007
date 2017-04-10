/*
 * PPL-Assignment-lit2015007
 * @author Vaibhav
 */
package com.pplAssignment.structure.inheritance;

import com.pplAssignment.examples.inheritance.staticFunctions;

/**
 * Random data structure as demanded in q10
 * @param <T> Type of Random data structure. Either Boy, Girl or Gift
 */
public class random <T>{
    
    /**
     * Set of members. Either Boy, Girl or Gift
     */
    public T array[];
    
    
    int fetchLimit;

    /**
     * Constructor for Random
     * @param array Set of members you need to fill in random data structure.
     */
    public random(T array[]) {
        this.array = array;
        fetchLimit = staticFunctions.length(array) - 1;
    }
    
    /**
     * Getter for Random data structure
     * @return Random member not fetched before.
     */
    public T fetch(){
        int i ;
        T temp;
        while(true){
            i = (int) (Math.random() * fetchLimit);
            if(i >= 0 && fetchLimit >= 0 && array[i] != null){
                temp = array[i];
                array[i] = array[fetchLimit];
                array[fetchLimit] = temp;
                this.fetchLimit--;
                return temp;
            }
        }
    }
    
}
