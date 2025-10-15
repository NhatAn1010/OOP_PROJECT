/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 16 thg 9, 2025
 */

package chuong2.bai06;

/**
 * Test class
 */
public class Test {
	public static void main(String[] args) {
		AssignCarInformation car1 = new AssignCarInformation("Nguyễn Tình", "Ducati", 200e7, 500);
		AssignCarInformation car2 = new AssignCarInformation("Nguyễn Tối", "Bugati", 700e7, 900);
		AssignCarInformation car3 = new AssignCarInformation("Nguyễn Tào", "Lam", 1000e7, 1000);
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
	}
}

