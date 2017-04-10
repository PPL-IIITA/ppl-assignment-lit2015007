/*
 * PPL-Assignment-lit2015007
 * @author Vaibhav
 */
package com.pplAssignment.structure.inheritance;


/** Abstract class defining Gift Allocation System*/

public abstract class giftSelector {
    
    /**Interface for allocate method
     * @param giftSet Set of available gifts
     * @param curBoy Boy who is performing gifting
     * @param gb Gift Basket to be filled
     */
    public abstract void allocate(gift giftSet[], boy curBoy, giftBasket gb);
}
