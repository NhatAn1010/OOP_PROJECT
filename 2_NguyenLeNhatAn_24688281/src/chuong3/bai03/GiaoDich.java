/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 26 thg 9, 2025
 */

package chuong3.bai03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * GiaoDich class
 */
public abstract class GiaoDich {
	protected String ma;
	protected LocalDate ngayGiaoDich;
	protected double price;
	protected int count;
	
	public GiaoDich() {
		// TODO Auto-generated constructor stub
	}

	public GiaoDich(String ma, LocalDate ngayGiaoDich, double price, int count) {
		this.ma = ma;
		this.ngayGiaoDich = ngayGiaoDich;
		this.price = price;
		this.count = count;
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public LocalDate getNgayGiaoDich() {
		return ngayGiaoDich;
	}

	public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
		this.ngayGiaoDich = ngayGiaoDich;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%s | %s | %.2f | %d",
				ma,
				dtf.format(ngayGiaoDich),
				price,
				count
		);
	}
	
}

