/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 14 thg 9, 2025
 */

package chuong2.bai01;

/**
 * Test class
 */
public class Test {
	public static void main(String[] args) {
		ToaDo td = new ToaDo("A", 3.0, 5.6);
		System.out.println(td);
		// nếu k dùng toString thì nó sẽ dùng toString mặc định, in ra hashcode
		//còn nếu Override toString thì nó sẽ dùng toString mà mình tuỳ biến
	}
}

