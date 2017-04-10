/*
 * PPL-Assignment-lit2015007,
 * @author Vaibhav
 */
package com.pplAssignment.examples.inheritance;

import com.pplAssignment.structure.inheritance.*;
import java.io.IOException;
import java.util.Scanner;

/** Implementation of q4 */

public class q4 {
    public static void run() throws IOException{
        int idx;
        gift []giftSet = new gift[1000];
        boy []boySet = new boy[1000];
        girl []girlSet = new girl[1000];
        
        staticFunctions.fillLists(boySet, girlSet, giftSet);
        
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
        
        Scanner sc = new Scanner(System.in);
        int n = staticFunctions.length(cpList) , k;
        while(true){
            //System.out.print("Enter k: ");
            //k = sc.nextInt();
            k = (int)(Math.random() * n);
            if(k<=n) break;
            //System.out.println("Not a valid k\n");
        }
        
        cpList = staticFunctions.sortBy(cpList, "happiness");
        
        System.out.println("\nLeast " + k + " happy couples are:");
        for(int i = 0; i < k; i++){
            cpList[i].printCoupleName();
            cpList[i].breakup();
        }
        
        System.out.println("\nAssigning them new boyfriends");
        for(int i = 0; i < k; i++){
            mhBoy = cpList[i].grlC.reMatch(boySet);
            if(mhBoy != null)  cpList[i] = new couple(mhBoy, cpList[i].grlC, giftSet);
            cpList[i].printCoupleName();
        }
            
        
    }
            
}
