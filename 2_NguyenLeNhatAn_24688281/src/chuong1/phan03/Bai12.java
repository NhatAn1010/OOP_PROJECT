/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 14 thg 9, 2025
 */

package chuong1.phan03;

import java.util.Scanner;

/**
 * Bai12 class
 */
public class Bai12 {
	public static void printOddNumber(int n)
	{
		for(int i = 1;i <= n;i++)
		{
			if(i % 2 != 0) System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhập vào n: "); n = sc.nextInt();
		printOddNumber(n);
		
		sc.close();
	}
}

