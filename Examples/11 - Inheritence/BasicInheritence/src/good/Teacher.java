package good;

/**
 * Good implementation of Teacher. Reuses existing code! Just need to add new stuff.
 *
 * @author Jon Mrowczynski
 */
public class Teacher extends Person {
    // Class Fields
    public static final boolean UNDERPAID = true;
    
    // Instance Fields:
    private String school;

    // Constructors
    public Teacher(String firstName, String lastName, String school) {
        super(firstName, lastName); // Calls the superclass's constructor!
        this.school = school;
    }
    public Teacher(String firstName, String lastName, int age, String school) {
        super(firstName, lastName, age); // Calls the superclass's constructor!
        this.school = school;
    }

    // Getters
    public String getSchool() { return school; }
    
    // Setters
    public void setSchool(String newSchool) { school = newSchool; }
    
    // Other Methods
    @Override public String getName() { return "Dr. " + super.getName(); }
    @Override public String toString() {
        return """
                %s
                School: %s""".formatted(super.toString(), school);
    }
}
