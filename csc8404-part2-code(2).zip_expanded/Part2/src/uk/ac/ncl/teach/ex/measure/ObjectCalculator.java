package uk.ac.ncl.teach.ex.measure;

/** 
 * ObjectCalculator - an do calculations over any object that its Measurer 
 * instance can measure.
 *
 */ 
public final class ObjectCalculator {
    private int sum;
    private Object maximum;
    private int maxAmount;
    private Object minimum;
    private int minAmount;
    
    public ObjectCalculator() { }
    
    public void update(Measurer measurer, Object obj) {
        final int measure = measurer.measure(obj);
        
        sum += measure;
        
        if (maximum == null) {
            maximum = obj;
            maxAmount = measure;
            minimum = obj;
            minAmount = measure;
            
            return;
        } 
        
        if (maxAmount < measure) {
            maximum = obj;
            maxAmount = measure;
        } 

        if (minAmount > measure) {
            minimum = obj;
            minAmount = measure;
        }
    }
    
    public Object getMaximum() { return maximum; }
    
    public Object getMinimum() { return minimum; }
    
    public int getSum() { return sum; }
    
    public void reset() {
        sum = 0;
        maximum = null;
        minimum = null;
    }
    
    public String toString() {
        return "minimum = " + minimum 
                + ", maximum = " + maximum 
                + ", sum = " + sum;
    }
}

