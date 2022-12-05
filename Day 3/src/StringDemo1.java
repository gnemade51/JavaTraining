
public class StringDemo1 {
	public static void main(String[] args)
	{
		String s1 = "Gaurav Santosh";
		String s2 = "Nemade";
		System.out.println(s1.charAt(3));//gives char at mentioned position
		System.out.println(s1.codePointAt(2));//gives ascii value of mentioned position
		System.out.println(s1.codePointBefore(3));//gives ascii value of position before mentioned position
		System.out.println(s1.codePointCount(2, 5));
		System.out.println(s1.compareTo(s2)); 
		System.out.println(s1.concat(s2));
		System.out.println(s1.contains("rav"));
		System.out.println(s1.indexOf(0));
	}

}
