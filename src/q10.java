/*
 * PPL-Assignment-lit2015007,
 * @author Vaibhav
 */
package com.pplAssignment.examples.inheritance;

import com.pplAssignment.structure.inheritance.*;
import java.io.IOException;
import java.util.Scanner;

/** Implementation of q10 */

public class q10 {
    public static void run() throws IOException{
        int idx;
        gift []giftSet = new gift[1000];
        boy []boySet = new boy[1000];
        girl []girlSet = new girl[100];
        
        staticFunctions.fillLists10(boySet, girlSet, giftSet);
        
        couple cpList[] = new couple[1000];
        idx = 0;
        girl mhGirl;
        for(boy by : boySet){
            if(by == null)  break;
            mhGirl = by.getMatch(girlSet);
            if(mhGirl != null)   cpList[idx++] = new couple(by, mhGirl, giftSet);           
        }
        
        for(couple item : cpList){
            if(item == null)    break;
            item.printCouple();
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
        
        System.out.println("\nBest " + k + " most compatible couples are: ");
        cpList = staticFunctions.sortBy(cpList, "compatibility");
        for(int i = n-1 ; i>=n-k; i-- ){
            cpList[i].printCoupleName();
        }
    }
            
}
