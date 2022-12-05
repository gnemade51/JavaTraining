

public class Outer4 {
int x=10;

static class Inner4{
	public void displayFromInner() {
		System.out.println("im in inner");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer4.Inner4 obj4=new Outer4.Inner4();
		obj4.displayFromInner();
	}

}
