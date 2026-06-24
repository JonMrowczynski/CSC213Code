/**
 * @author Jon Mrowczynski
 */
void main() {
	
	var student1 = new Student("Jon", "Mrowczynski", Grade.F);
	var student2 = new Student("Alice", "Smith", Grade.B);
	var student3 = new Student("Bob", "Brown", Grade.C);
	var student4 = new Student("Charlie", "Smith", Grade.A);
	
	var students = new ArrayList<>(List.of(student1, student2, student3, student4));
	Collections.shuffle(students);
	IO.println("Before Sorting: ");
	students.forEach(IO::println);
	
	Collections.sort(students);
	IO.println("\nAfter Sorting: ");
	students.forEach(IO::println);
}

enum Grade {A, B, C, D, F}

record Student(String firstName, String lastName, Grade grade) implements Comparable<Student> {
	
	@Override public int compareTo(final Student other) {
		return grade.compareTo(other.grade); // Sort based on grade
		//			return lastName.compareTo(other.lastName); // Sort based on last name.
	}
	
	@Override public String toString() {
		return "\tfirstName: %s, lastName: %s, grade: %s".formatted(firstName, lastName, grade);
	}
}