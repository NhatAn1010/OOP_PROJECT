/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 16 thg 9, 2025
 */

package chuong2.bai06;

/**
 * AssignCarInformation class
 */
public class AssignCarInformation {
	private String ownerName;
	private String typeCar;
	private double price;
	private int xylanh;
	
	
	public AssignCarInformation() {}


	public AssignCarInformation(String ownerName, String typeCar, double price, int xylanh) {
		this.ownerName = ownerName;
		this.typeCar = typeCar;
		this.price = price;
		this.xylanh = xylanh;
	}

	//<setter>>
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


	public void setTypeCar(String typeCar) {
		this.typeCar = typeCar;
	}


	public void setPrice(double price) {
		if(price < 0) throw new IllegalArgumentException("giá phải lớn hơn 0");
		this.price = price;
	}


	public void setXylanh(int xylanh) {
		if(xylanh < 0) throw new IllegalArgumentException("dung tích phải lớn hơn 0");
		this.xylanh = xylanh;
	}

	//<<getter>>

	public String getOwnerName() {
		return ownerName;
	}


	public String getTypeCar() {
		return typeCar;
	}


	public double getPrice() {
		return price;
	}


	public int getXylanh() {
		return xylanh;
	}
	
	public double calculateTax(double price, int xylanh)
	{
		double tax = 0.0;
		if(xylanh < 100) tax = price * 0.01;
		else if(xylanh < 200) tax = price * 0.03;
		else tax = price * 0.05;
		
		return tax;
	}
	
	@Override
	public String toString() {
		return String.format("%-20s | %-20s | %8d | %8.2f | %8.2f |",
				ownerName, 
				typeCar, 
				xylanh, 
				price, 
				calculateTax(price, xylanh));
	}
	
}

