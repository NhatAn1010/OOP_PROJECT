/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 14 thg 9, 2025
 */

package chuong1.phan03;

import java.util.Scanner;

/**
 * Bai14 class
 */
public class Bai14 {
	public static void inputArr(int[] a, int n, Scanner sc)
	{
		for(int i = 0;i < n;i++)
		{
			System.out.printf("Nhập vào a[%d]: ", i);
			a[i] = sc.nextInt();
		}
	}
	
	public static boolean checkKInArr(int[] a, int n, int k)
	{
		for(int i = 0;i < n;i++)
		{
			if(a[i] == k) return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idx, k;
		System.out.print("Nhập vào chỉ số cho mảng: "); idx = sc.nextInt();
		System.out.print("Nhập vào số cần tìm trong mảng: "); k = sc.nextInt();
		int[] a = new int[idx];
		inputArr(a, idx, sc);
		if(checkKInArr(a, idx, k)) System.out.println("Tồn tại");
		else System.out.println("Không tồn tại");
		sc.close();
	}
}

