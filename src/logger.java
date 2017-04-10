/*
 * PPL-Assignment-lit2015007,
 * @author Vaibhav
 */
package com.pplAssignment.main;

import com.pplAssignment.structure.inheritance.*;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Logging Utility
 */
public class logger {

    static {
        try {
            new FileWriter("log.txt").close();
        } catch (IOException ex) {
            Logger.getLogger(logger.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    /**
     * Method to make a log for commitment
     * @param cp Couple performing patch up
     * @throws IOException In case log can't be generated
     */
    public static void patchupLog(couple cp) throws IOException{
        PrintStream ps = new PrintStream(new FileOutputStream("log.txt",true));
        PrintStream console = System.out;
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Calendar calobj = Calendar.getInstance();
        System.setOut(ps);
        System.out.println("Commitment ----------------------------------------------------------------------------------" + df.format(calobj.getTime()));
        System.out.println();
        cp.printCouple();   
        System.out.println("**********************************************************************************************************************");
        System.out.println();
        System.out.println();
        System.setOut(console);        
    }
    
    /**
     * Method to make a log for break up
     * @param cp Couple performing break up
     * @throws IOException In case log can't be generated
     */
    public static void breakupLog(couple cp) throws IOException{
        PrintStream ps = new PrintStream(new FileOutputStream("log.txt",true));
        PrintStream console = System.out;
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Calendar calobj = Calendar.getInstance();
        System.setOut(ps);
        System.out.println("Break Up ------------------------------------------------------------" + df.format(calobj.getTime()));
        cp.printCoupleName();  
        System.out.println("**********************************************************************************************************************");
        System.out.println();
        System.out.println();
        System.setOut(console);        
    }
}
