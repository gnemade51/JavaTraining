
public class Marklist {
	Student student;
	Date dt_of_exam;
	String[] subNames;
	int[] subMarks;
	double percentage, temp;
	static int i,j;
	public Marklist(Student student, Date dt_of_exam, String[] subNames, int[] subMarks)
	{
		this.student = student;
		this.dt_of_exam = dt_of_exam;
		this.subNames = subNames;
		this.subMarks = subMarks;
	}
	public String toString()
	{
		return student+" / "+dt_of_exam;
	}
	public double calcPercentage()
	{
		for(i=0;i<subMarks.length;i++)
		{
			temp=temp+subMarks[i];
		}
		percentage=(temp/(subMarks.length*100))*100;
		return percentage;
	}
	public double getPercentage()
	{
		return percentage;
	}
	public static void sort(Marklist[] marklist)
	{
		Marklist temp;
		for(int j=0;j<marklist.length;j++)
		{
			for(int i=0;i<marklist.length-1;i++)
			{
				if(marklist[i].getPercentage()>marklist[i+1].getPercentage())
				{
					temp = marklist[i+1];
					marklist[i+1] = marklist[i];
					marklist[i] = temp;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		Student s1=new Student(101, "Gaurav","EXTC");
		Date d1=new Date(18,12,2019);
		String[] names1= {"DCOM","SS","DTSP","DCE"};
		int[] marks1= {88,75,99,65};
		Marklist ml1=new Marklist(s1,d1,names1,marks1);
		
		Student s2=new Student(102, "Daksh","Comps");
		Date d2=new Date(1,3,2019);
		String[] names2= {"C","C++","Python","Java"};
		int[] marks2= {74,43,89,50};
		Marklist ml2=new Marklist(s2,d2,names2,marks2);
		
		Student s3=new Student(103, "Rick","Civil");
		Date d3=new Date(4,5,2018);
		String[] names3= {"SOM","TOM","BOM","CTE","CTA"};
		int[] marks3= {80,90,66,66,76};
		Marklist ml3=new Marklist(s3,d3,names3,marks3);
		
		Student s4=new Student(104, "Himaz","Mech");
		Date d4=new Date(30,9,2017);
		String[] names4= {"SOM","GOM","BOM","TOM","JERRY","BIMBOM"};
		int[] marks4= {74,36,38,45,60,80};
		Marklist ml4=new Marklist(s4,d4,names4,marks4);
		
		Student s5=new Student(105, "Nihar","Comps");
		Date d5=new Date(23,5,2009);
		String[] names5= {"C","C++","Python","Java"};
		int[] marks5= {85,14,27,33};
		Marklist ml5=new Marklist(s5,d5,names5,marks5);
		
		ml1.calcPercentage();
		ml2.calcPercentage();
		ml3.calcPercentage();
		ml4.calcPercentage();
		ml5.calcPercentage();
		
		
		Marklist[] marklist= {ml1,ml2,ml3,ml4,ml5};
		sort(marklist);
		
		for(int j=0;j<marklist.length;j++)
		{
			System.out.println(marklist[j]+" , Percentage = "+marklist[j].getPercentage());
		}
		
		
	}
}
