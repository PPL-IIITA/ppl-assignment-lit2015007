/*
 * PPL-Assignment-lit2015007,
 * @author Vaibhav
 */

package com.pplAssignment.main;

import com.pplAssignment.examples.withoutInheritance.*;
//import com.pplAssignment.examples.withoutInheritance.*;

/** Main class for testing examples */

public class Main {

    /**
     * Main function which runs the desired question.
     * @param args Question number you want to run. Example- q1 for question 1.
     */
    public static void main(String []args){
        switch(args[0]){
            case "q1":
                q1.run();
                return;
            case "q2":
                q2.run();
                return;
        }
    }
    
}
