/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 14 thg 9, 2025
 */

package chuong2.bai02;

/**
 * Test class
 */
public class Test {
	public static void main(String[] args) {
		Point p = new Point("A", 3.4, 5.6);
		System.out.println(p);
		p.negate("B", 3.4, 5.6);
		System.out.println("Điểm đối xứng qua O: " + p);
		System.out.printf("Distance = %.2f\n", p.getDistance(3.4, 5.6));
	}
}

