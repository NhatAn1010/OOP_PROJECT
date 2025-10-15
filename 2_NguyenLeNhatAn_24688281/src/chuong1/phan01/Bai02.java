/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 13 thg 9, 2025
 */

package chuong1.phan01;

import java.util.Scanner;

/**
 * Bai02 class
 */
public class Bai02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào tên của bạn: ");
		String name = sc.nextLine();
		
		System.out.println("Xin chào " + name);
		sc.close();
	}
}
