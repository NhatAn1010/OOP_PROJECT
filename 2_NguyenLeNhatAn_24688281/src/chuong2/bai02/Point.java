/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 14 thg 9, 2025
 */

package chuong2.bai02;

/**
 * Point class
 */
public class Point {
	private String name;
	private double x, y;
	
	Point(){}

	public Point(String name, double x, double y) {
		this.name = name;
		this.x = x;
		this.y = y;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	public void negate(String name, double x, double y)
	{
		setName(name);
		setX(-x);
		setY(-y);
	}
	
	public double getDistance(double x, double y)
	{
		return Math.sqrt(x * x + y * y);
	}
	
	@Override
	public String toString() {
		return String.format("%s(%.2f, %.2f)", name, x, y);
	}
}

