import java.util.Iterator;
import java.util.ArrayList;

public class CollectionBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> nameCollection=new ArrayList<String>();
		//List<String> mylist=new ArrayList<String>();
		//Collections<String> mylist1=new ArrayList<String>();
		//HashSet<String> nameCollection=new HashSet<String>();
		//TreeSet<String> nameCollection=new Treeset<String>();
		nameCollection.add("rajesh");
		nameCollection.add("yash");
		nameCollection.add("sachin");
		nameCollection.add("sachin");
		nameCollection.add("abhijeet");
		System.out.println(nameCollection);
		
//		for(String s:nameCollection)
//			{
//				String s1=s;
//				s1=s.toUpperCase();
//				System.out.println(s1);
//			}
			
			Iterator<String> i=nameCollection.iterator();
			while(i.hasNext())
			{
				String s=i.next();
				System.out.println(s);
			}
	}

}
