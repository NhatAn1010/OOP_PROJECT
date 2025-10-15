package chuong3.bai06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CeramicsProduct extends Product{

	private String supplier;
	private LocalDate dateStart;
	
	public CeramicsProduct(String name) {
		super(name);
	}

	public CeramicsProduct(String id, String name, double unitPrice, int quantity, String supplier,
			LocalDate dateStart) {
		super(id, name, unitPrice, quantity);
		this.supplier = supplier;
		this.dateStart = dateStart;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		if(supplier == null || supplier.isEmpty())
			throw new IllegalArgumentException("supplier must not be null");
		this.supplier = supplier;
	}

	public LocalDate getDateStart() {
		return dateStart;
	}

	public void setDateStart(LocalDate dateStart) {
		if(dateStart.isAfter(LocalDate.now())) dateStart = LocalDate.now();
		this.dateStart = dateStart;
	}
	
	@Override
	public double calcPrice() {
		return unitPrice * quantity * 0.1;
	}
	
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return super.toString() + String.format("%-13s | %-18s |",
				supplier,
				dtf.format(dateStart)
		);
	}
}
