
public class WrapperDemo1 {
	
	 public void method(int a) 
	    { 
	          
	        System.out.println("Primitive type byte formal argument :" + a); 
	    } 

	public static void main(String[] args) {
		
		WrapperDemo1 w = new WrapperDemo1();
		byte val =5;
		w.method(val);
		
		// TODO Auto-generated method stub
//        Integer i = new Integer(12);
//        Integer i2 = new Integer(13);
//        //unboxing---  objects are converted to primitives
//        int x=i.intValue();
//        int y= i2.intValue();
//        int z=x+y;
//        //System.out.println(z);
//        //boxing -- primitives are converted to objects/wrappers
//        Integer ans = new Integer(z);
//        
//        //auto-unboxing
//        int z1= i+i2;
//        
//        //auto-boxing
//        Integer ans1=z1;
        
        
        //Double d = new Double(12.43);
        //Float f = new Float(12.43f);
       // Character c = new  Character('c');
        
	}

}
