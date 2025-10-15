/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 13 thg 9, 2025
 */

package chuong1.phan03;

import java.util.Random;

/**
 * Bai02 class
 */
public class Bai02 {
	public static void main(String[] args) {
		//for-index
		System.out.println("Bài dùng for-index");
		for(int i = 1;i <= 11;i++) System.out.println("Count is: " + i);
		System.out.println("=".repeat(10));
		
		// while
		System.out.println("Bài dùng while");
		int count = 1;
		while(count < 11)
		{
			System.out.println("Count is: " + count);
			count++;
		}
		
		System.out.println("=".repeat(10));
		//do-while
		count = 1;
		System.out.println("Bài dùng do-while");
		do
		{
			System.out.println("Count is: " + count);
			count++;
		} while(count < 11);
		
		// random
		System.out.println("=".repeat(10));
		System.out.println("Bài dùng Random");
		
		Random rd = new Random();
		int i1 = rd.nextInt();
		System.out.println("i1 = " + i1);
		
		// phát sinh trong (min; max)
		System.out.println("=".repeat(10));
		System.out.println("Bài dùng Random trong vùng min max");
		int min = 65, max = 80, i2 = rd.nextInt(max - min + 1) + min;
		System.out.println(i2);
	}
}