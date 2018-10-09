package uk.ac.ncl.teach.ex.acc;

/** 
 * CashBoxCalculator - stats calculator for cash boxes.
 *
 */ 
public final class CashBoxCalculator {  
    // can only do calculations over cash boxes
    private int sum;
    private CashBox maximum;
    private CashBox minimum;
    
    /**
     * Update the calculator sum (running total), maximum and minimum 
     * with the given box.
     *
     * @param box the box to use to update calculations
     */
    public void update(CashBox box) {
        sum += box.total();
        
        if (maximum == null) {
            maximum = box;
            minimum = box;
            
            return;
        } 
        
        if (maximum.total() < box.total()) {
            maximum = box;
        } 

        if (minimum.total() > box.total()) {
            minimum = box;
        }
    }
    
    /**
     * Return the cash box with the highest value so far.
     *
     * @return the cash box wit the highest value so far.
     */
    public CashBox getMaximum() { return maximum; }
    
    /**
     * Return the cash box with the lowest value so far.
     *
     * @return the cash box wit the lowest value so far.
     */
    public CashBox getMinimum() { return minimum; }
    
    /**
     * Return the sum (running total) of cash boxes
     *
     * @return the sum of cash boxes
     */
    public int getSum() { return sum; }
    
    /**
     * Reset the calculator. After invocation sum will be 0,
     * maximum and minimum cash boxes will be null
     */
    public void reset() {
        sum = 0;
        maximum = null;
        minimum = null;
    }

    /**
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return "minimum = " + minimum 
                + ", maximum = " + maximum 
                + ", sum = " + sum;
    }
}
