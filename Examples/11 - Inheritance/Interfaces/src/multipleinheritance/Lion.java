package multipleinheritance;

public interface Lion extends RoaringAnimal {
	boolean hasMane();
	
	@Override default String roar() {
		return "This is a Lion's roar!";
	}
}
