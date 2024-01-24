package tester;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import core.Customer;
import core.ServicePlan;

public class CustomerManagementSystem {

	public static void main(String[] args) {
	 try(Scanner sc=new Scanner(System.in);)
	 {
	   Map<String, Customer> customer=new HashMap<>();
	   boolean exit=false;
	   while(!exit)
	   {
		   System.out.println("1. SIGNUP\n 2.SIGNIN");
		   System.out.println("choose option");
		   try {
			   switch(sc.nextInt())
			   {
			   case 1:
				   System.out.println("Enter first_name,last_name,email, password, registrationAmount,dob,plan");
				   System.out.println("SILVER(1000),GOLD(2000),PLATINUM(3000)");
                   Customer customer=validateAllInupt(sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.nextInt(),sc.next(),sc.nextInt())
                   
                		   
                   
                   
                		   
                		   
                		   
                break;
			   }
		   }
	   }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 }

	}

}
