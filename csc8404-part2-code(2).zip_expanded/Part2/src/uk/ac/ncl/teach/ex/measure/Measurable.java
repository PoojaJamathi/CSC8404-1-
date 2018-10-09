package uk.ac.ncl.teach.ex.measure;

/** 
 * Measurable - classes that implement this interface can be measured.
 *
 */ 
public interface Measurable {
    /**
     * Provides an integer measure of any instance of a class that 
     * implements the Measurable interface. Classes that implement this
     * interface should specify the meaning of 
     * the measure for that class. Note: implementations of this interface
     * should also document any unchecked exceptions that they may throw.
     * 
     * @return an integer measure of the object on which this method is 
     * invoked
     */
    int getMeasure();
}
