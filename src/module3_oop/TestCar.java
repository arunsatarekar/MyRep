package module3_oop;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Car a = new Car();
           Car b = new Car();
           Car c = new Car();
	
           a.mod="A";
           b.mod="B";
           c.mod="C";
           
           System.out.println(a.mod);
	
           a=b;
           b=c;
           c=a;
           System.out.println(a.mod); 
           System.out.println(b.mod);   
           System.out.println(c.mod);
       
           a.mod="yyyy";
           System.out.println(a.mod); 
           System.out.println(b.mod);   
           System.out.println(c.mod);
           
           
	}

}
