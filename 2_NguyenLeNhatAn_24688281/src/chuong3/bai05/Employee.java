package chuong3.bai05;

public abstract class Employee {
	protected String firstName, lastName, SSN;
	public Employee() {}
	
	public Employee(String firstName, String lastName, String sSN) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.SSN = sSN;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if(firstName == null || firstName.isEmpty())
			throw new IllegalArgumentException("Họ nhân viên không được rỗng hoặc trống");
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if(lastName == null || lastName.isEmpty())
			throw new IllegalArgumentException("Tên nhân viên không được rỗng hoặc trống");
		this.lastName = lastName;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		if(sSN == null || sSN.isEmpty())
			throw new IllegalArgumentException("SSN nhân viên không được rỗng hoặc trống");
		SSN = sSN;
	}
	
	@Override
	public String toString() {
		return String.format("%s | %s | %s",
				firstName,
				lastName,
				SSN
		);
	}
	
}
