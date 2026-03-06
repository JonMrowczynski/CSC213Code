public class BasicInheritance {
	public static void main(String[] args) {
		var firstName = "Alice";
		var lastName = "Smith";
		var age = 42;
		var school = "Canisius";
		
		var teacherBadImpl = new bad.Teacher(firstName, lastName, age, school);
		System.out.println(teacherBadImpl);
		
		var teacherGoodImpl = new good.Teacher(firstName, lastName, age, school);
		System.out.println(teacherGoodImpl);
		
		System.out.println("\nTeachers equal?: -> " + teacherGoodImpl.equals(teacherBadImpl));
		
		System.out.println("Bad Teacher getName() -> " + teacherBadImpl.getName());
		System.out.println("Good Teacher getName() -> " + teacherGoodImpl.getName());
	}
}