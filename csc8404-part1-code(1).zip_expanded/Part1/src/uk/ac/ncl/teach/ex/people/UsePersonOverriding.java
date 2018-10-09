package uk.ac.ncl.teach.ex.people;

/** 
 * UsePersonOverriding - simple demonstration of method overriding and 
 * overloading in the Person hierarchy.
 *
 */ 
public class UsePersonOverriding {

    /**
     * Demonstrate use of classes in the Person hierarchy.
     *
     * @param args arguments are ignored.
     */
    public static void main(String[] args) {
        Person p = new Person("Fred", 21);
        Student s = new Student("Fiona", 20, "Newcastle", 1);
        
        printHierarchy(p);
        printHierarchy(s);
        
        // p.printDetails(); // calls Person printDetails
        // s.printDetails(); // calls Student printDetails
        
        // p = s;            // assign Student to Person reference
       
        // p.printDetails(); // calls which printDetails?
        
    }
    
    private static void printHierarchy(Object obj) {
        System.out.println("obj class is: " + obj.getClass());
        
        System.out.println("obj is a Student: " + (obj instanceof Student));
        System.out.println("obj is a UniversityPerson: " 
            + (obj instanceof UniversityPerson));
        System.out.println("obj is a Person: " + (obj instanceof Person));
        
        System.out.println("obj is an Object: " + (obj instanceof Object));
    }
}
