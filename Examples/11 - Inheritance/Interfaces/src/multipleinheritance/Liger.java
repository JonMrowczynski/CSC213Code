package multipleinheritance;

public class Liger implements Tiger, Lion {
	
	static void main() {
		var liger = new Liger();
		IO.println(liger.roar());
	}
	
	@Override public boolean hasMane() {
		return false;
	}
	
	@Override public int getNumOfStripes() {
		return 0;
	}
	
	@Override public String roar() {
		return Tiger.super.roar(); // Can call Tiger's roar.
		//		return Lion.super.roar(); // Can call Lion's roar.
		//		return "This is a Liger's roar!"; // Can make your own roar!
	}
	
}
