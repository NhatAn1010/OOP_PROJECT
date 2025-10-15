package chuong3.bai05;

import java.text.NumberFormat;
import java.util.Locale;

public class BasePlusCommissionEmployee extends CommissionEmployee{

	private double baseSalary;
	public BasePlusCommissionEmployee() {
		// TODO Auto-generated constructor stub
	}
	public BasePlusCommissionEmployee(String firstName, String lastName, String sSN, double grossSales,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, sSN, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		if(baseSalary <= 0)
		{
			throw new IllegalArgumentException("Lương cơ bản phải lớn hơn 0");
		}
		this.baseSalary = baseSalary;
	}
	
	public double getSalary(double base)
	{
		return super.getSalary(getGrossSales(), getCommissionRate()) + base;
	}
	
	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.of("vi", "VN"));
		return super.toString() + String.format("%.2f", nf.format(baseSalary));
	}
}
