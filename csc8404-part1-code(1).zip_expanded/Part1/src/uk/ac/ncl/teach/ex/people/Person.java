package uk.ac.ncl.teach.ex.people;

/** 
 * Person - simple representation of a Person with name and age.
 *
 */ 
public class Person {
    private final String name;
    private final int age;
       
    /**
     * Construct a Person given name and age.
     *
     * @param pName the name of the person
     * @param pAge the age of the person
     */
    public Person(String pName, int pAge) {
         name = pName;
         age = pAge;
     }

    /**
     * Get the <code>name</code> field.
     *
     * @return Returns the <code>name</code> field
     */
    public String getName() { return name; }

    /**
     * Get the <code>age</code> field.
     *
     * @return Returns the <code>age</code> field
     */
    public int getAge() { return age; }
    
    /**
     * Print the details of a Person to <code>System.out</code>
     */
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
}
