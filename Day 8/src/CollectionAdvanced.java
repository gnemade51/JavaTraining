//import java.util.HashSet;
import java.util.TreeSet;

//import java.util.ArrayList;

public class CollectionAdvanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1=new Emp(101,"Abhijeet",10000);
		Emp e2=new Emp(102,"Sachin",16000);
		Emp e3=new Emp(103,"Sachin",12000);
		Emp e4=new Emp(104,"Rakesh",19000);
		Emp e5=new Emp(104,"Bipin",14000);
		//ArrayList<Emp> empCollection=new ArrayList<Emp>();
		//HashSet<Emp> empCollection=new HashSet<Emp>();
		TreeSet<Emp> empCollection=new TreeSet<Emp>();
		empCollection.add(e1); empCollection.add(e2); empCollection.add(e3);
		empCollection.add(e4); empCollection.add(e5);
		System.out.println(empCollection);
	}

}
