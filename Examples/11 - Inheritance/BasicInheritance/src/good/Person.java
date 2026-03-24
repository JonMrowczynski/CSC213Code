package good;

/**
 * @author Jon Mrowczynski
 */
public class Person {
    // Instance Fields
    private final String firstName;
    private final String lastName; 
    private int age;

    // Constructors
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Person(String firstName, String lastName, int age) {
        this(firstName, lastName); // Calls the other constructor with the given arguments!
        this.age = age;
    }

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }

    // Setters
    public void setAge(int newAge) throws IllegalArgumentException { 
        if (newAge < 0) { throw new IllegalArgumentException("Age cannot be negative"); }
        age = newAge; 
    }
    
    // Other Methods
    public String getName() { return firstName + " " + lastName; }
    @Override public String toString() {
        return """
                First Name: %s
                Last Name: %s
                Age: %d""".formatted(firstName, lastName, age);
    }
}