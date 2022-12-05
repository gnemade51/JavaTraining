
public class Circle {
	private int radius;
	private double area;
	public void initData(int r)
	{
		radius=r;
	}
	public double calcArea()
	{
		area = 3.142*radius*radius;
		return area;
	}
	public static void main(String[] args)
	{
		Circle c1=new Circle();
		c1.initData(7);
		System.out.println("Area of the circle is "+c1.calcArea());
	}

}
