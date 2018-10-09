package uk.ac.ncl.teach.ex.people;

/** 
 * Student - represents a University student.
 *
 */

public class Student extends UniversityPerson {
    private final int stage;

    /**
     * Construct a student given name, age, institution and stage.
     *
     * @param name the student's name
     * @param age the student's age
     * @param institution the student's institution
     * @param stage the student's school
     */
    public Student(String name, int age, 
        String institution, int stage) {
        super(name, age, institution);
        this.stage = stage;
    }

    /**
     * Get the <code>stage</code> field.
     *
     * @return Returns the <code>stage</code> field
     */
    public int getStage() {
        return stage;
    }
}