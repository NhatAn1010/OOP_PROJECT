/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 16 thg 9, 2025
 */

package chuong2.bai07;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * HangThucPham class
 */
public class HangThucPham {
	private String id;
	private String name;
	private double price;
	private LocalDate NSX;
	private LocalDate NHH;
	
	public HangThucPham() {
	}

	public HangThucPham(String id, String name, double price, LocalDate nSX, LocalDate nHH) {
		setId(id);
	    setName(name);
	    setPrice(price);
	    setNSX(nSX);
	    setNHH(nHH);
	}

	public String getId() {
		return id;
	}

	private void setId(String id) {
		if(id == null) throw new IllegalArgumentException("Ma hang k duoc de rong");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name == null) name = "xxx";
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price <= 0) price = 0.0;
		this.price = price;
	}

	public LocalDate getNSX() {
		return NSX;
	}

	public void setNSX(LocalDate nSX) {
		if(nSX.isAfter(LocalDate.now())) this.NSX = LocalDate.now();
		else this.NSX = nSX;
	}

	public LocalDate getNHH() {
		return NHH;
	}

	public void setNHH(LocalDate nHH) {
		if(nHH.isBefore(this.NSX)) this.NHH = LocalDate.now();
		else this.NHH = nHH;
	}
	
	public boolean isOutOfDate()
	{
		return NHH.isBefore(LocalDate.now())? true : false;
	}
	
	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.of("vi", "VN"));
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		return String.format("%-10s | %-10s | %-10s | %-15s | %-15s | %-8s|",
				id,
				name, 
				nf.format(price), 
				dtf.format(NSX),
				dtf.format(NHH),
				isOutOfDate()? "Hết hạn" : "Còn hạn"
		);
	}
	
}

