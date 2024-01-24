package best;

import java.time.LocalDate;

import day10.ServicePlan;

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
