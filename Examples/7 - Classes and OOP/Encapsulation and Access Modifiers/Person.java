/**
 * @author Jon Mrowczynski
 */
public class Person {

    /*
        Access Modifiers:

        2 of the most common access modifiers include:
        - public -> accessible to any piece of code.
        - private -> accessible to only the containing class.
    */

    /*
        - A copy of each instance variable (non-static variables) is made every time a new Person object is instantiated.
        - Instance variables can be constant or variable! 
            - If constant, then they HAVE to be either set in every constructor.
            - If variable, then they are usually accompanied with a setter to change their value.
        - Almost always should make instance fields private. Rather, we want to encapsulate an object's data such
          that it can't be directly accessed outside of the object instance.
    */
    
    /**
     * The person's first name.
     */
    private final String firstName; // This is constant. Once set in the constructor, it's value can't change.

    /**
     * The person't last name.
     */
    private final String lastName; // This is constant. Once set in the constructor, it can't be changed.

    /**
     * The person's age.
     */
    private int age; // This is variable. It can be changed at any point in the program with the setter!

    /**
     * Creates a new {@code Person} with the given first and last name.
     * 
     * @param firstName the Person's first name.
     * @param lastName the Person's last name.
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        // Since age is not set, the default value of an int, 0, is used.
        // Depending on your specific implementation, it probably makes more sense to set a default value of -1, though!
    }

    /*  
        Constructor Overloading:

        - We can overload constructors just like how we can overload methods!
        - Helps with code reusability.
    */

    /**
     * Creates a new {@code Person} with the given age, first and last name.
     * 
     * @param firstName the Person's first name.
     * @param lastName the Person's last name.
     * @param age the Person's age.
     * @see Person#Person(String, String)
     */
    public Person(String firstName, String lastName, int age) {
        this(firstName, lastName); // Calls the other constructor with the given arguments!
        this.age = age;
    }

    /* 
        - Have getters (sometimes called accessors) to get an object's data.
        - This is commonly how private fields are accessed. 
    */

    /**
     * @return the Person's first name.
     */
    public String getFirstName() { return firstName; }

    /**
     * @return the Person's last name.
     */
    public String getLastName() { return lastName; }

    /**
     * @return the Person's age.
     */
    public int getAge() { return age; }

    /*
        - Have setters (sometimes called mutators) to change the values of variable instance fields.
        - Often want to put guards on the values that an instance field can be set to.
    */

    /**
     * Set's the Person's age as long as it isn't negative. Otherwise, an {@code IllegalArgumentException} is thrown since it is
     * probably a mistake that a negative age is passed in.
     * 
     * @param newAge the updated Person's age.
     * @throws IllegalArgumentException if the given age is negative.
     */
    public void setAge(int newAge) throws IllegalArgumentException { 
        if (newAge < 0) { throw new IllegalArgumentException("Age cannot be negative"); }
        age = newAge; 
    }
}