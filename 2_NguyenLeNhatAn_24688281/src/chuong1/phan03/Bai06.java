/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 13 thg 9, 2025
 */

package chuong1.phan03;

import java.util.Scanner;

/**
 * Bai06 class
 */
public class Bai06 {
	public static boolean isPrime(int n)
	{
		if(n <= 1) return false;
		for(int i = 2;i <= (int)Math.sqrt(n);i++)
		{
			if(n % i == 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào 1 số: ");
		int n = sc.nextInt();
		if(isPrime(n)) System.out.println(n + " là số nguyên tố");
		else System.out.println(n + " không phải là số nguyên tố");
			
		sc.close();
	}
}

