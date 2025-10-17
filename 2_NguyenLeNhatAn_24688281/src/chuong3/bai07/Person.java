package chuong3.bai07;

import java.util.Objects;

public abstract class Person {
	protected String name;
	protected String address;
	protected abstract Rating rate();
	
	public Person() {
	}
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name == null || name.isEmpty())
			throw new IllegalArgumentException("Name must not be null");
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if(address == null || address.isEmpty())
			throw new IllegalArgumentException("Address must not be null");
		this.address = address;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return String.format("%-16s | %-15s",
				name,
				address
		);
	}
}
