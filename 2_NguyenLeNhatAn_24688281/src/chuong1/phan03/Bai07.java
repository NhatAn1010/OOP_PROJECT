/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 13 thg 9, 2025
 */

package chuong1.phan03;

import java.util.Scanner;

/**
 * Bai07 class
 */
public class Bai07 {
	public static boolean isPrime(int n)
	{
		if(n <= 1) return false;
		for(int i = 2;i <= (int)Math.sqrt(n);i++)
		{
			if(n % i == 0) return false;
		}
		return true;
	}
	
	
	public static int sumPrimeNumber(int n)
	{
		int sum = 0, totalPrimeNumber = 0, countPrime = 0;
		for(int i = 0;i < n;i++)
		{
			if(isPrime(i)) totalPrimeNumber++;
		}

		for(int i = 1; i < n;i++)
		{
			if(isPrime(i)) 
			{
				countPrime++;
				if(countPrime < totalPrimeNumber - 1)
				{
					System.out.print(i + " + ");
					sum += i;
				}
				if(countPrime == totalPrimeNumber)
				{
					sum += i;
					System.out.println(i + " = " + sum);
				}
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào 1 số: ");
		int n = sc.nextInt();
		System.out.println("Tổng các số nguyên tố nhỏ hơn " + n + " là: " + sumPrimeNumber(n));
			
		sc.close();
	}
}