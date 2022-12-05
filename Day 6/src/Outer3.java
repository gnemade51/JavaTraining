

public class Outer3 {
int x=10;

public void initiateObject() {
	
	//method-local inner class
	class Inner3{
		public void displayFromInner() {
			System.out.println(x);
		}
	}
	Inner3 i = new Inner3();
	i.displayFromInner();
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer3 o3=new Outer3();
		o3.initiateObject();
		
		
	}

}
