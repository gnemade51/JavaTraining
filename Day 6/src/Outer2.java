

public class Outer2 {
	int x=10;
	
	public void initiateObject() {
		Inner2 i=new Inner2();
		i.displayFromInner();
	}
	
	class Inner2{
		//if duplicate local variable is created with same name
		int x=20;
		public void displayFromInner() {
			System.out.println(x);
		}
	}
	
	public static void main(String[] args) {
		
		Outer2 obj=new Outer2();
		Inner2 i=obj.new Inner2();
		i.displayFromInner();
		//obj.initiateObject();
				
	}
}
