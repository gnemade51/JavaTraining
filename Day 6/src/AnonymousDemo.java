

public class AnonymousDemo {
    interface Age{
    	int y=18;
    	public void display();
    }
    class Myclass implements Age{

		@Override
		@MyAnnotation(description ="This is display")
		public void display() {
			// TODO Auto-generated method stub
			
		}
    	
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Age a = new Age() {
//
//				@Override
//				public void display() {
//					// TODO Auto-generated method stub
//					System.out.println(y);
//				}
//		    	  
//		      };
//				a.display();
//   	}
	
    }
}
