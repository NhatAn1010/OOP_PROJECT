/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 14 thg 9, 2025
 */

package chuong2.bai03;

/**
 * Cylinder class
 */
public class Cylinder {
	private double radian, height;
	
	public Cylinder() {}

	public Cylinder(double radian, double height) {
		this.radian = radian;
		this.height = height;
	}

	public double getRadian() {
		return radian;
	}

	public void setRadian(double radian) {
		this.radian = radian;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	//LSA = Lateral surface area
	public double getLSA(double radian, double height)
	{
		return 2 * Math.PI * radian * height;
	}
	//TSA = Total surface area
	public double getTSA(double radian, double height)
	{
		return 2 * Math.PI * radian * (radian + height);
	}

	public double getVolume(double radian, double height)
	{
		return Math.PI * radian * radian * height;
	}

	@Override
	public String toString() {
		return String.format("Radian = %.2f, Height = %.2f",radian, height);
	}
}	

