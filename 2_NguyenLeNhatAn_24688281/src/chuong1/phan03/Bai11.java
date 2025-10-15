/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 13 thg 9, 2025
 */

package chuong1.phan03;

import java.util.Scanner;

/**
 * Bai11 class
 */
public class Bai11 {
	public static int Fibonacci(int n, int[] dp)
	{
		if(n <= 1) return 1;
		
		if(dp[n] != -1) return dp[n];
		
		dp[n] = Fibonacci(n - 1, dp) + Fibonacci(n - 2, dp);
		return dp[n];
	}
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào n: "); n = sc.nextInt();
		int[] dp = new int[n + 1];
		for(int i = 0;i <= n;i++) dp[i] = -1;
		
		for(int i = 0;i <= n;i++)
		{
			System.out.printf("F(%d) = %d\n",i, Fibonacci(i, dp));
		}
		sc.close();
	}
}

