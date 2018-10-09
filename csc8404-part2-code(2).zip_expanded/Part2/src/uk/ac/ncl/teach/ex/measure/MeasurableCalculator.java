package uk.ac.ncl.teach.ex.measure;

/** 
 * MeasurableCalculator - this calculator computes the sum, the minimum and
 * the maximum of a sequence of Measurable objects passed to its 
 * <code>update</code> method.
 *
 */ 
public final class MeasurableCalculator { 
    // can do calculations over any Measurable object
    private int sum;
    private Measurable maximum;
    private Measurable minimum;
    
    /**
     * Compute the sum and assign the minimum and maximum objects for this
     * calculator. Each object passed to this method, updates the 
     * calculation
     * 
     * @param x the Measurable object to be measured
     */
    public void update(Measurable x) {
        sum += x.getMeasure();
        
        if (maximum == null) {
            maximum = x;
            minimum = x;
            
            return;
        } 
        
        if (maximum.getMeasure() < x.getMeasure()) {
            maximum = x;
        } 

        if (minimum.getMeasure() > x.getMeasure()) {
            minimum = x;
        }
    }
    
    /**
     * Returns the Measurable object with the highest value returned by the
     * <code>getMeasure</code> method in the current set of calculations.
     *
     * @return the object with the maximum value of the objects seen 
     * @see uk.ac.ncl.teach.ex.measure.Measurable#getMeasure()
     */
    public Measurable getMaximum() { return maximum; }
    
    /**
     * Returns the Measurable object with the lowest value returned by the
     * <code>getMeasure</code> method in the current set of calculations.
     *
     * @return the object with the minimum value of the objects seen 
     * @see uk.ac.ncl.teach.ex.measure.Measurable#getMeasure()
     */
    public Measurable getMinimum() { return minimum; }
    
    /**
     * Returns the sum of all Measurable object in the current set of 
     * calculations.
     *
     * @return the sum of the results of invoking <code>getMeasure</code> on
     * the objects seen
     * @see uk.ac.ncl.teach.ex.measure.Measurable#getMeasure()
     */
    public int getSum() { return sum; }
    
    /**
     * Resets this calculator. After invocation of this method
     *  <code>sum</code> will be zero and both maximum and minimum objects 
     *  will be <code>null</code>.
     *
     *
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
