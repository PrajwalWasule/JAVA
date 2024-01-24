package day10;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.List;

import com.app.core.Color;

import customexception.CustomHandlingExcetion;

public class CustomerValidationRule {
	
	public static void checkdupl(String newemail,List<Customer> Customer)throws CustomHandlingExcetion
	{
		Customer newcustomer=new Customer(newemail);
		if(Customer.contains(newcustomer))
			throw new CustomHandlingExcetion("customer is not found");
			System.out.println("no dupl");
	}
	
 public static ServicePlan parseAndValidatePlan(String plan)
 {
	 return ServicePlan.valueOf(plan.toUpperCase());
 }

 public static int validateAmount(int newamt,ServicePlan plan)throws CustomHandlingExcetion
 {
	 if(plan.getAdditionalcost()!=newamt)
		 throw new CustomHandlingExcetion("plan is not available");
	 
	 return newamt;
 }
 public static LocalDate
 
 
 
 
 
 
 
 
 public static Customer validateAllInput(String fname,String lname,String email,
		 String pass,
		 double regamt,String dob,String plan,List<Customer> Customer)throws DateTimeException,CustomHandlingExcetion,
 {
	 checkdupl(email,Customer);
	 ServicePlan p=parseAndValidatePlan(plan);
	 LocalDate d=parse(dob);
	 
	 return new Customer(fname,lname,email,pass,regamt,dob,plan);
 }
}












}























