/**
 * @author Jon Mrowczynski
 */
void main() {
    var person1 = new Person("Alice", "Smith");
    // System.out.println(person1.name); // Can't access private fields directly. Must use getter instead!
    IO.println("""
            First Name of person1: %s
            Last Name of person1: %s
            Age of person1: %d""".formatted(person1.getFirstName(), person1.getLastName(), person1.getAge()));
    // person1.setAge(-1) // Would thrown an IllegalArgumentException.
    person1.setAge(42);
    IO.println("Age of person1 after setter call: " + person1.getAge() + "\n");

    var person2 = new Person("Bob", "Brown", 50);
    IO.println("""
            First Name of person1: %s
            Last Name of person1: %s
            Age of person1: %d""".formatted(person2.getFirstName(), person2.getLastName(), person2.getAge()));

    IO.println();
}