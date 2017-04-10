/*
 * PPL-Assignment-lit2015007,
 * @author Vaibhav
 */
package com.pplAssignment.examples.inheritance;

import com.pplAssignment.structure.inheritance.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/** Implementation of q5 */

public class q6 {
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
        
        int t;
        //System.out.print("\nEnter t: ");
        t = (int)(Math.random() * 30);
        Scanner sc = new Scanner(System.in);
        
        int days[] = new int[t];
        boolean marked[] = new boolean [1000];
        int brkup = 0;
        //System.out.println("Enter days to mark");
        for(int i = 0; i < t; i++){
            //days[i] = sc.nextInt();
            days[i] = i;
        }
        Arrays.sort(days);
        
        for(int i = 0; i < t; i++){
            brkup = 0;
            for(int k = 0; k < marked.length; k++)
                marked[k] = false;
            System.out.print("\nAfter Day " + days[i]);
            System.out.println(" Couples with happiness less than " + t + " are -");
            
            for(int j = 0; j < staticFunctions.length(cpList); j++){
                if(cpList[j].getHpns() < t){
                    cpList[j].printCoupleName();
                    cpList[j].breakup();
                    marked[j] = true;
                    brkup++;
                }
            }
            if (brkup > 0)  {
                System.out.println("\nAfter re-assignment of boyfriends, new couples are - ");
                for(int j = 0; j < staticFunctions.length(cpList); j++){
                    if(marked[j] == true){
                        mhBoy = cpList[j].grlC.reMatch(boySet);
                        if(mhBoy != null)  cpList[j] = new couple(mhBoy, cpList[j].grlC, giftSet);
                        cpList[j].printCoupleName();
                    }
                }
            }
            
        }
    }
}