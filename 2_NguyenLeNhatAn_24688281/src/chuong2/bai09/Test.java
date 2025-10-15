/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 25 thg 9, 2025
 */

package chuong2.bai09;

/**
 * Test class
 */
public class Test {
	public static void main(String[] args) {
		ToaDo td = new ToaDo("A", 5, 6);
		HinhTron ht = new HinhTron(td, 5);
		
		System.out.println(ht);
	}
}

