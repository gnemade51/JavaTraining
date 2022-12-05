package Assg1;

public class Outer {
    int x;
    
    class Inner{
    	int y;
    	public void display() {
    		System.out.println(x);
    	}
    }
    public void disp() {
    	System.out.println(x);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Outer o = new Outer();
        Inner i = o.new Inner();
        i.display();
	}

}
