package distance;
import java.util.Scanner;
public class Tester {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter a coordinate");
	   
      Point2D test1=new Point2D(sc.nextInt(),sc.nextInt());
      Point2D test2=new Point2D(sc.nextInt(),sc.nextInt());
     
      System.out.println(test1.show());
      System.out.println(test2.show());
      
     boolean equal=test1.isequal(test2);
     {
    	 if(equal)
    	 {  double dist;
    		 System.out.println(" same!!!");
    		 else
    		 {
    			 System.out.println("not same!!");
    			 dist=test1.calculateDistance(test2);
    			 System.out.println("dist is "+dist);
    		 }
    	 }
     }
	
	
	}

}
