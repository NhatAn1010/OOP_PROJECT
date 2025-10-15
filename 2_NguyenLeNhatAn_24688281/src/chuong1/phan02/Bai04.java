/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 13 thg 9, 2025
 */

package chuong1.phan02;

/**
 * Bai04 class
 */
public class Bai04 {
	public static void main(String[] args) {
		int i = 3;
		i++; // tăng biến i lên 1
		System.out.println("i1 = " + i); // 4
		++i; // tăng biến i lên 1
		System.out.println("i2 = " + i); // 5
		System.out.println("i3 = " + (++i)); // cộng trước rồi mới in ra i, i = 6
		System.out.println("i4 = " + (i++)); // in ra i = 6 rồi ms cộng, sau khi in thì i = 7
		System.out.println("i5 = " + (--i)); // trừ i rồi in ra, 7 - 1 = 6
		System.out.println("i6 = " + (i--)); // in ra i = 6 rồi trừ, lúc này i còn 5
		System.out.println("i7 = " + i); // 5
		
	}
}

