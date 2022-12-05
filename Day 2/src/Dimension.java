
public class Dimension {
	private int height,width;
	public Dimension(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	public static void change(Dimension d)
	{
		d.width = 500;
	}
	public static void main(String[] args)
	{
		Dimension d1=new Dimension(100,200);
		System.out.println(d1);
		change(d1);
		System.out.println("");
		System.out.println(d1);
	}

}
