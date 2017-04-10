/*
 * PPL-Assignment-lit2015007,
 * @author Vaibhav
 */

package com.pplAssignment.main;

import com.pplAssignment.examples.basic.*;
import com.pplAssignment.examples.inheritance.*;
import java.io.IOException;

/** Main class for testing examples */

public class Main {

    /**
     * Main function which runs the desired question.
     * @param args Question number you want to run. Example: q1 for question 1.
     * @throws java.io.IOException In case log can't be written
     */
    public static void main(String []args) throws IOException {
        
        testingUtility.run(10);
        switch(args[0]){
            case "q1":
                q1.run();
                return;
            case "q2":
                q2.run();
                return;
            case "q3":
                q3.run();
                return;
            case "q4":
                q4.run();
                return;
            case "q5":
                q5.run();
                return;
            case "q6":
                q6.run();
                return;
            case "q7":
                q7.run();
                return;
            case "q8":
                q8.run();
                return;
            case "q9":
                return;
            case "q10":
                q10.run();
                return;
        }
    }
    
}
