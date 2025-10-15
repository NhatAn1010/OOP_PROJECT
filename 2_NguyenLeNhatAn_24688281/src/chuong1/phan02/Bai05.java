/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 13 thg 9, 2025
 */

package chuong1.phan02;

/**
 * Bai05 class
 */
public class Bai05 {
	public static void main(String[] args) {
		int value1 = 1, value2 = 2;
		
		System.out.println("value1 == value2: " + (value1 == value2)); // false vì 1 != 2
		System.out.println("value1 != value2: " + (value1 != value2)); // true vì 1 != 2
		System.out.println("value1 > value2: " + (value1 > value2)); // false vì 1 < 2
		System.out.println("value1 < value2: " + (value1 < value2)); // true vì 1 < 2
		System.out.println("value1 <= value2: " + (value1 <= value2)); // true vì 1 < 2
		System.out.println("(value1 <= value2) && (value1 == value2): " + ((value1 <= value2) 
				&& (value1 == value2))); // false vì chỉ có 1 điều kiện <= là đúng, còn == là sai, mà && cần cả 2 đều đúng thì nó ms đúng
		System.out.println("(value1 <= value2) || (value1 == value2): " + ((value1 <= value2) 
				|| (value1 == value2))); // true vì điều kiện <= đúng, mà || chỉ cần 1 trong 2 đúng thì nó đúng
		
	}
}

