/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 13 thg 9, 2025
 */

package chuong1.phan03;

import java.util.Scanner;

/**
 * Bai04 class
 */
public class Bai04 {
	public static double calculateLinearEquation(double a, double b)
	{
		double x = 0.0;
		x = (b == 0)? 1.0 : -b / a;
		return x;
	}
	
	public static void main(String[] args) {
		double a, b, root;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào a: "); a = sc.nextDouble();
		System.out.print("Nhập vào b: "); b = sc.nextDouble();
		
		root = calculateLinearEquation(a, b);
		System.out.println("Root = " + root);
		sc.close();
	}
}