
public class AnimalApp {
	public static void display(Animal d)
	{
		if(d instanceof Dog)
			((Dog)d).read();
		else
			System.out.println("Only Dog can read...you are a CAT!");
	}
	public static void main(String[] args)
	{
		Animal d=new Dog();
		Animal c=new Cat();
		display(d);
		display(c);
	//	d.breath();d.talk();d.eat();d.sleep();
	//	//d.read(); will not work because the super class is Animal which does not contain this method
	//	((Dog)d).read(); //this id class downcasting
	//	System.out.println("");
	//	c.breath();c.talk();c.eat();c.sleep();
	//	((Cat)c).swim();
	}

}
