package chuong3.bai05;

public class SalariedEmployee extends Employee{
	private double weeklySalary;
	
	public SalariedEmployee() {
		// TODO Auto-generated constructor stub
	}

	public SalariedEmployee(String firstName, String lastName, String sSN, double weeklySalary) {
		super(firstName, lastName, sSN);
		this.weeklySalary = weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		if(weeklySalary <= 0) 
			throw new IllegalArgumentException("Lương tuần của nhân viên phải lớn hơn 0");
		this.weeklySalary = weeklySalary;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("| %.2f",weeklySalary);
	}
}
