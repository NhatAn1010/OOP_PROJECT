/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 14 thg 9, 2025
 */

package chuong1.phan03;

/**
 * Bai17 class
 */
public class Bai17 {
	public static void printTriangle(int m)
	{
		for(int i = 1;i <= m;i++)
		{
			for(int j = 1;j <= i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=".repeat(15));
		
		for(int i = m;i >= 1;i--)
		{
			for(int j = 1;j <= i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=".repeat(15));
		
		for(int i = 1;i <= m;i++)
		{
			for(int j = 1;j <= m - i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k = 1;k <= 2 * i - 1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=".repeat(15));
		
		for(int i = 1;i <= m;i++)
		{
			for(int j = 1;j <= m - i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k = 1;k <= 2 * i - 1;k++)
			{
				if (k == 1 || k == 2 * i - 1 || i == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		printTriangle(7);
	}
}

