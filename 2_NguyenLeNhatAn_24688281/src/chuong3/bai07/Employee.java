package chuong3.bai07;

import java.text.DecimalFormat;

public class Employee extends Person{
	private final double baseSalary = 5e6;
	private double coeffSalary;
	
	public Employee() {
	}
	
	public Employee(String name, String address, double coeffSalary) {
		super(name, address);
		this.coeffSalary = coeffSalary;
	}

	
	
	public double getCoeffSalary() {
		return coeffSalary;
	}

	public void setCoeffSalary(double coeffSalary) {
		if(coeffSalary < 0)
			throw new IllegalArgumentException("Coeff salary must not less than 0");
		this.coeffSalary = coeffSalary;
	}

	public double getSalary()
	{
		return baseSalary * coeffSalary;
	}
	
	@Override
	protected Rating rate() {
		Rating r = null;
		if(coeffSalary >= 3) r = Rating.DAT_KPI;
		else r = Rating.KHONG_DAT_KPI;
		
		return r;
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,### 'VND'");
		return super.toString() + String.format("| %-11.1f | %-13s | %-15s |",
				coeffSalary,
				df.format(getSalary()),
				rate()
		);
	}
}
