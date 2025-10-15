/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 13 thg 9, 2025
 */

package chuong1.phan03;

import java.util.Scanner;

/**
 * Bai08 class
 */
public class Bai08 {
	public static int countCharacterExist(String str, char x)
	{
		int count = 0, len = str.length();
		for(int i = 0;i < len;i++)
		{
			if(str.charAt(i) == x) count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str; char x = 'a';
		System.out.print("Nhập vào chuỗi: "); str = sc.nextLine();
		int countChar = countCharacterExist(str, x);
		System.out.println("Số lần xuất hiện kí tự a là: " + countChar);
		
		sc.close();
	}
}

