package uk.ac.ncl.teach.ex.measure;

/** 
 * Measurer - implement this interface to provide a measure of an 
 * Object using the measure method.
 *
 */ 
public interface Measurer {
    /**
     * Provides a measure of an object. The implementation of this method 
     * should compute a measure of the given Object that is appropriate
     * to the given application.
     *      
     * @param obj the object to measure
     * @return an integer measure of the object
     * @throws ClassCastException if <code>obj</code> is not of the expected
     * type
     */
    int measure(Object obj);

}
