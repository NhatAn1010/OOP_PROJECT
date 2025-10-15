/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 14 thg 9, 2025
 */

package chuong2.bai01;

/**
 * ToaDo class
 */
public class ToaDo {
	private double x, y;
	private String name;
	
	public ToaDo() {}
	public ToaDo(String name, double x, double y) {
		this.name = name;
		this.x = x;
		this.y = y;
	}
	
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
//	@Override
	public String toString() {
		return String.format("%s(%.2f, %.2f)",name, x, y);
	}
}

