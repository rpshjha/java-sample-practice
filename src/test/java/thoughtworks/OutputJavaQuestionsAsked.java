package thoughtworks;

public class OutputJavaQuestionsAsked {
	
	private static String str1 = "Java";
	private String str2 = "Scala";
	
	
	public static void Java() {
		System.out.println(str1);
	}
	
//	public static void Scala() {
//		System.out.println(str2);
//	}

	public static void main(String[] args) {

		
		Integer var1 = Integer.valueOf(34);
		Integer var2 = Integer.valueOf(34);
		
		System.out.println("" + (var1==var2));
		System.out.println("" + (var1.equals(var2)));
	
		
	}

}
