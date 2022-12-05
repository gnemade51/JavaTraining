
public class RightTriangle {
	private int base, height;
	private double area;
	public void initData(int b)
	{
		base=b;
		height=2*b;
	}
	public double calcArea()
	{
		area = 0.5*base*height;
		return area;
	}
	public static void main(String[] args)
	{
		RightTriangle rt1=new RightTriangle();
		rt1.initData(2);
		System.out.println("Area of the Equilateral triangle is "+rt1.calcArea());
	}

}
