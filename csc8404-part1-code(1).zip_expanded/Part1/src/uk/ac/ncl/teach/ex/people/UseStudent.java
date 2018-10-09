package uk.ac.ncl.teach.ex.people;

/** 
 * UseStudent - simple test class for the Student class.
 *
 */ 
public class UseStudent {

    /**
     * Demonstrate use of the Student class.
     *
     * @param args arguments are ignored.
     */
    public static void main(String[] args) {
        Student bill = new Student("Bill Gates", 
            45, "Harvard", 3);

        System.out.println(bill.getName());
        System.out.println(bill.getAge());
        System.out.println(bill.getInstitution());
        System.out.println(bill.getStage());
    }
}
