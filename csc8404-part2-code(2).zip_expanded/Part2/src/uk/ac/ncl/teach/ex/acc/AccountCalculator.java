package uk.ac.ncl.teach.ex.acc;

/** 
 * AccountCalculator - stats over accounts (see lecture notes).
 *
 */ 
public final class AccountCalculator {
    // can only do calculations over accounts
    private int sum;
    private Account maximum;
    private Account minimum;
    
    /**
     * Update the calculator sum (running total), maximum and minimum 
     * with the given account.
     *
     * @param box the box to use to update calculations
     */
    public void update(Account acc) {
        sum += acc.getBalance();
        
        if (maximum == null) {
            maximum = acc;
            minimum = acc;
            
            return;
        } 
        
        if (maximum.getBalance() < acc.getBalance()) {
            maximum = acc;
        } 

        if (minimum.getBalance() > acc.getBalance()) {
            minimum = acc;
        }
    }
    
    /**
     * Return the account with the highest value so far.
     *
     * @return the account wit the highest value so far.
     */
    public Account getMaximum() { return maximum; }
    
    /**
     * Return the account with the lowest value so far.
     *
     * @return the account wit the lowest value so far.
     */
    public Account getMinimum() { return minimum; }
    
    /**
     * Return the sum (running total) of accounts
     *
     * @return the sum of accounts
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
