package oracle.test.universalpool;

import java.lang.annotation.ElementType;


public class Drived extends Baze {
	
	String str = "9000";

	public void display() {
		// TODO Auto-generated method stub

		String string = " anoy any";
		System.out.println(" display of Drived class");
	}
	
	public static void main(String arg[]) {
		Drived drived = new Drived();
		drived.display();
		drived.display();
		System.out.println(drived.methodReturner());
	}
	
	@TestAnnotation(value = {
	@XAnnotation(value=1,word="XX")		
	})
	public static String methodReturner() {
		return "ssssssssssss";
	}
}
