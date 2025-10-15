/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 14 thg 9, 2025
 */

package chuong1.phan03;
import java.util.*;

/**
 * Bai13 class
 */
public class Bai13 {
	public static int sumTenFirstEvenNumber(int n)
	{
		int countEven = 0, sum = 0;
		for(int i = 0;i <= n;i++)
		{
			if(i % 2 == 0 && countEven <= 10)
			{
				countEven++;
				sum += i;
			}
			if(countEven > 10) break;
		}		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhập vào n: "); n = sc.nextInt();
		
		int sum = sumTenFirstEvenNumber(n);
		System.out.println("Tổng của 10 số chẵn đầu tiên là: " + sum);
		
		sc.close();
	}
}

