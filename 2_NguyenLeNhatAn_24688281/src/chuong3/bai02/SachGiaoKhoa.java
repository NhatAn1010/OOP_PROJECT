/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 26 thg 9, 2025
 */

package chuong3.bai02;

import java.time.LocalDate;

/**
 * SachGiaoKhoa class
 */
public class SachGiaoKhoa extends Sach{
	private Status status;
	
	
	public SachGiaoKhoa() {
		this.status = Status.NEW;
	}
	
	
	public SachGiaoKhoa(String code, LocalDate day, double price, int count, String publisher, Status status) {
		super(code, day, price, count, publisher);
		this.status = status;
	}
	
	
	public Status getStatus() {
		return status;
	}
	
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public double calcPrice()
	{
		if(this.count > 0 && status == Status.NEW) 
			return count * price;
		return count * price * 0.5;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + String.format("| %S", status);
	}
}

