package Presentation;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = "Hi there";
		String s2 = "Hi there";
		String s3 = "Hi ";
		s3 = s3 + "there";
		
		if(s1 == s2)
			System.out.println("They are equal");
		else
			System.out.println("They are NOT equal");
		
		if(s1 == s3)
			System.out.println("They are equal");
		else
			System.out.println("They are NOT equal");
		
		if(s1.equals(s3))
			System.out.println("They are equal");
		else
			System.out.println("They are NOT equal");
	}
}
