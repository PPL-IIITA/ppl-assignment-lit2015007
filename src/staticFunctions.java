/*
 * PPL-Assignment-lit2015007,
 * @author Vaibhav
 */

package com.pplAssignment.examples.inheritance;

import com.pplAssignment.structure.inheritance.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/** Class of Static Functions */

public class staticFunctions {
    
    /**
     * Sorts the gift list by cost.
     * @param gList Gift list
     * @return Sorted Gift list
     */
    public static gift[] sortByCost(gift []gList){
        int i, j;
        gift temp;
        int n = staticFunctions.length(gList);
        for (i = 0; i < n-1; i++){    
            // Last i elements are already in place   
            for (j = 0; j < n-i-1; j++){ 
                if (gList[j].price > gList[j+1].price){
                   temp = gList[j];
                   gList[j] = gList[j+1];
                   gList[j+1] = temp;
                }
            }
        }
        return gList;
    }
    
    /**
     * Sorts person List by given attribute.
     * Either of most attractive, most intelligent or most rich.
     * @param pList Person list
     * @param attribute Attribute to sort by
     * @return Sorted Person list
     */
    public static person[] sortBy(person []pList, String attribute){
        int i, j;
        person temp;
        int n = staticFunctions.length(pList);
        switch(attribute){
            case "most attractive":
                for (i = 0; i < n-1; i++){     
                    // Last i elements are already in place   
                    for (j = 0; j < n-i-1; j++){
                        if (pList[j].att > pList[j+1].att){
                            temp = pList[j];
                            pList[j] = pList[j+1];
                            pList[j+1] = temp;
                        }
                    }
                }
                break;
            case "most intelligent":
                for (i = 0; i < n-1; i++){     
                    // Last i elements are already in place   
                    for (j = 0; j < n-i-1; j++){
                        if (pList[j].iLevel > pList[j+1].iLevel){
                            temp = pList[j];
                            pList[j] = pList[j+1];
                            pList[j+1] = temp;
                        }
                    }
                }
                break;
            case "most rich":
                for (i = 0; i < n-1; i++){      
                    // Last i elements are already in place   
                    for (j = 0; j < n-i-1; j++){ 
                        if (pList[j].Budget > pList[j+1].Budget){
                            temp = pList[j];
                            pList[j] = pList[j+1];
                            pList[j+1] = temp;
                        }
                    }
                }
                break;
            
                
        }
        return pList;
    }
    
    
    
    
    
    
    /**
     * Length function for List
     * @param <T> Type of List
     * @param list List
     * @return Length of List
     */
    public static <T> int length(T []list){
        int len = 0;
        for(T item:list){
            if(item == null)    break;
            len++;
        }
        return len;
    }
    
    
    /**
     * Fills the lists of Boys, Girls, Gifts by fetching data from CSV Files.
     * @param boySet Boy List
     * @param girlSet Girl List
     * @param giftSet Gift List
     */
    public static void fillLists(boy []boySet, girl []girlSet, gift []giftSet){
        String giftFile = "gift.csv";
        int idx = 0;
        String line;
        
        try(BufferedReader br = new BufferedReader(new FileReader(giftFile))){
            while((line = br.readLine()) != null)
            {
                String []data = line.split(",");
                switch (data[0]){
                    case "essentialGift":
                        giftSet[idx++] = new essentialGift(data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]));
                        break;
                    case "utilityGift":
                        giftSet[idx++] = new utilityGift(data[1], Integer.parseInt(data[2]), data[3], Integer.parseInt(data[4]), Integer.parseInt(data[5]));
                        break;
                    case "luxuryGift":
                        giftSet[idx++] = new luxuryGift(data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]));
                        break;
                }
                
            }
        } catch (IOException ex) {
            Logger.getLogger(q3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String boyFile = "boy.csv";
        idx = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(boyFile))){
            while((line = br.readLine()) != null)
            {
                String []data = line.split(",");
                switch(data[0]){
                    case "miser":
                        boySet[idx++] = new miser(Integer.parseInt(data[1]), data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]));
                        break;
                    case "generous":
                        boySet[idx++] = new generous(Integer.parseInt(data[1]), data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]));
                        break;
                    case "geeks":
                        boySet[idx++] = new geeks(Integer.parseInt(data[1]), data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]));
                        break;
                            
                } 
                
            }
        } catch (IOException ex) {
            Logger.getLogger(q3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String girlFile = "girl.csv";
        idx = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(girlFile))){
            while((line = br.readLine()) != null)
            {
                String []data = line.split(",");
                switch(data[0]){
                    case "choosy":
                        girlSet[idx++] = new choosy(data[1], data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]));
                        break;
                    case "normal":
                        girlSet[idx++] = new normal(data[1], data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]));
                        break;
                    case "desperate":
                        girlSet[idx++] = new desperate(data[1], data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]));
                        break;
                            
                } 
                
            }
        } catch (IOException ex) {
            Logger.getLogger(q3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Sorts couple List by given attribute.
     * Either of most happiest, most compatible or lexicographic according to boy name.
     * @param cpList couple list
     * @param attribute Attribute to sort by
     * @return Sorted couple list
     */
    public static couple[] sortBy(couple []cpList, String attribute){
        int i, j;
        couple temp;
        int n = staticFunctions.length(cpList);
        switch(attribute){
            case "happiness":
                for (i = 0; i < n-1; i++){     
                    // Last i elements are already in place   
                    for (j = 0; j < n-i-1; j++){
                        if (cpList[j].getHpns() > cpList[j+1].getHpns()){
                            temp = cpList[j];
                            cpList[j] = cpList[j+1];
                            cpList[j+1] = temp;
                        }
                    }
                }
                break;
            case "compatibility":
                for (i = 0; i < n-1; i++){     
                    // Last i elements are already in place   
                    for (j = 0; j < n-i-1; j++){
                        if (cpList[j].getCmptbl() > cpList[j+1].getCmptbl()){
                            temp = cpList[j];
                            cpList[j] = cpList[j+1];
                            cpList[j+1] = temp;
                        }
                    }
                }
                break;
            case "lexicographic":
                for (i = 0; i < n-1; i++){     
                    // Last i elements are already in place   
                    for (j = 0; j < n-i-1; j++){
                        if (cpList[j].boyC.name.compareTo(cpList[j+1].boyC.name) > 0){
                            temp = cpList[j];
                            cpList[j] = cpList[j+1];
                            cpList[j+1] = temp;
                        }
                    }
                }
                break;
                
                           
        }
        return cpList;
    }
    
    /**
     * Modified fillList for q10.
     * @param boySet Boy List
     * @param girlSet Girl List
     * @param giftSet Gift List
     */
    public static void fillLists10(boy []boySet, girl []girlSet, gift []giftSet){
        String giftFile = "gift.csv";
        int idx = 0;
        String line;
        
        try(BufferedReader br = new BufferedReader(new FileReader(giftFile))){
            while((line = br.readLine()) != null)
            {
                String []data = line.split(",");
                switch (data[0]){
                    case "essentialGift":
                        giftSet[idx++] = new essentialGift(data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]));
                        break;
                    case "utilityGift":
                        giftSet[idx++] = new utilityGift(data[1], Integer.parseInt(data[2]), data[3], Integer.parseInt(data[4]), Integer.parseInt(data[5]));
                        break;
                    case "luxuryGift":
                        giftSet[idx++] = new luxuryGift(data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]));
                        break;
                }
                
            }
        } catch (IOException ex) {
            Logger.getLogger(q3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String boyFile = "boy.csv";
        idx = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(boyFile))){
            while((line = br.readLine()) != null)
            {
                String []data = line.split(",");
                switch(data[0]){
                    case "miser":
                        boySet[idx++] = new miser10(Integer.parseInt(data[1]), data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]));
                        break;
                    case "generous":
                        boySet[idx++] = new generous10(Integer.parseInt(data[1]), data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]));
                        break;
                    case "geeks":
                        boySet[idx++] = new geeks10(Integer.parseInt(data[1]), data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]));
                        break;
                            
                } 
                
            }
        } catch (IOException ex) {
            Logger.getLogger(q3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String girlFile = "girl.csv";
        idx = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(girlFile))){
            while((line = br.readLine()) != null)
            {
                String []data = line.split(",");
                switch(data[0]){
                    case "choosy":
                        girlSet[idx++] = new choosy(data[1], data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]));
                        break;
                    case "normal":
                        girlSet[idx++] = new normal(data[1], data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]));
                        break;
                    case "desperate":
                        girlSet[idx++] = new desperate(data[1], data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]));
                        break;
                            
                } 
                
            }
        } catch (IOException ex) {
            Logger.getLogger(q3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Modified fillList for q8.
     * @param boySet Boy List
     * @param girlSet Girl List
     * @param giftSet Gift List
     */
    public static void fillLists8(boy []boySet, girl []girlSet, gift []giftSet){
        String giftFile = "gift.csv";
        int idx = 0;
        String line;
        
        try(BufferedReader br = new BufferedReader(new FileReader(giftFile))){
            while((line = br.readLine()) != null)
            {
                String []data = line.split(",");
                switch (data[0]){
                    case "essentialGift":
                        giftSet[idx++] = new essentialGift(data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]));
                        break;
                    case "utilityGift":
                        giftSet[idx++] = new utilityGift(data[1], Integer.parseInt(data[2]), data[3], Integer.parseInt(data[4]), Integer.parseInt(data[5]));
                        break;
                    case "luxuryGift":
                        giftSet[idx++] = new luxuryGift(data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]));
                        break;
                }
                
            }
        } catch (IOException ex) {
            Logger.getLogger(q3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String boyFile = "boy.csv";
        idx = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(boyFile))){
            while((line = br.readLine()) != null)
            {
                String []data = line.split(",");
                switch(data[0]){
                    case "miser":
                        boySet[idx++] = new miser8(Integer.parseInt(data[1]), data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]));
                        break;
                    case "generous":
                        boySet[idx++] = new generous8(Integer.parseInt(data[1]), data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]));
                        break;
                    case "geeks":
                        boySet[idx++] = new geeks8(Integer.parseInt(data[1]), data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]));
                        break;
                            
                } 
                
            }
        } catch (IOException ex) {
            Logger.getLogger(q3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String girlFile = "girl.csv";
        idx = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(girlFile))){
            while((line = br.readLine()) != null)
            {
                String []data = line.split(",");
                switch(data[0]){
                    case "choosy":
                        girlSet[idx++] = new choosy(data[1], data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]));
                        break;
                    case "normal":
                        girlSet[idx++] = new normal(data[1], data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]));
                        break;
                    case "desperate":
                        girlSet[idx++] = new desperate(data[1], data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]));
                        break;
                            
                } 
                
            }
        } catch (IOException ex) {
            Logger.getLogger(q3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Generate random boys names to test in question 7
     * @param boyList Array to be filled with boy's names
     */
    public static void randomNames(String boyList[]){
        /**
         * How many boys to test
         */
        int lenght = 20;
        Random rand = new Random();
        for(int i = 0; i<lenght; i++)
            boyList[i] = "boy"+rand.nextInt(100);
    }
}
