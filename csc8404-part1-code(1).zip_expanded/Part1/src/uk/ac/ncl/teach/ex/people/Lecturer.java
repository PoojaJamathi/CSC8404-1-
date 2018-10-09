package uk.ac.ncl.teach.ex.people;

/** 
 * Lecturer - represents a University lecturer.
 *
 */

public class Lecturer extends UniversityPerson {
    private final String school;

    /**
     * Construct a lecturer given name, age, institution and school.
     *
     * @param name the lecturer's name
     * @param age the lecturer's age
     * @param institution the lecturer's institution
     * @param school the lecturer's school
     */
    public Lecturer(String name, int age, 
        String institution, String school) {
        super(name, age, institution);
        this.school = school;
    }

    /**
     * Get the <code>school</code> field.
     *
     * @return Returns the <code>school</code> field
     */
    public String getSchool() {
        return school;
    }
}
