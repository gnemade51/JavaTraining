package Assg1;

public class Employee {
       int id;
       String name;
       Date dt_of_joining;
	
	public Employee(int id, String name, Date dt_of_joining) {
		super();
		this.id = id;
		this.name = name;
		this.dt_of_joining = dt_of_joining;
	}
	
//	public void register() {
//		if(dt_of_joining.)
//	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Date d =new Date(11,"June",2019);
         if(d.checkDate()) {
        	 System.out.println("Can be registered");
         }
         else {
        	 System.out.println("Cannot be registered");
         }
        Employee e1 = new Employee(1,"Harsh",d);
        
	}
}
