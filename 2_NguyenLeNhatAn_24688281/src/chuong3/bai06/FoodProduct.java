package chuong3.bai06;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class FoodProduct extends Product{

	private String supplier;
	private LocalDate date;
	private LocalDate dateEnd;
	
	public FoodProduct(String name) {
		super(name);
	}

	public FoodProduct(String id, String name, double unitPrice, int quantity,
			String supplier, LocalDate date, LocalDate dateEnd) {
		super(id, name, unitPrice, quantity);
		setSupplier(supplier);
		setDate(date);
		setDateEnd(dateEnd);
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		if(supplier == null || supplier.isEmpty())
			throw new IllegalArgumentException("supplier must not be null");
		this.supplier = supplier;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		if(date.isAfter(LocalDate.now()))
			throw new IllegalArgumentException("date must be before current day");
		this.date = date;
	}

	public LocalDate getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(LocalDate dateEnd) {
		if(dateEnd.isBefore(date))
			dateEnd = date;
		this.dateEnd = dateEnd;
	}
	@Override
	public double getVAT() {
		return 0.05;
	}
	
	@Override
	public ProductRating pr() {
		return(quantity > 0 && dateEnd.isBefore(LocalDate.now()))? ProductRating.KHO_BAN : ProductRating.KHONG_DANH_GIA;
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.0#%");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return super.toString() + String.format("%-13s | %-13s | %-12s | %-8s | %-4s |",
				supplier,
				dtf.format(date), 
				dtf.format(dateEnd),
				pr(),
				df.format(getVAT())
		);
	}

}
