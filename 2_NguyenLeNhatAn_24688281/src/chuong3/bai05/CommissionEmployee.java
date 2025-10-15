package chuong3.bai05;

import java.text.NumberFormat;
import java.util.Locale;

public class CommissionEmployee extends Employee{
	private double grossSales, commissionRate;

	public CommissionEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	public CommissionEmployee(String firstName, String lastName, String sSN, double grossSales, double commissionRate) {
		super(firstName, lastName, sSN);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		if(grossSales <= 0)
			throw new IllegalArgumentException("Doanh thu phải lớn hơn 0");
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		if(commissionRate <= 0)
			throw new IllegalArgumentException("Hoa hồng phải lớn hơn 0");
		this.commissionRate = commissionRate;
	}
	
	public double getSalary(double gross, double commission)
	{
		return gross * commission;
	}
	
	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.of("vi", "VN"));
		return super.toString() + String.format("%.2f | %.2f | %s",
				grossSales, 
				commissionRate,
				nf.format(getSalary(grossSales, commissionRate))
		);
	}
	
}
