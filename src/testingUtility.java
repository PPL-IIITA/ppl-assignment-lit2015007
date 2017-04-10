/*
 * PPL-Assignment-lit2015007,
 * @author Vaibhav
 */
package com.pplAssignment.main;

import com.pplAssignment.structure.inheritance.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;

/**
 * Testing Utility Generates random boys, girls and gifts and stores them in corresponding CSV files.
 */
public class testingUtility {
    /**
     * Runs the testing utility
     * @param length No of items you want to generate in CSV file.
     * @throws FileNotFoundException If CSV files are not there.
     */
    public static void run(int length) throws FileNotFoundException{
        
        Random rand = new Random();
        PrintStream ps;
        PrintStream console = System.out;
        
        ps = new PrintStream(new File("boy.csv"));        
        System.setOut(ps);
        String type = "";
        
        for (int i = 0; i < length; i++) {
            switch(rand.nextInt(3)){
                case 0:
                    type = "miser";
                    break;
                case 1:
                    type = "generous";
                    break;
                case 2:
                    type = "geeks";
                    break;
            }   
            System.out.println(type+","+rand.nextInt(20)+1+","+"boy"+i+","+rand.nextInt(40)+1+","+rand.nextInt(40)+1+","+rand.nextInt(5000)+1);
        }
        
        ps = new PrintStream(new File("girl.csv"));        
        System.setOut(ps);
        
        String crit = "";
        
        for (int i = 0; i < length; i++) {
            switch(rand.nextInt(3)){
                case 0:
                    type = "choosy";
                    break;
                case 1:
                    type = "desperate";
                    break;
                case 2:
                    type = "normal";
                    break;
            }  
            
            switch(rand.nextInt(3)){
                case 0:
                    crit = "most attractive";
                    break;
                case 1:
                    crit = "most intelligent";
                    break;
                case 2:
                    crit = "most rich";
                    break;
            }
            System.out.println(type+","+crit+","+"girl"+i+","+rand.nextInt(40)+1+","+rand.nextInt(40)+1+","+rand.nextInt(5000)+1);
        }
        
        ps = new PrintStream(new File("gift.csv"));        
        System.setOut(ps);
        
        for (int i = 0; i < length; i++) {
            switch(rand.nextInt(3)){
                case 0:
                    System.out.println("essentialGift"+","+"gift"+i+","+rand.nextInt(500)+1+","+rand.nextInt(10)+1);
                    break;
                case 1:
                    System.out.println("luxuryGift"+","+"gift"+i+","+rand.nextInt(10)+1+","+rand.nextInt(20)+1+","+rand.nextInt(3000)+1+","+rand.nextInt(30)+1);
                    break;
                case 2:
                    System.out.println("utilityGift"+","+"gift"+i+","+rand.nextInt(10)+1+","+"class"+rand.nextInt(10)+1+","+rand.nextInt(500)+1+","+rand.nextInt(20)+1);
                    break;
            }
        }
        
        System.setOut(console);
        
    }
}
