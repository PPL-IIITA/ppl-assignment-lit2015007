/*
 * PPL-Assignment-lit2015007,
 * @author Vaibhav
 */
package com.pplAssignment.examples.inheritance;

import com.pplAssignment.structure.inheritance.*;
import java.io.IOException;
import java.util.Scanner;

/** Implementation of q5 */

public class q5 {
    public static void run() throws IOException{
        int idx;
        gift []giftSet = new gift[1000];
        boy []boySet = new boy[1000];
        girl []girlSet = new girl[1000];
        
        staticFunctions.fillLists(boySet, girlSet, giftSet);
        
        boySet = (boy []) staticFunctions.sortBy(boySet, "most attractive");
        girlSet = (girl []) staticFunctions.sortBy(girlSet, "most rich");

        couple cpList[] = new couple[1000];
        idx = 0;
        boy mhBoy;
        girl mhGirl;
        int bIdx = 0, gIdx = 0;
               
        while(bIdx < staticFunctions.length(boySet) && gIdx < staticFunctions.length(girlSet)){
            
            if(girlSet[gIdx].cmtd == false){
                mhBoy = girlSet[gIdx].getMatch(boySet);
                if(mhBoy != null)   cpList[idx++] = new couple(mhBoy, girlSet[gIdx], giftSet);
            }
            gIdx++;
            
            if(boySet[bIdx].cmtd == false){
                mhGirl = boySet[bIdx].getMatch(girlSet);
                if(mhGirl != null)  cpList[idx++] = new couple(boySet[bIdx], mhGirl, giftSet);
            }
            bIdx++;
            
        }
        
        for(couple item : cpList){
            if(item == null)    break;
            item.printCoupleName();
        }
        
        Scanner sc = new Scanner(System.in);
        int n = staticFunctions.length(cpList) , k;
        while(true){
            //System.out.print("Enter k: ");
            //k = sc.nextInt();
            k = (int)(Math.random() * n);
            if(k<=n) break;
            //System.out.println("Not a valid k\n");
        }
        
        System.out.println("\n" + k + " Most happiest couples are:");
        
        cpList = staticFunctions.sortBy(cpList, "happiness");
        for(int i = n-1 ; i>=n-k ; i-- ){
            cpList[i].printCoupleName();
        }
        
    }
            
}
