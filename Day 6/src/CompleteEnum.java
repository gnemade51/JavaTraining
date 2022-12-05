

public enum CompleteEnum implements EnumInterface {
   HIGH{
	   public String toString() {
		   return "I am so High";
	   }
	   public void display() {
		   System.out.println("High");
	   }
   },MEDIUM{
	    public void display() {
	    	System.out.println("Medium");
	    }
   },LOW{
	   public void display() {
		   System.out.println("Low");
	   }
	   public void method() {
		   System.out.println("Low method");
	   }
   };
	public void method() {
		System.out.println("All");
	}
	public abstract void display();
}
