/*
 * PPL-Assignment-lit2015007,
 * @author Vaibhav
 */

package com.pplAssignment.examples.basic;

import com.pplAssignment.structure.basic.*;

/** Class of Static Functions */

public class _staticFunctions {
    
    /**
     * Sorts the essential gift list by cost.
     * @param gList Gift list
     * @return Sorted Gift list
     */
    public static _essentialGift[] sortByCost(_essentialGift []gList){
        int i, j;
        _essentialGift temp;
        int n = _staticFunctions.length(gList);
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
    public static _utilityGift[] sortByCost(_utilityGift []gList){
        int i, j;
        _utilityGift temp;
        int n = _staticFunctions.length(gList);
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
    public static _luxuryGift[] sortByCost(_luxuryGift []gList){
        int i, j;
        _luxuryGift temp;
        int n = _staticFunctions.length(gList);
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
    public static _miser[] sortBy(_miser []bList, String attribute){
        int i, j;
        _miser temp;
        int n = _staticFunctions.length(bList);
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
    public static _generous[] sortBy(_generous []bList, String attribute){
        int i, j;
        _generous temp;
        int n = _staticFunctions.length(bList);
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
    public static _geeks[] sortBy(_geeks []bList, String attribute){
        int i, j;
        _geeks temp;
        int n = _staticFunctions.length(bList);
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
    public static int length(_essentialGift []gList){
        int len = 0;
        for(_essentialGift item:gList){
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
    public static int length(_utilityGift []gList){
        int len = 0;
        for(_utilityGift item:gList){
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
    public static int length(_luxuryGift []gList){
        int len = 0;
        for(_luxuryGift item:gList){
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
    public static int length(_miser []bList){
        int len = 0;
        for(_miser item:bList){
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
    public static int length(_generous []bList){
        int len = 0;
        for(_generous item:bList){
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
    public static int length(_geeks []bList){
        int len = 0;
        for(_geeks item:bList){
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
    public static _couple[] sortBy(_couple []cpList, String attribute){
        int i, j;
        _couple temp;
        int n = _staticFunctions.length(cpList);
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
    public static int length(_couple []cpList)
    {
        int len =0;
        for(_couple item : cpList)
        {
            if(item == null)    break;
            len++;
        }
        return len;
    }
    
    
}
