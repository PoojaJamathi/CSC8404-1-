package uk.ac.ncl.teach.ex.people;

/** 
 * UseLecturer - simple test class for the Lecturer class.
 *
 */ 
public class UseLecturer {

    /**
     * Demonstrate use of the Lecturer class.
     *
     * @param args arguments are ignored.
     */
    public static void main(String[] args) {
        Lecturer john 
            = new Lecturer("John Smith", 46, "Newcastle",
                "Computing");
   
        System.out.println(john.getName());
        System.out.println(john.getAge());
        System.out.println(john.getInstitution());
        System.out.println(john.getSchool());
        
        // Can I do the following:
        // System.out.println(john.getStage());
    }
}
