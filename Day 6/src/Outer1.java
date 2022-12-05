

public class Outer1 {
	int x=10;
	
	void displayFromOuter() {
		//System.out.println(y);
	}
	
	class Inner1{
		int y;
		void displayFromInner() {
			System.out.println(x);
		}
	}
	
	public static void main(String[] args) {
		
		//it fails
		//Inner1 obj1=new Inner1();
		
		
		Outer1 obj=new Outer1();
		Inner1 obj1= obj.new Inner1();
		
		obj1.displayFromInner();
	}
}
