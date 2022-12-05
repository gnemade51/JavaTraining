
public class MyEnums {
   public enum Coffee{
	   SMALL(10),MEDIUM(20),BIG(30);
	   Coffee(int size){
		   this.size =size;
	   }
	   public void prepareCoffee() {
		   
	   }
	   public double calculatePrice() {
		   price=size*3;
		   return price;
	   }
	   int size;
	   double price;
   }
}
