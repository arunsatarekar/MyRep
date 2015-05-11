package module3_oop;

public class Point 
{
 int x;
 int y;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     Point p = new Point();
     p.x=10;
     p.y=20;
     System.out.println(p.x + "  " + p.y);
	 swap(p.x, p.y);
	 System.out.println(p.x + "  " + p.y);
     swapref(p);	
     System.out.println(p.x + "  " + p.y);
	}

	
	     public static void swap(int a, int b)
	     { int temp;
	       temp=a;
	       a=b;
	       b=temp;	    	   	 
	     }

         public static void swapref(Point t)
         { 
        	 int temp=t.x;
        	 t.x=t.y;
        	 t.y=temp;
       	 }
         
         

}



