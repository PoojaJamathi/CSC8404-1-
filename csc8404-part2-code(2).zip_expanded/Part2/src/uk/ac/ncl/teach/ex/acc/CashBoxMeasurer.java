package uk.ac.ncl.teach.ex.acc;

import uk.ac.ncl.teach.ex.measure.Measurer;

/** 
 * CashBoxMeasurer - a measurer for CashBox objects.
 *
 */

public final class CashBoxMeasurer implements Measurer {
    /**
     * This method will measure instances of CashBox. The measure of a
     * cash box is its total.
     * 
     * @param obj the cash box to be measured
     * @return the cash box total
     * @throws ClassCastException if <code>obj</code>  is not an instance
     * of CashBox
     * @see uk.ac.ncl.teach.ex.measure.Measurer#measure(java.lang.Object)
     */
    public int measure(Object obj) {
        final CashBox box = (CashBox) obj;
        
        return box.total();
    }

}
