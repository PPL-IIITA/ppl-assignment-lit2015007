/*
 * PPL-Assignment-lit2015007,
 * @author Vaibhav
 */
package com.pplAssignment.examples.basic;

import com.pplAssignment.structure.basic.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/** Implementation of q2 */
public class q2 {
        
        /**
         * Performs the required operations for q2
         */
        public static void run(){
        _essentialGift []eGifts = new _essentialGift[10];
        _luxuryGift []lGifts = new _luxuryGift[10];
        _utilityGift []uGifts = new _utilityGift[10];
        _couple []cplList = new _couple[100];
        int cpIdx = 0;
        
        String esGiftFile = "essentialGift.csv";
        int idx = 0;
        String line;
        try(BufferedReader br = new BufferedReader(new FileReader(esGiftFile))){
            while((line = br.readLine()) != null)
            {
                String []data = line.split(",");
                eGifts[idx++] = new _essentialGift(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));
            }
        } catch (IOException ex) {
            Logger.getLogger(q1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String utGiftFile = "utilityGift.csv";
        idx = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(utGiftFile))){
            while((line = br.readLine()) != null)
            {
                String []data = line.split(",");
                uGifts[idx++] = new _utilityGift(data[0], Integer.parseInt(data[1]), data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]));
            }
        } catch (IOException ex) {
            Logger.getLogger(q1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String lGiftFile = "luxuryGift.csv";
        idx = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(lGiftFile))){
            while((line = br.readLine()) != null)
            {
                String []data = line.split(",");
                lGifts[idx++] = new _luxuryGift(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]));
            }
        } catch (IOException ex) {
            Logger.getLogger(q1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        _miser []mBoys = new _miser[10];
        _generous []genBoys = new _generous[10];
        _geeks []gkBoys = new _geeks[10];
        
        
        
        String miserFile = "miser.csv";
        idx = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(miserFile))){
            while((line = br.readLine()) != null)
            {
                String []data = line.split(",");
                mBoys[idx++] = new _miser(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]));
            }
        } catch (IOException ex) {
            Logger.getLogger(q1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String generousFile = "generous.csv";
        idx = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(generousFile))){
            while((line = br.readLine()) != null)
            {
                String []data = line.split(",");
                genBoys[idx++] = new _generous(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]));
            }
        } catch (IOException ex) {
            Logger.getLogger(q1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String geeksFile = "geeks.csv";
        idx = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(geeksFile))){
            while((line = br.readLine()) != null)
            {
                String []data = line.split(",");
                gkBoys[idx++] = new _geeks(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]));
            }
        } catch (IOException ex) {
            Logger.getLogger(q1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        _choosy cGirls[] = new _choosy[10];
        _normal nGirls[] = new _normal[10];
        _desperate dGirls[] = new _desperate[10];
        
        
        
        String choosyFile = "choosy.csv";
        idx = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(choosyFile))){
            while((line = br.readLine()) != null)
            {
                String []data = line.split(",");
                cGirls[idx++] = new _choosy(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]));
            }
        } catch (IOException ex) {
            Logger.getLogger(q1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String normalFile = "normal.csv";
        idx = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(normalFile))){
            while((line = br.readLine()) != null)
            {
                String []data = line.split(",");
                nGirls[idx++] = new _normal(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]));
            }
        } catch (IOException ex) {
            Logger.getLogger(q1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String desperateFile = "desperate.csv";
        idx = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(desperateFile))){
            while((line = br.readLine()) != null)
            {
                String []data = line.split(",");
                dGirls[idx++] = new _desperate(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]));
            }
        } catch (IOException ex) {
            Logger.getLogger(q1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(_choosy grl : cGirls)
        {
            if(grl == null) break;
            cplList[cpIdx++] = grl.makeCouple(mBoys, genBoys, gkBoys, eGifts, uGifts, lGifts);            
        }
        
        for(_normal grl : nGirls)
        {
            if(grl == null) break;
            cplList[cpIdx++] = grl.makeCouple(mBoys, genBoys, gkBoys, eGifts, uGifts, lGifts);     
            
        }
        
        for(_desperate grl : dGirls)
        {
            if(grl == null) break;
            cplList[cpIdx++] = grl.makeCouple(mBoys, genBoys, gkBoys, eGifts, uGifts, lGifts);     
            
        }  
        
        for(_couple item : cplList){
            if(item == null)    break;
            item.display();
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        
        
        System.out.println(k + " Most happiest couples are: \n");
        int n = _staticFunctions.length(cplList);
        cplList = _staticFunctions.sortBy(cplList, "happiness");
        for(int i = n-1 ; i>=n-k; i-- ){
            cplList[i].displayName();
        }
        
        System.out.println("Best " + k + " most compatible couples are: \n");
        cplList = _staticFunctions.sortBy(cplList, "compatibility");
        for(int i = n-1 ; i>=n-k; i-- ){
            cplList[i].displayName();
        }
        
    }
}
