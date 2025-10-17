package chuong3.bai06;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class Product {
	protected String id;
	protected String name;
	protected double unitPrice;
	protected int quantity;
	protected abstract ProductRating pr();
	
	public abstract double getVAT();
	public Product(String name) {
		this.name = "xxx";
	}


	public Product(String id, String name, double unitPrice, int quantity) {
		this.id = id;
		setName(name);
		setUnitPrice(unitPrice);
		setQuantity(quantity);
	}

	//?
	private void setId(String id) {
		if(id == null || id.isEmpty())
			throw new IllegalArgumentException("ID must not be null");
		this.id = id;
	}


	public void setName(String name) {
		if(name == null || name.isEmpty())
			throw new IllegalArgumentException("Name must not be null");
		this.name = name;
	}


	public void setUnitPrice(double unitPrice) {
		if(unitPrice < 0) 
			throw new IllegalArgumentException("unitPrice must be greater than 0");
		this.unitPrice = unitPrice;
	}


	public void setQuantity(int quantity) {
		if(quantity < 0) 
			throw new IllegalArgumentException("quantity must be greater than 0");
		this.quantity = quantity;
	}


	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public double getUnitPrice() {
		return unitPrice;
	}


	public int getQuantity() {
		return quantity;
	}
	

	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.of("vi", "VN"));
		return String.format("%-11s | %-22s | %-15s | %-18s |",
				id, 
				name,
				nf.format(unitPrice), 
				quantity
		);
	}
}
