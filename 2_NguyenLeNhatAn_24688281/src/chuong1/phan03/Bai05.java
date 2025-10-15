/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 13 thg 9, 2025
 */

package chuong1.phan03;

import java.util.Scanner;

/**
 * Bai05 class
 */
public class Bai05 {
	public static double getGCD(double a, double b)
	{
		if(b == 0) return a;
		return getGCD(b,a % b);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào a và b: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		double gcd = getGCD(a, b);
		System.out.println("UCLN của " + a + " và " + b + " là: " + gcd);
		sc.close();
	}
}

