package chuong3.bai05;

import java.text.NumberFormat;
import java.util.Locale;

public class HourlyEmployee extends Employee{
	private double wage;
	private int hour;
	
	public HourlyEmployee() {
		// TODO Auto-generated constructor stub
	}

	public HourlyEmployee(String firstName, String lastName, String sSN, double wage, int hour) {
		super(firstName, lastName, sSN);
		this.wage = wage;
		this.hour = hour;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if(wage <= 0)
			throw new IllegalArgumentException("Số tiền/giờ phải lớn hơn 0");
		this.wage = wage;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if(hour <= 0)
			throw new IllegalArgumentException("Số giờ làm việc phải lớn hơn 0");
		this.hour = hour;
	}
	
	public double getSalary(double wage, int hour)
	{
		double salary = 1.0;
		if(hour <= 40) salary = this.wage * this.hour;
		else salary = 40 * this.wage + (hour - 40) * wage * 1.5;
		return salary;
	}
	
	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.of("vi", "VN"));
		return super.toString() + String.format("| %.0fk/h | %d | %s", wage/1000, hour, nf.format(getSalary(wage, hour)));
	}
	
}
