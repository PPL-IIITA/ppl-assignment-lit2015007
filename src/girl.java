/*
 * PPL-Assignment-lit2015007
 * @author Vaibhav
 */

package com.pplAssignment.structure.inheritance;

import com.pplAssignment.examples.inheritance.staticFunctions;


/** 
 * Class for Girls.
 * Superclass: person.
 */

public abstract class girl extends person{
   
    /**
     * Criterion of choosing the boy to date.
     * Either of: most attractive, most rich or most intelligent.
     */
    public String crit; 
    
    /**
     * Boyfriend of girl when committed.
     */
    boy boyfrnd;

    /**
     * Constructor for Girl
     * @param crit Criterion of choosing the boy to date. Either of: most attractive, most rich or most intelligent.
     * @param name Name
     * @param att Attractiveness
     * @param iLevel intelligence Level
     * @param Budget Maintenance Budget
     */
    public girl(String crit, String name, int att, int iLevel, int Budget) {
        super(name, att, iLevel, Budget);
        this.crit = crit;
        this.boyfrnd = null;
    }  
    
    /**
     * Match Finder for girl
     * @param boySet Set of available boys
     * @return perfectly matched boy
     */
    public boy getMatch(boy boySet[]){
        boy []boyList = new boy[10000];
        int idx = 0;
        for(boy item : boySet){
            if(item == null)    break;
            boyList[idx++] = item;
        }
        boyList = (boy[]) staticFunctions.sortBy(boyList, this.crit);       
            
        for(int i = staticFunctions.length(boyList)-1; i>=0; i--){
            if(boyList[i].cmtd == false && boyList[i].Budget >= this.Budget && this.att >= boyList[i].minAttr )
                return boyList[i];
        }
        return null;
    }
    
    /**
     * Re-Match Finder for girl after breakup
     * @param boySet Set of available boys
     * @return perfectly matched boy not matching previous boyfriend
     */
    public boy reMatch(boy boySet[]){
        boy []boyList = new boy[10000];
        int idx = 0;
        for(boy item : boySet){
            if(item == null)    break;
            boyList[idx++] = item;
        }
        boyList = (boy[]) staticFunctions.sortBy(boyList, this.crit);       
            
        for(int i = staticFunctions.length(boyList)-1; i>=0; i--){
            if(boyList[i].cmtd == false && boyList[i].Budget >= this.Budget && this.att >= boyList[i].minAttr && !boyList[i].name.equals(this.boyfrnd.name) )
                return boyList[i];
        }
        return null;
    }
}
