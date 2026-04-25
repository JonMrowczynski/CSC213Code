import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Jon Mrowczynski
 */
public class ComparableExample {
	
	public static void main(String[] args) {
		
		var student1 = new Student("Jon", "Mrowczynski", Grade.F);
		var student2 = new Student("Alice", "Smith", Grade.B);
		var student3 = new Student("Bob", "Brown", Grade.C);
		var student4 = new Student("Charlie", "Smith", Grade.A);
		
		var students = new ArrayList<>(List.of(student1, student2, student3, student4));
		Collections.shuffle(students);
		System.out.println("Before Sorting: ");
		students.forEach(System.out::println);
		
		Collections.sort(students);
		System.out.println("\nAfter Sorting: ");
		students.forEach(System.out::println);
	}
	
	private enum Grade {A, B, C, D, F}
	
	private record Student(String firstName, String lastName, Grade grade) implements Comparable<Student> {
		
		@Override public int compareTo(final Student other) {
			return grade.compareTo(other.grade); // Sort based on grade
//			return lastName.compareTo(other.lastName); // Sort based on last name.
		}
		
		@Override public String toString() {
			return "\tfirstName: %s, lastName: %s, grade: %s".formatted(firstName, lastName, grade);
		}
	}
}