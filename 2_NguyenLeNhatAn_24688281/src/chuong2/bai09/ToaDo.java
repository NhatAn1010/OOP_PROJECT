/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 17 thg 9, 2025
 */

package chuong2.bai09;

/**
 * kkkk class
 */
public class ToaDo {
	private String ten;
	private float x, y;
	
	public ToaDo() {
		// TODO Auto-generated constructor stub
	}
	
	
	public ToaDo(String ten, float x, float y) {
		this.ten = ten;
		this.x = x;
		this.y = y;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return String.format("%s(%.2f, %.2f)", ten, x, y);
	}
	
}

