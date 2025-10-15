package chuong3.bai06;



public class ElectronicProduct extends Product{
	//thời gian bảo hành
	private int warrantyPeriod;
	private double adapter;
	
	public ElectronicProduct(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	
	
	public ElectronicProduct(String id, String name, double unitPrice, int quantity, int warrantyPeriod,
			double adapter) {
		super(id, name, unitPrice, quantity);
		setWarrantyPeriod(warrantyPeriod);
		setAdapter(adapter);
	}



	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}

	public void setWarrantyPeriod(int warrantyPeriod) {
		if(warrantyPeriod < 0) throw new IllegalArgumentException("warrantyPeriod must greater than 0");
		this.warrantyPeriod = warrantyPeriod;
	}

	public double getAdapter() {
		return adapter;
	}

	public void setAdapter(double adapter) {
		if(adapter < 0) throw new IllegalArgumentException("adapter must greater than 0");
		this.adapter = adapter;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + String.format("%-19d | %-9.2f |",
				warrantyPeriod,
				adapter
		);
	}



	@Override
	public double calcPrice() {
		return unitPrice * quantity * 0.1;
	}
	
}
