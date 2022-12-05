import java.io.Serializable;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int stuID;
	String stuName;
	String stuPhone;
	public Student(int stuID, String stuName, String stuPhone) {
		super();
		this.stuID = stuID;
		this.stuName = stuName;
		this.stuPhone = stuPhone;
	}
	public String toString()
	{
		return stuID+" , "+stuName+" , "+stuPhone;
	}
}
