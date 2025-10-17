package chuong3.bai07;

import java.text.DecimalFormat;

public class Customer extends Person{

	private String nameCompany;
	private double billValue;
	public Customer() {
	}
	
	public Customer(String name, String address, String nameCompany, double billValue) {
		super(name, address);
		this.nameCompany = nameCompany;
		this.billValue = billValue;
	}

	public String getNameCompany() {
		return nameCompany;
	}

	public void setNameCompany(String nameCompany) {
		if(nameCompany == null || nameCompany.isEmpty())
			throw new IllegalArgumentException("Name company must not be null");
		this.nameCompany = nameCompany;
	}

	public double getBillValue() {
		return billValue;
	}

	public void setBillValue(double billValue) {
		if(billValue < 0)
			throw new IllegalArgumentException("Bill must not less than 0");
		this.billValue = billValue;
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,### 'VND'");
		return super.toString() + String.format("| %-23s | %-15s | %-12s |",
				nameCompany, 
				df.format(billValue),
				rate()
		);
	}

	@Override
	protected Rating rate() {
		Rating r = (billValue > 20e6)? Rating.VIP : Rating.NORMAL;
		return r;
	}
}
