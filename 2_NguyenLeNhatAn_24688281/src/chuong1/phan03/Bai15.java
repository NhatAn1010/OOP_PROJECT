/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 14 thg 9, 2025
 */

package chuong1.phan03;

import java.util.Scanner;

/**
 * Bai15 class
 */
public class Bai15 {
	public static void inputArr(int[] a, int n, Scanner sc)
	{
		for(int i = 0;i < n;i++)
		{
			System.out.printf("Nhập vào a[%d]: ", i);
			a[i] = sc.nextInt();
		}
	}
	
	public static void printMaxElement(int[] a, int n)
	{
		int max = a[0];
		for(int i = 1;i < n;i++)
		{
			if(a[i] > max) max = a[i];
		}
		System.out.println("Max Element = " + max);
	}
	
	public static void printMinElement(int[] a, int n)
	{
		int min = a[0];
		for(int i = 1;i < n;i++)
		{
			if(a[i] < min) min = a[i];
		}
		System.out.println("Min Element = " + min);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idx;
		System.out.print("Nhập vào chỉ số cho mảng: "); idx = sc.nextInt();
		int[] a = new int[idx];
		inputArr(a, idx, sc);
		printMaxElement(a, idx);
		printMinElement(a, idx);
		sc.close();
	}
}

