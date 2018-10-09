package uk.ac.ncl.teach.ex.people;

/** 
 * UsePersonEquals - demonstration of asymmetry of Person hierarchy equals 
 * method.
 *
 */

public class UsePersonEquals {
    
    public static void main(String[] args) {
        final Person j1 = new Person("John", 49);
        final Person j2 = new Person("John", 49);
        
        System.out.println("j1 == j2: " + (j1 == j2));
        System.out.println("j1.equals(j2): " + j1.equals(j2));
              
        /*
        final Person j3
            = new UniversityPerson("John", 49, "Newcastle Uni");
        
        System.out.println("j1.equals(j3): " + j1.equals(j3));
        System.out.println("j3.equals(j1): " + j3.equals(j1));
        */
                       
        /* 
        System.out.println("j1.equals(j2): " + j1.equals(j2));
        System.out.println("j1.hashCode() == j2.hashCode(): "
            + (j1.hashCode() == j2.hashCode()));
        */
    }
}
