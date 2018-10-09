package uk.ac.ncl.teach.ex.acc;

import uk.ac.ncl.teach.ex.measure.Measurer;

/** 
 * WealthMeasurer - Measurer of accounts or cash boxes.
 *
 */ 
public final class WealthMeasurer implements Measurer {
    /**
     * This method will measure instances of Account or CashBox. 
     * 
     * @param obj the account or cash box to be measured
     * @return the measure of the account or cash box
     * @throws ClassCastException if <code>obj</code>  is not an instance
     * of Account or CashBox
     * @see uk.ac.ncl.teach.ex.measure.Measurer#measure(java.lang.Object)
     */
    public int measure(Object obj) {
        int measure = 0;
        
        if (obj instanceof Account) {
            measure = new AccountMeasurer().measure(obj);
        } else if (obj instanceof CashBox) {
            measure = new CashBoxMeasurer().measure(obj);
        } else {
            // it is neither
            throw new ClassCastException(
                    obj + " is neither an account or a cash box.");
        }
        
        return measure;
    }

}
