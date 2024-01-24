package day10;

import java.time.LocalDate;

public class Customer {
	
private int id;
private String fname;
private String lname;
private String email;
private String pass;
private double regamt;
private LocalDate dob;
private ServicePlan plan;
private static int idgeneration;
static {
	idgeneration=1000;
}

public Customer(String lname,String email,String pass,double regamt,LocalDate dob,ServicePlan plan) {
	super();
	this.id = idgeneration;
	this.fname = fname;
	this.lname = lname;
	this.email = email;
	this.pass = pass;
	this.regamt = regamt;
	this.dob = dob;
	this.plan = plan;
  idgeneration++;

}
public Customer(String email) {
    super();
    this.email=email;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", pass=" + pass
			+ ", regamt=" + regamt + ", dob=" + dob + "]";
}

public boolean equals(Object o)
{
 System.out.println("in a equal");
 if(o instanceof Customer)
 {
	 Customer anothercustomer=(Customer)o;
 this.email.equals(anothercustomer.email);
}
 return false;
 }}
















