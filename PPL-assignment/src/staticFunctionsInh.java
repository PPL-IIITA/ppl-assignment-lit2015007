/*
 * PPL-Assignment-lit2015007,
 * @author Vaibhav
 */

package com.pplAssignment.examples.withInheritance;

import com.pplAssignment.strcuture.withInheritance.*;

/** Class of Static Functions */

public class staticFunctionsInh {
    
    /**
     * Sorts the gift list by cost.
     * @param gList Gift list
     * @return Sorted Gift list
     */
    public static giftInh[] sortByCost(giftInh []gList){
        int i, j;
        giftInh temp;
        int n = staticFunctionsInh.length(gList);
        for (i = 0; i < n-1; i++){    
            // Last i elements are already in place   
            for (j = 0; j < n-i-1; j++){ 
                if (gList[j].price/gList[j].value > gList[j+1].price/gList[j+1].value){
                   temp = gList[j];
                   gList[j] = gList[j+1];
                   gList[j+1] = temp;
                }
            }
        }
        return gList;
    }
    
    /**
     * Sorts Boy List by given attribute.
     * Either of most attractive, most intelligent or most rich.
     * @param bList Boy  list
     * @param attribute Attribute to sort by
     * @return Sorted Boy list
     */
    public static boyInh[] sortBy(boyInh []bList, String attribute){
        int i, j;
        boyInh temp;
        int n = staticFunctionsInh.length(bList);
        switch(attribute){
            case "most attractive":
                for (i = 0; i < n-1; i++){     
                    // Last i elements are already in place   
                    for (j = 0; j < n-i-1; j++){
                        if (bList[j].att > bList[j+1].att){
                            temp = bList[j];
                            bList[j] = bList[j+1];
                            bList[j+1] = temp;
                        }
                    }
                }
                break;
            case "most intelligent":
                for (i = 0; i < n-1; i++){     
                    // Last i elements are already in place   
                    for (j = 0; j < n-i-1; j++){
                        if (bList[j].iLevel > bList[j+1].iLevel){
                            temp = bList[j];
                            bList[j] = bList[j+1];
                            bList[j+1] = temp;
                        }
                    }
                }
                break;
            case "most rich":
                for (i = 0; i < n-1; i++){      
                    // Last i elements are already in place   
                    for (j = 0; j < n-i-1; j++){ 
                        if (bList[j].Budget > bList[j+1].Budget){
                            temp = bList[j];
                            bList[j] = bList[j+1];
                            bList[j+1] = temp;
                        }
                    }
                }
                break;
            
                
        }
        return bList;
    }
    
    /**
     * Length function for Gift list
     * @param gList Gift List
     * @return Length of Gift List
     */
    public static int length(giftInh []gList){
        int len = 0;
        for(giftInh item:gList){
            if(item == null)    break;
            len++;
        }
        return len;
    }
    
    /**
     * Length function for Boy list
     * @param bList Boy list
     * @return Length of Boy list
     */
    public static int length(boyInh []bList){
        int len = 0;
        for(boyInh item:bList){
            if(item == null)    break;
            len++;
        }
        return len;
    }
    
    /**
     * Matches a Non-Committed boyInh for given girl 
 from the list of Miser boys, Generous boys, Geek boys.
     * Given the constraints:
 Minimum attraction requirement of boyInh must be satisfied,
 Budget of boyInh must be above or equal to the Maintenance Cost of the girl.
     * @param curG Girl
     * @param mBoys List of Miser Boys
     * @param genBoys List of Generous boys
     * @param gkBoys List of Geek boys
     * @return Perfectly matched non-committed Boy
     */
    public static boyInh matchBoy(girlInh curG, miserInh []mBoys, generousInh []genBoys, geeksInh []gkBoys){
        boyInh []boyList = new boyInh[10000];
        int idx = 0;
        for(boyInh item : mBoys){
            if(item == null)    break;
            boyList[idx++] = item;
        }
        for(boyInh item : genBoys){
            if(item == null)    break;
            boyList[idx++] = item;
        }
        for(boyInh item : gkBoys){
            if(item == null)    break;
            boyList[idx++] = item;
        }
        
        boyList = staticFunctionsInh.sortBy(boyList, curG.crit);
        
            
        for(int i = staticFunctionsInh.length(boyList)-1; i>=0; i--){
            if(boyList[i].cmtd == false && boyList[i].Budget >= curG.Budget && curG.att >= boyList[i].minAttr )
                return boyList[i];
        }
        return null;
    }
    
}
