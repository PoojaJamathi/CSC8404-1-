package uk.ac.ncl.teach.ex.acc;

import uk.ac.ncl.teach.ex.measure.Measurer;

/** 
 * AccountMeasurer - a measurer for Account objects.
 *
 */

public final class AccountMeasurer implements Measurer {
    /**
     * This method will measure instances of Account. The measure of an 
     * account is its balance
     * 
     * @param obj the account to be measured
     * @return the account balance
     * @throws ClassCastException if <code>obj</code>  is not an instance
     * of Account
     * @see uk.ac.ncl.teach.ex.measure.Measurer#measure(java.lang.Object)
     */
    public int measure(Object obj) {
        final Account acc = (Account) obj;
        
        return acc.getBalance();
    }

}
