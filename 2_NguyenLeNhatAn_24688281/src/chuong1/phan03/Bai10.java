/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 13 thg 9, 2025
 */

package chuong1.phan03;

import java.util.Scanner;

/**
 * Bai10 class
 */
public class Bai10 {
	public static int countDigit(String s)
	{
		int count = 0;
		for(int i = 0;i < s.length();i++)
		{
			if(Character.isDigit(s.charAt(i))) count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.print("Nhập vào 1 chuỗi: "); s = sc.nextLine();
		int count = countDigit(s);
		System.out.println("Số ký tự là số trong chuỗi " + s + " là: " + count);
		
		sc.close();
	}
}