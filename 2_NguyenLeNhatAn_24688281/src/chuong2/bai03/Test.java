/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 14 thg 9, 2025
 */

package chuong2.bai03;

import java.util.Scanner;

/**
 * Test class
 */
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r, h;
		System.out.println("Nhập vào r và h: ");
		r = sc.nextDouble();
		h = sc.nextDouble();
		Cylinder c = new Cylinder(r, h);
		System.out.println(c);
		System.out.printf("Diện tích xung quanh = %.2f\n", c.getLSA(r, h));
		System.out.printf("Diện tích toàn phần = %.2f\n", c.getTSA(r, h));
		System.out.printf("Thể tích = %.2f", c.getVolume(r, h));
		
		sc.close();
	}
}

