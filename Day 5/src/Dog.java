
public class Dog extends Animal{
	public void talk()
	{
		System.out.println("Bho Bho");
	}
	public void eat()
	{
		System.out.println("I am nonveg");
	}
	public static void main(String[] args)
	{
		Animal d=new Dog();
		d.eat();d.talk();d.breath();
	}
}
