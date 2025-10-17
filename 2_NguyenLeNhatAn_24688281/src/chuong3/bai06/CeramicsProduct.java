package chuong3.bai06;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

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
	public double getVAT() {
		return 0.1;
	}
	
	@Override
	protected ProductRating pr() {
		return(quantity > 50 && ChronoUnit.DAYS.between(dateStart, LocalDate.now()) > 10)? ProductRating.BAN_CHAM : ProductRating.KHONG_DANH_GIA;
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.0#%");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return super.toString() + String.format("%-13s | %-18s | %-8s | %-5s |",
				supplier,
				dtf.format(dateStart),
				pr(),
				df.format(getVAT())
		);
	}
}
