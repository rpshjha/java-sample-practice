package inheritance;

public class A {
	
	public void m1() {
		System.out.println("I am inside A");
	
		System.out.println("[start] " + new Throwable().getStackTrace()[0].getMethodName());
	}
	
	public void m2() {
		System.out.println("I am inside A");
		
		System.out.println("[start] " + new Throwable().getStackTrace()[0].getMethodName());
	}

}
