package Presentation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		Person q=new Person();
		p.name="Gaurav";
		q.name="Gaurav";
		if(p.equals(q)) //works same as == if not overridden
			System.out.println("They are equal");
		else
			System.out.println("They are NOT equal");
	}

}
