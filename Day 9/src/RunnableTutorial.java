
public class RunnableTutorial implements Runnable{
	public static void main(String[] args) {
		new Thread(
				new Runnable() {

					@Override
					public void run() {
						// TODO Auto-generated method stub
						System.out.println("In method of Thread 1");
					}
					
				}
				).start();
		new Thread(
				new Runnable() {

					@Override
					public void run() {
						// TODO Auto-generated method stub
						System.out.println("In method of Thread 2");
					}
					
				}
				).start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		System.out.println("In run method");
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		RunnableTutorial r1=new RunnableTutorial();
//		Thread t=new Thread(r1);
//		t.start();
//	}
}
