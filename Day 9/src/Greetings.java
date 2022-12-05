
public class Greetings {
	String msg;

	public Greetings(String msg) {
		super();
		this.msg = msg;
	}
	public void start()
	{
		System.out.println(msg);
	}
	public static void main(String[] args) {
		Greetings g1=new Greetings("Good Morning");
		Greetings g2=new Greetings("Good Afternoon");
		Greetings g3=new Greetings("Good Evening");
		
		g1.start();
		g2.start();
		g3.start();
		
	}
}
