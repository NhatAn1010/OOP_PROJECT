/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 13 thg 9, 2025
 */

package chuong1.phan03;


/**
 * Bai09 class
 */
public class Bai09 {
	public static void splitString(String str)
	{
		String[] parts = str.split(" ");
		for(int i = 0;i < parts.length;i++)
		{
			System.out.println(parts[i]);
		}
	}
	
	public static void main(String[] args) {
		String str = " Lap  Trinh    HDT";
		String str_clean = str.trim().replaceAll("\\s+"," ");
		splitString(str_clean);
	}
}

