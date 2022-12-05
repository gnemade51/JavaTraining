package Assg1;

public class Date {
	int dd;
	int yy;
	String mm;
    public Date(int dd, String mm, int yy) {
		super();
		this.dd = dd;
		this.yy = yy;
		this.mm = mm;
	}
    @Override
   	public String toString() {
   		return "Date [dd=" + dd + ", yy=" + yy + ", mm=" + mm + "]";
   	}
	public enum Month{
    	June,August;
    }
	
	public boolean checkDate() {
		for(Month m: Month.values()) {
			if(m.toString().equals(this.mm)) {
				return true;
			}
		}
		return false;
	}
	
   
}
