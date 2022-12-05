
public class Student {
	int id;
	String name, dept;
	public Student(int id, String name, String dept)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
	public String toString()
	{
		return id+" , "+name+" , "+dept;
	}

}
