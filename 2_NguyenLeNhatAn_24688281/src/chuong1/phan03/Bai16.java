/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 14 thg 9, 2025
 */

package chuong1.phan03;

import java.util.Scanner;

/**
 * Bai16 class
 */
public class Bai16 {
	public static void inputArr(String[] a, int n, Scanner sc)
	{
		for(int i = 0;i < n;i++)
		{
			System.out.printf("Nhập vào a[%s]: ", i);
			a[i] = sc.nextLine();
		}
	}
	
	public static boolean checkStringInArr(String[] a, int n, String str)
	{
		for(int i = 0;i < n;i++)
		{
			System.out.println(a[i]);
			if(a[i].equalsIgnoreCase(str)) return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int idx;
		String checkString;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào chỉ số cho mảng: "); idx = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập vào chuỗi cần kiểm tra: "); checkString = sc.nextLine();
		String[] a = new String[idx];
		
		inputArr(a, idx, sc);
		if(checkStringInArr(a, idx, checkString)) System.out.println("Tồn tại");
		else System.out.println("Không tồn tại");
	}
}

