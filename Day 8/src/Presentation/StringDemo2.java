package Presentation;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Hi there");
		String s2=new String("Hi there");
		System.out.println(s1==s2);//reference or address comparison
		System.out.println(s1.equals(s2));//content comparison
	}

}
