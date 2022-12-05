
public class Emp1 implements Comparable<Emp1> {
	int id, salary,grosssal;
	String name, dept;
	
	public Emp1(int id, String name, int salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int calcGrossSal()
	{
		grosssal=this.salary+this.salary;
		return grosssal;
	}
	@Override
	public String toString() {
		return id + " , " + name + " , " + dept + " , " + salary + " , " + grosssal;
	}
	@Override
	public int compareTo(Emp1 o) {
		// TODO Auto-generated method stub
		return this.salary-o.salary;
	}
	
}
