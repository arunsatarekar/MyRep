package module3_oop;

public class Car {
       String mod;
       int price;
       static int wheels=4;
     static  int amt;
     
     //Constructor
       public Car() 
       {
    	 System.out.println("constuctor - no args");   
       }
       
       //Constructor
       public Car(String mod, int price)
       {
    	  this.mod=mod;
    	   this.price=price;
       }
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		            Car c1 = new Car();
                       c1.mod="Merc";
                       c1.price=2345;
                
                       c1.start();
                       c1.accel();
                       
                       Car c2=new Car();
                       c2.mod="Maruti";
                       c2.price=5345;
                     
                       c2.start();
                       c2.accel();
                       
                       
                        System.out.println(c1.mod);
                        System.out.println(c2.mod);
                        System.out.println(wheels);
                        System.out.println(Car.wheels);
                       c1.wheels=8; 
                       System.out.println(wheels);
                       System.out.println(Car.wheels);
                       System.out.println(c2.wheels); 
	
	           amt=fillgas(100);
	           Car.fillgas(200);
	           c1.fillgas(300);
	System.out.println(amt);
	}

	
     	public void start()
     	{
		System.out.println(mod + " starting");
	    }

        public void accel()
        {
        	System.out.println(mod + " accel");
        }

        
        static public int fillgas(int quantity)
        {
        	System.out.println("gas filled ");
        	return quantity;
        }
}


