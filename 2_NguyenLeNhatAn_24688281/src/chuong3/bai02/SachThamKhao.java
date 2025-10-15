/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 26 thg 9, 2025
 */

package chuong3.bai02;

import java.time.LocalDate;

/**
 * SachThamKhao class
 */
public class SachThamKhao extends Sach{
	private double thue;
	
	public SachThamKhao() {
		// TODO Auto-generated constructor stub
	}
	

	public SachThamKhao(String code, LocalDate day, double price, int count, String publisher, double thue) {
		super(code, day, price, count, publisher);
		this.thue = thue;
	}


	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}
	
	
	public double calcPrice()
	{
		return count * price + thue;
	}
	
	public String toString()
	{
		return super.toString() + String.format("| %.2f", thue);
	}
	
}

