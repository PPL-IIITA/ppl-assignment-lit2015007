/*
 * PPL-Assignment-lit2015007
 * @author Vaibhav
 */

package com.pplAssignment.structure.basic;

import com.pplAssignment.examples.basic._staticFunctions;


/** 
 * Class for Girls of Type : The _normal.
 */
public class _normal {
    
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
     *Type of Girl's Boyfriend.
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
    _miser mBoyfrnd;
    
    /**
     * Generous Boyfriend of girl when committed with.
     */
    _generous genBoyfrnd;
    
    /**
     * Geek Boyfriend of girl when committed with.
     */
    _geeks gkBoyfrnd;
    
    
    /**
     * Gift Basket.
     * Girl receives a Gift Basket when committed.
     */
    public _giftBasket gbasket;
    
    /**
     * Getter for Happiness.
     * Happiness of a _normal girl is linear to the total cost of gifts achieved over maintenance, including luxury gifts. 
 The value of all gifts is added additional to the cost.
     * @return Happiness of Normal Girl
     */
    public double getHpns(){
        return (this.gbasket.getNetCost() + this.gbasket.getNetValue());
    }
    
    /**
     * Constructor for Normal
     * @param crit Criterion of choosing the boy to date. Either of: most attractive, most rich or most intelligent.
     * @param name Name
     * @param att Attractiveness
     * @param iLevel intelligence Level
     * @param Budget Maintenance Budget
     */
    public _normal(String crit, String name, int att, int iLevel, int Budget) {
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
     * Finds a perfect match for Girl and makes them _couple
     * @param mBoys Miser Boy List
     * @param genBoys Generous Boy List
     * @param gkBoys Geek Boy List
     * @param esGifts Essential Gift List
     * @param utGifts Utility Gift List
     * @param lGifts Luxury Gift List
     * @return _couple made by Girl
     */
     public _couple makeCouple(_miser []mBoys, _generous []genBoys, _geeks []gkBoys, _essentialGift []esGifts, _utilityGift []utGifts, _luxuryGift []lGifts){
              
        _miser curMBoy = null;
        _generous curGenBoy = null;
        _geeks curGkBoy = null;
        
        mBoys = _staticFunctions.sortBy(mBoys, this.crit);
        genBoys = _staticFunctions.sortBy(genBoys, this.crit);
        gkBoys = _staticFunctions.sortBy(gkBoys, this.crit);
        
            
        for(int i = _staticFunctions.length(mBoys)-1; i>=0; i--){
            if(mBoys[i].cmtd == false && mBoys[i].Budget >= this.Budget && this.att >= mBoys[i].minAttr ){
                curMBoy = mBoys[i];
            }
        }
        
        for(int i = _staticFunctions.length(genBoys)-1; i>=0; i--){
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
        
        for(int i = _staticFunctions.length(gkBoys)-1; i>=0; i--){
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
        
        _couple cpl = new _couple();
        
        if(curMBoy != null)
        {
            this.cmtd = true;
            curMBoy.cmtd = true;
            this.boyfrndType = "The Miser";
            this.mBoyfrnd = curMBoy;
            curMBoy.grlType = "The Normal";
            curMBoy.nGrlfrnd = _normal.this;
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
            curGenBoy.grlType = "The Normal";
            curGenBoy.nGrlfrnd = _normal.this;
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
            curGkBoy.grlType = "The Normal";
            curGkBoy.nGrlfrnd = _normal.this;
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
     * Getter for Happiness of _couple in which girl is
     * @return Happiness of _couple
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
     * Getter for Compatibility of _couple in which girl is
     * @return Compatibility of _couple
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
