/*
 * PPL-Assignment-lit2015007,
 * @author Vaibhav
 */
package com.pplAssignment.examples.withoutInheritance;

import com.pplAssignment.structure.withoutInheritance.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/** Implementation of q1 */

public class q1 {
    
    /**
     * Performs the required operations for q1.
     */
    public static void run(){
        essentialGift []eGifts = new essentialGift[10];
        luxuryGift []lGifts = new luxuryGift[10];
        utilityGift []uGifts = new utilityGift[10];
        couple []cplList = new couple[100];
        int cpIdx = 0;
        
        String esGiftFile = "essentialGift.csv";
        int idx = 0;
        String line;
        try(BufferedReader br = new BufferedReader(new FileReader(esGiftFile))){
            while((line = br.readLine()) != null)
            {
                String []data = line.split(",");
                eGifts[idx++] = new essentialGift(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));
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
                uGifts[idx++] = new utilityGift(data[0], Integer.parseInt(data[1]), data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]));
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
                lGifts[idx++] = new luxuryGift(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]));
            }
        } catch (IOException ex) {
            Logger.getLogger(q1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        miser []mBoys = new miser[10];
        generous []genBoys = new generous[10];
        geeks []gkBoys = new geeks[10];
        
        
        
        String miserFile = "miser.csv";
        idx = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(miserFile))){
            while((line = br.readLine()) != null)
            {
                String []data = line.split(",");
                mBoys[idx++] = new miser(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]));
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
                genBoys[idx++] = new generous(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]));
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
                gkBoys[idx++] = new geeks(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]));
            }
        } catch (IOException ex) {
            Logger.getLogger(q1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        choosy cGirls[] = new choosy[10];
        normal nGirls[] = new normal[10];
        desperate dGirls[] = new desperate[10];
        
        
        
        String choosyFile = "choosy.csv";
        idx = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(choosyFile))){
            while((line = br.readLine()) != null)
            {
                String []data = line.split(",");
                cGirls[idx++] = new choosy(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]));
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
                nGirls[idx++] = new normal(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]));
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
                dGirls[idx++] = new desperate(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]));
            }
        } catch (IOException ex) {
            Logger.getLogger(q1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
        
        for(choosy grl : cGirls)
        {
            if(grl == null) break;
            cplList[cpIdx++] = grl.makeCouple(mBoys, genBoys, gkBoys, eGifts, uGifts, lGifts);            
        }
        
        for(normal grl : nGirls)
        {
            if(grl == null) break;
            cplList[cpIdx++] = grl.makeCouple(mBoys, genBoys, gkBoys, eGifts, uGifts, lGifts);     
            
        }
        
        for(desperate grl : dGirls)
        {
            if(grl == null) break;
            cplList[cpIdx++] = grl.makeCouple(mBoys, genBoys, gkBoys, eGifts, uGifts, lGifts);     
            
        }  
        
        for(couple item : cplList){
            if(item == null)    break;
            item.display();
        }
    }
}