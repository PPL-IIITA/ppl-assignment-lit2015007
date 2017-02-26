/*
 * PPL-Assignment-lit2015007,
 * @author Vaibhav
 */

package com.pplAssignment.examples.withoutInheritance;

import com.pplAssignment.structure.withoutInheritance.*;

/** Class of Static Functions */

public class staticFunctions {
    
    /**
     * Sorts the essential gift list by cost.
     * @param gList Gift list
     * @return Sorted Gift list
     */
    public static essentialGift[] sortByCost(essentialGift []gList){
        int i, j;
        essentialGift temp;
        int n = staticFunctions.length(gList);
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
     * Sorts the utility gift list by cost.
     * @param gList Gift list
     * @return Sorted Gift list
     */
    public static utilityGift[] sortByCost(utilityGift []gList){
        int i, j;
        utilityGift temp;
        int n = staticFunctions.length(gList);
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
     * Sorts the luxury gift list by cost.
     * @param gList Gift list
     * @return Sorted Gift list
     */
    public static luxuryGift[] sortByCost(luxuryGift []gList){
        int i, j;
        luxuryGift temp;
        int n = staticFunctions.length(gList);
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
     * Sorts Miser Boy List by given attribute.
     * Either of most attractive, most intelligent or most rich.
     * @param bList Boy  list
     * @param attribute Attribute to sort by
     * @return Sorted Boy list
     */
    public static miser[] sortBy(miser []bList, String attribute){
        int i, j;
        miser temp;
        int n = staticFunctions.length(bList);
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
     * Sorts Generous Boy List by given attribute.
     * Either of most attractive, most intelligent or most rich.
     * @param bList Boy  list
     * @param attribute Attribute to sort by
     * @return Sorted Boy list
     */
    public static generous[] sortBy(generous []bList, String attribute){
        int i, j;
        generous temp;
        int n = staticFunctions.length(bList);
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
     * Sorts Geeks Boy List by given attribute.
     * Either of most attractive, most intelligent or most rich.
     * @param bList Boy  list
     * @param attribute Attribute to sort by
     * @return Sorted Boy list
     */
    public static geeks[] sortBy(geeks []bList, String attribute){
        int i, j;
        geeks temp;
        int n = staticFunctions.length(bList);
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
     * Length function for essential Gift list
     * @param gList Gift List
     * @return Length of Gift List
     */
    public static int length(essentialGift []gList){
        int len = 0;
        for(essentialGift item:gList){
            if(item == null)    break;
            len++;
        }
        return len;
    }
    
    /**
     * Length function for utility Gift list
     * @param gList Gift List
     * @return Length of Gift List
     */
    public static int length(utilityGift []gList){
        int len = 0;
        for(utilityGift item:gList){
            if(item == null)    break;
            len++;
        }
        return len;
    }
    
    /**
     * Length function for luxury Gift list
     * @param gList Gift List
     * @return Length of Gift List
     */
    public static int length(luxuryGift []gList){
        int len = 0;
        for(luxuryGift item:gList){
            if(item == null)    break;
            len++;
        }
        return len;
    }
    
    /**
     * Length function for Miser Boy list
     * @param bList Boy list
     * @return Length of Boy list
     */
    public static int length(miser []bList){
        int len = 0;
        for(miser item:bList){
            if(item == null)    break;
            len++;
        }
        return len;
    }
    
    /**
     * Length function for Generous Boy list
     * @param bList Boy list
     * @return Length of Boy list
     */
    public static int length(generous []bList){
        int len = 0;
        for(generous item:bList){
            if(item == null)    break;
            len++;
        }
        return len;
    }
    
    /**
     * Length function for Geeks Boy list
     * @param bList Boy list
     * @return Length of Boy list
     */
    public static int length(geeks []bList){
        int len = 0;
        for(geeks item:bList){
            if(item == null)    break;
            len++;
        }
        return len;
    }
    
    /**
     * Sorts Couple List by given attribute.
     * Either of compatibility or happiness.
     * @param cpList Couple List
     * @param attribute Attribute to sort by
     * @return Sorted Couple list
     */    
    public static couple[] sortBy(couple []cpList, String attribute){
        int i, j;
        couple temp;
        int n = staticFunctions.length(cpList);
        switch(attribute){
            case "compatibility":
                                   
                for (i = 0; i < n-1; i++){     
                    // Last i elements are already in place   
                    for (j = 0; j < n-i-1; j++){
                        
                        if (cpList[j].cmptblt > cpList[j+1].cmptblt){
                            temp = cpList[j];
                            cpList[j] = cpList[j+1];
                            cpList[j+1] = temp;
                        }
                    }
                }
                
                break;
            case "happiness":
                for (i = 0; i < n-1; i++){     
                    // Last i elements are already in place   
                    for (j = 0; j < n-i-1; j++){
                        if (cpList[j].hpns > cpList[j+1].hpns){
                            temp = cpList[j];
                            cpList[j] = cpList[j+1];
                            cpList[j+1] = temp;
                        }
                    }
                }
                break;               
        }
        return cpList;
    }
    
    /**
     * Length function for Couple list
     * @param cpList Couple list
     * @return Length of Couple list
     */
    public static int length(couple []cpList)
    {
        int len =0;
        for(couple item : cpList)
        {
            if(item == null)    break;
            len++;
        }
        return len;
    }
    
    
}
