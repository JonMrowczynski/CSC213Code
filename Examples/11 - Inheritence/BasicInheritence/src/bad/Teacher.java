package bad;

/**
 * Poor implementation of a Teacher. VERY redundant!
 *
 * @author Jon Mrowczynski
 */
public class Teacher {
    // Class Fields
    public static final boolean UNDERPAID = true;
    
    // Instance Fields
    private final String firstName;
    private final String lastName;
    private int age;
    private String school;

    // Constructors
    public Teacher(String firstName, String lastName, String school) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.school = school;
    }
    public Teacher(String firstName, String lastName, int age, String school) {
        this(firstName, lastName, school);
        this.age = age;
    }

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getSchool() { return school; }

    // Setters
    public void setAge(int newAge) throws IllegalArgumentException {
        if (age < 0) { throw new IllegalArgumentException("Age cannot be negative."); }
        age = newAge;
    }
    public void setSchool(String newSchool) { school = newSchool; }
    
    // Other Methods
    public String getName() { return "Dr. " + firstName + " " + lastName; }
    @Override public String toString() {
        return """
                First Name: %s
                Last Name: %s
                Age: %d
                School: %s
                """.formatted(firstName, lastName, age, school);
    }
}
