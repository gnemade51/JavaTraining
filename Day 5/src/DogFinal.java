
public class DogFinal {
	final int x=100;
	String name;
	public void Dog()
	{
		name="Johny";
	}
	public static void main(String[] args)
	{
		Dog d1=new Dog();
		Dog d2=new Dog();
		d2=d1;
	}
}
