/*
 * PPL-Assignment-lit2015007,
 * @author Vaibhav
 */
package com.pplAssignment.examples.inheritance;

import com.pplAssignment.structure.inheritance.*;
import java.io.IOException;

/** Implementation of q8 */

public class q8 {
    public static void run() throws IOException{
        int idx;
        gift []giftSet = new gift[1000];
        boy []boySet = new boy[1000];
        girl []girlSet = new girl[1000];
        
        staticFunctions.fillLists8(boySet, girlSet, giftSet);
        
        couple cpList[] = new couple[1000];
        idx = 0;
        boy mhBoy;
        for(girl grl : girlSet){
            if(grl == null)  break;
            mhBoy = grl.getMatch(boySet);
            if(mhBoy != null)   cpList[idx++] = new couple(mhBoy, grl, giftSet);           
        }
        
        for(couple item : cpList){
            if(item == null)    break;
            item.printCoupleName();
        }
    }
            
}
