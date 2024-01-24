package tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static day10.CustomerValidationRule.*;
import day10.Customer;

public class CustomerManagementSystem {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		List<Customer> customerlist=new ArrayList<>();
		boolean exit=false;
		System.out.println("Enter a choice");
	
	while(!exit)
	{
		System.out.println("Option 1 Signin");
		System.out.println("Enter a choice");
		try {
			switch(sc.nextInt())
			{
			case 1:
				System.out.println("Enter fname,lname,email,pass,regamt,dob,plan");
				  Customer ValidateCustomer=validateAllInpu
				
				break;
			}
		 } } 
	}

}}
