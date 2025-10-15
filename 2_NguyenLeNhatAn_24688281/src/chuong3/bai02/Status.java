/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 26 thg 9, 2025
 */

package chuong3.bai02;

/**
 * Status class
 */
public enum Status {
	NEW("mới"),
	OLD("cũ");
	
	private String status;
	
	private Status(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return status;
	}
	
}

