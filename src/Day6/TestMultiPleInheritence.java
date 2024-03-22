package Day6;
import Day7.*;
public class TestMultiPleInheritence implements Printable,Showable{

	@Override
	public void toShow() {
		// TODO Auto-generated method stub
		System.out.println("Hello, Omkar G.");
	}

	@Override
	public void toPrint() {
		// TODO Auto-generated method stub
		System.out.println("How are you doing today?");
	}
public static void main(String[] args) {
	TestMultiPleInheritence obj = new TestMultiPleInheritence();
	
	obj.toShow();
	obj.toPrint();
}
}
