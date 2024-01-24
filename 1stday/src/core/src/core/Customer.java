package core;

import java.time.LocalDate;

public class Customer {

	private int cust_id;
	private String first_name;
	private String last_name;
	private String email;
	private String password;
	private double registrationAmount;
	private LocalDate dob;
	private ServicePlan plan;
	private static int idgeneration;
	  static {
		  idgeneration=100;
		  
	  }
	public Customer(String first_name, String last_name, String email, String password, double registrationAmount,
			LocalDate dob, ServicePlan plan) {
		super();
		this.cust_id=idgeneration++;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.plan = plan;
	}
	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", first_name=" + first_name + ", last_name=" + last_name + ", email="
				+ email + ", password=" + password + ", registrationAmount=" + registrationAmount + ", dob=" + dob
				+ ", plan=" + plan + "]";
	}
	public String getFirst_name() {
		return first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public double getRegistrationAmount() {
		return registrationAmount;
	}
	public LocalDate getDob() {
		return dob;
	}
	public ServicePlan getPlan() {
		return plan;
	}	
	
	
	
}
