
public class Emp implements Comparable<Emp> {
	int id;
	String name;
	int salary;
	
	public Emp(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public boolean equals(Object o)
	{
		Emp e=(Emp)o;
		if(this.id == e.id)
			return true;
		else
			return false;
	}
	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		return this.salary-o.salary;
	}
	public int hashCode()
	{
		return id;
	}
	@Override
	public String toString() {
		return id + " , " + name + " , " + salary;
	}
	
}
