/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 13 thg 9, 2025
 */

package chuong1.phan03;

import java.util.Scanner;

/**
 * Bai03 class
 */
public class Bai03 {
	public static int sumOddNumber(int n)
	{
		int sum = 0;
		for(int i = 1;i <= n;i += 2)
		{
			if(i < n)
			{
				System.out.print(i + " + ");
				sum += i;
			}
			if(i == n)
			{
				System.out.println(i);
				sum += i;
			}
		}
		return sum;
	}
	
	public static int sumEvenNumber(int n)
	{
		int sum = 0;
		for(int i = 2;i <= n;i += 2)
		{
			if(i < n)
			{
				System.out.print(i + " + ");
				sum += i;
			}
			if(i == n)
			{
				System.out.println(i);
				sum += i;
			}	
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int n, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: "); n = sc.nextInt();
	
		if(n % 2 != 0) sum = sumOddNumber(n);
		else sum = sumEvenNumber(n);
		
		System.out.println("Sum = " + sum);
		sc.close();
	}
}	

