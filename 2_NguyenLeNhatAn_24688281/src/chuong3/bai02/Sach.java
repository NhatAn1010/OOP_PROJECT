/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 26 thg 9, 2025
 */

package chuong3.bai02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Sach class
 */
public abstract class Sach {
	protected String code;
	protected LocalDate day;
	protected double price;
	protected int count;
	protected String publisher;
	
	public Sach() {
		// TODO Auto-generated constructor stub
	}

	public Sach(String code, LocalDate day, double price, int count, String publisher) {
		this.code = code;
		this.day = day;
		this.price = price;
		this.count = count;
		this.publisher = publisher;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public LocalDate getDay() {
		return day;
	}

	public void setDay(LocalDate day) {
		this.day = day;
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

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
	
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%-10s | %-15s | %.2f | %-10d | %-13s",
				code,
				dtf.format(day),
				price,
				count,
				publisher
		);
	}
	
}