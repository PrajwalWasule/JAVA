package customervalidation;

import java.time.LocalDate;
import java.util.Map;

import core.Customer;
import core.ServicePlan;
import customexception.CustomerHandlingException;

public class CustomerValidationRule {

public static void checkdup(String email,Map<String, Customer> customer)throws CustomerHandlingException
{
	if (customer.containsKey(email))
		throw new CustomerHandlingException("Dup email !!!!!");
	System.out.println("no dups !");
}
public static ServicePlan parseAndValidate(String plan)throws IllegalArgumentException
{
	return ServicePlan.valueOf(plan.toUpperCase());
	
}

public static void validateRegAmt(double regamt,ServicePlan plan)throws CustomerHandlingException
{
	if(regamt!=plan.getAdditionalcost())
		throw new CustomerHandlingException("reg amt is doesnot match with plan!!!!");
	
}
public static LocalDate parsedob(String date)
{
	return LocalDate.parse(date);
}



	
	
	
}
