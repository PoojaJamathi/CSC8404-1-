package uk.ac.ncl.teach.ex.acc;
import uk.ac.ncl.teach.ex.measure.Measurable;


/** 
 * CashBox - cash box or till to hold cash takings.
 *
 */ 
public final class CashBox implements Measurable{
    private int cash; 
    public int getMeasure()
    {
    	return total();
    }
    
    /**
     * Instantiate a CashBox with a zero float.
     */
    public CashBox() { }
  
    
    /**
     * Instantiate a CashBox with the given initial float.
     * 
     * @param initialFloat the initial (non-negative) float
     * @throws IllegalArgumentException 
     * if <code>initialFloat</code> is less than 0
     */
    public CashBox(int initialFloat) {
       // if (initialFloat < 0) 
         //   throw new IllegalArgumentException("initialFloat < 0");
        
        cash = initialFloat;
    }
    
    /**
     * Return the total cash in the cash box.
     *
     * @return the amount of cash in the cash box
     */
    public int total() { return cash; }
    
    /**
     * Empty the cash box and return all cash.
     *
     * @return the cash in the cash box
     */
    public int empty() { 
        final int funds = cash;
        
        cash = 0;
        
        return funds;
    }
    
    /**
     * Pay the exact amount expected into the cash box.
     *
     * @param amountExpected the amount expected to be paid
     * @return the change (always 0)
     */
    public int pay(int amountExpected) {
        return pay(amountExpected, amountExpected);
    }
    
    /**
     * Pay more than the expected amount into the cash box
     * and received change.
     *
     * @param amountExpected the amount expected to be paid
     * @param amountTendered the amount paid in
     * @return the change (O or more)
     * @throws IllegalArgumentException if 
     * <code>amountTendered</code> is less than 
     * <code>amountExpected</code>
     */
    public int pay(int amountExpected, int amountTendered) {
        if (amountTendered < amountExpected) {
            throw new IllegalArgumentException(
                    "tendered less than expected: "
                    + amountExpected + " " + amountTendered);
        }
        
        cash += amountExpected;
        
        return amountTendered - amountExpected;
    }
    
    /**
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return "cashbox: " + cash;
    }

}
