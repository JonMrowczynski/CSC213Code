/**
 * @author Jon Mrowczynski
 */
void main() {
	var firstName = "Alice";
	var lastName = "Smith";
	var age = 42;
	var school = "Canisius";
	
	var teacherBadImpl = new bad.Teacher(firstName, lastName, age, school);
	IO.println(teacherBadImpl);
	
	var teacherGoodImpl = new good.Teacher(firstName, lastName, age, school);
	IO.println(teacherGoodImpl);
	
	IO.println("\nTeachers equal?: -> " + teacherGoodImpl.equals(teacherBadImpl));
	
	IO.println("Bad Teacher getName() -> " + teacherBadImpl.getName());
	IO.println("Good Teacher getName() -> " + teacherGoodImpl.getName());
}