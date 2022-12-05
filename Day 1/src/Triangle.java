
public class Triangle {
	private int base, height;
	private double area;
	public void initData(int b, int h)
	{
		base=b;
		height=h;
	}
	public double calcArea()
	{
		area = 0.5*base*height;
		return area;
	}
	public static void main(String[] args)
	{
		Triangle t1=new Triangle();
		t1.initData(2,3);
		System.out.println("Area of the Equilateral triangle is "+t1.calcArea());
	}

}
