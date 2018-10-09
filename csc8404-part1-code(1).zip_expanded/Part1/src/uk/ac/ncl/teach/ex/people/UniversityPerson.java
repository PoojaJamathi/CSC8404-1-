package uk.ac.ncl.teach.ex.people;

/** 
 * UniversityPerson - simple representation of a Person at a University.
 *
 */

public class UniversityPerson extends Person {
    private final String institution;

    /**
     * Construct a university person given name, age and institution.
     *
     * @param name the lecturer's name
     * @param age the lecturer's age
     * @param institution the lecturer's institution
     */
    public UniversityPerson(String name, int age, 
        String institution) {
        super(name, age);
        this.institution = institution;
    }
    
    /**
     * Get the <code>institution</code> field.
     *
     * @return Returns the <code>institution</code> field
     */
    public String getInstitution() {
        return institution;
    }
    
}
