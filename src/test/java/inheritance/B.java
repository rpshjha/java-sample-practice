package inheritance;

public class B extends A{

	public void m2() {
		System.out.println("I am inside B");
	
		System.out.println("[start] " + new Throwable().getStackTrace()[0].getMethodName());
	}

	public void m3() {
		System.out.println("I am inside B");
		
		System.out.println("[start] " + new Throwable().getStackTrace()[0].getMethodName());
	}

}
