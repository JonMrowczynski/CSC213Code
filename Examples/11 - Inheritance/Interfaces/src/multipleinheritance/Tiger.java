package multipleinheritance;

public interface Tiger extends RoaringAnimal {
	int getNumOfStripes();
	
	@Override default String roar() {
		return "This is a Tiger's roar!";
	}
}
