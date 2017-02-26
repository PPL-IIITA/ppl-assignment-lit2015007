/*
 * PPL-Assignment-lit2015007
 * @author Vaibhav
 */

package com.pplAssignment.structure.withoutInheritance;

import com.pplAssignment.examples.withoutInheritance.staticFunctions;


/** 
 * Class for Girls of Type : The choosy.
 */
public class choosy {
    
    /**
     * Name will be used as ID.
     * Never be common between any two people.
     */
    public String name; 
    
    /**
     * Attractiveness.
     */
    public int att; 
    
    /**
     * Intelligence Level.
     */   
    public int iLevel; 
    
    /**
     * Budget for buying gifts.
     */
    public int Budget; 
    
    /**
     * Boolean variable for person's current status: Committed or Not.
     * True if Committed else False.
     */
    public boolean cmtd; 
    
    /**
     * Type of girl's Boyfriend. 
     */
    public String boyfrndType; 
    
    /**
     * Criterion of choosing the boy to date.
     * Either of: most attractive, most rich or most intelligent.
     */
    public String crit; 
    
    /**
     * Miser Boyfriend of girl when committed with.
     */
    miser mBoyfrnd;
    
    /**
     * Generous Boyfriend of girl when committed with.
     */
    generous genBoyfrnd;
    
    /**
     * Geek Boyfriend of girl when committed with.
     */
    geeks gkBoyfrnd;
    
    
    /**
     * Gift Basket.
     * Boy gives a Gift Basket to girl when committed,
     * Girl receives a Gift Basket when committed.
     */
    public giftBasket gbasket;
    
    /**
     * Getter for Happiness.
     * Happiness of a choosy is logarithmic of the total cost of gifts achieved over maintenance.
     * @return Happiness of Choosy Girl
     */
    public double getHpns(){
        return Math.log(this.gbasket.getNetCost());
    }
    
    /**
     * Constructor for Choosy
     * @param crit Criterion of choosing the boy to date. Either of: most attractive, most rich or most intelligent.
     * @param name Name
     * @param att Attractiveness
     * @param iLevel intelligence Level
     * @param Budget Maintenance Budget
     */
    public choosy(String crit, String name, int att, int iLevel, int Budget) {
        this.crit = crit;
        this.name = name;
        this.att = att;
        this.iLevel = iLevel;
        this.Budget = Budget;
        this.cmtd = false;
        this.boyfrndType = null;
        this.mBoyfrnd = null;
        this.genBoyfrnd = null;
        this.gkBoyfrnd = null;
        this.gbasket = null;
    }
    
    /**
     * Finds a perfect match for Girl and makes them couple
     * @param mBoys Miser Boy List
     * @param genBoys Generous Boy List
     * @param gkBoys Geek Boy List
     * @param esGifts Essential Gift List
     * @param utGifts Utility Gift List
     * @param lGifts Luxury Gift List
     * @return couple made by Girl
     */
    public couple makeCouple(miser []mBoys, generous []genBoys, geeks []gkBoys, essentialGift []esGifts, utilityGift []utGifts, luxuryGift []lGifts){
              
        miser curMBoy = null;
        generous curGenBoy = null;
        geeks curGkBoy = null;
        
        mBoys = staticFunctions.sortBy(mBoys, this.crit);
        genBoys = staticFunctions.sortBy(genBoys, this.crit);
        gkBoys = staticFunctions.sortBy(gkBoys, this.crit);
        
            
        for(int i = staticFunctions.length(mBoys)-1; i>=0; i--){
            if(mBoys[i].cmtd == false && mBoys[i].Budget >= this.Budget && this.att >= mBoys[i].minAttr ){
                curMBoy = mBoys[i];
            }
        }
        
        for(int i = staticFunctions.length(genBoys)-1; i>=0; i--){
            if(genBoys[i].cmtd == false && genBoys[i].Budget >= this.Budget && this.att >= genBoys[i].minAttr ){
                if(curMBoy != null)
                {
                    if( (this.crit.equals("most attractive") && genBoys[i].att > curMBoy.att)||
                        (this.crit.equals("most intelligent") && genBoys[i].iLevel > curMBoy.iLevel)||
                        (this.crit.equals("most rich") && genBoys[i].Budget > curMBoy.Budget)  ){
                        
                        curMBoy = null;
                        curGenBoy = genBoys[i];
                    }
                        
                }
            }
        }
        
        for(int i = staticFunctions.length(gkBoys)-1; i>=0; i--){
            if(gkBoys[i].cmtd == false && gkBoys[i].Budget >= this.Budget && this.att >= gkBoys[i].minAttr ){
                if(curMBoy != null)
                {
                    if( (this.crit.equals("most attractive") && gkBoys[i].att > curMBoy.att)||
                        (this.crit.equals("most intelligent") && gkBoys[i].iLevel > curMBoy.iLevel)||
                        (this.crit.equals("most rich") && gkBoys[i].Budget > curMBoy.Budget)  ){
                        
                        curMBoy = null;
                        curGkBoy = gkBoys[i];
                    }
                        
                }
                if(curGenBoy != null)
                {
                    if( (this.crit.equals("most attractive") && gkBoys[i].att > curGenBoy.att)||
                        (this.crit.equals("most intelligent") && gkBoys[i].iLevel > curGenBoy.iLevel)||
                        (this.crit.equals("most rich") && gkBoys[i].Budget > curGenBoy.Budget)  ){
                        
                        curGenBoy = null;
                        curGkBoy = gkBoys[i];
                    }
                        
                }
            }
        }
        
        couple cpl = new couple();
        
        if(curMBoy != null)
        {
            this.cmtd = true;
            curMBoy.cmtd = true;
            this.boyfrndType = "The Miser";
            this.mBoyfrnd = curMBoy;
            curMBoy.grlType = "The Choosy";
            curMBoy.chGrlfrnd = choosy.this;
            curMBoy.fillBasket(esGifts, utGifts, lGifts);
            this.gbasket = curMBoy.gbasket;
            cpl.boyName = curMBoy.name;
            cpl.grlName = this.name;
            cpl.hpns = this.coupleHpns();
            cpl.cmptblt = this.coupleCmptbl();
            cpl.gb = this.gbasket;
        }
        
        if(curGenBoy != null)
        {
            this.cmtd = true;
            curGenBoy.cmtd = true;
            this.boyfrndType = "The Generous";
            this.genBoyfrnd = curGenBoy;
            curGenBoy.grlType = "The Choosy";
            curGenBoy.chGrlfrnd = choosy.this;
            curGenBoy.fillBasket(esGifts, utGifts, lGifts);
            this.gbasket = curGenBoy.gbasket;
            cpl.boyName = curGenBoy.name;
            cpl.grlName = this.name;
            cpl.hpns = this.coupleHpns();
            cpl.cmptblt = this.coupleCmptbl();
            cpl.gb = this.gbasket;
        }
        
        if(curGkBoy != null)
        {
            this.cmtd = true;
            curGkBoy.cmtd = true;
            this.boyfrndType = "The Geek";
            this.gkBoyfrnd = curGkBoy;
            curGkBoy.grlType = "The Choosy";
            curGkBoy.chGrlfrnd = choosy.this;
            curGkBoy.fillBasket(esGifts, utGifts, lGifts);
            this.gbasket = curGkBoy.gbasket;  
            cpl.boyName = curGkBoy.name;
            cpl.grlName = this.name;
            cpl.hpns = this.coupleHpns();
            cpl.cmptblt = this.coupleCmptbl();
            cpl.gb = this.gbasket;
        }
        
        return cpl;
    }
    
    
    
    /**
     * Getter for Happiness of couple in which girl is
     * @return Happiness of couple
     */
    public double coupleHpns()
    {
        switch(this.boyfrndType)
        {
            case "The Miser":
                return this.mBoyfrnd.getHpns() + this.getHpns();
            case "The Generous":
                return this.genBoyfrnd.getHpns()+this.getHpns();
            case "The Geek":
                return this.gkBoyfrnd.getHpns()+this.getHpns();
        }
        return 0;
    }
    
    /**
     * Getter for Compatibility of couple in which girl is
     * @return Compatibility of couple
     */
    public double coupleCmptbl()
    {
        switch(this.boyfrndType)
        {
            case "The Miser":
                return ( (this.mBoyfrnd.Budget - this.Budget) + Math.abs(this.mBoyfrnd.att - this.att) + Math.abs(this.mBoyfrnd.iLevel - this.iLevel) );
            case "The Generous":
                return ( (this.genBoyfrnd.Budget - this.Budget) + Math.abs(this.genBoyfrnd.att - this.att) + Math.abs(this.genBoyfrnd.iLevel - this.iLevel) );
            case "The Geek":
                return ( (this.gkBoyfrnd.Budget - this.Budget) + Math.abs(this.gkBoyfrnd.att - this.att) + Math.abs(this.gkBoyfrnd.iLevel - this.iLevel) );
        }
        return 0;
    }
}
