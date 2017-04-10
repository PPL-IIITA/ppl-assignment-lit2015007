/*
 * PPL-Assignment-lit2015007,
 * @author Vaibhav
 */
package com.pplAssignment.examples.inheritance;

import com.pplAssignment.structure.inheritance.*;
import java.io.IOException;

/** Implementation of q7 */

public class q7 {
    public static void run() throws IOException{
        gift []giftSet = new gift[1000];
        boy []boySet = new boy[1000];
        girl []girlSet = new girl[1000];
        
        staticFunctions.fillLists(boySet, girlSet, giftSet);
        
        coupleSet cpSet;
        
        cpSet = new coupleSetHashTable();
        
        boy mhBoy;
        for(girl grl : girlSet){
            if(grl == null)  break;
            mhBoy = grl.getMatch(boySet);
            if(mhBoy != null)    cpSet.addCouple(new couple(mhBoy, grl, giftSet));         
        }

        /**
         * List of Boys for which we need to print their girlfriends
         */
        String []boyList = new String[1000];
        
        staticFunctions.randomNames(boyList);    
        
        for(int i = 0; i < staticFunctions.length(boyList); i++)
            System.out.println("Girlfriend of " + boyList[i] + " is: " + cpSet.getGrlFrnd(boyList[i]));
        
    }
            
}
