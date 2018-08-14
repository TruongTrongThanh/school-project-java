
public class Person {
	protected String name, address, number, email;
	
	public Person() {
		name = "Nguyễn Văn A";
		address = "520 CMT8 quận 10";
		number = "01234567891";
		email = "example@gmail.com.vn";
	}
	public Person(String name, String address, String number, String email) {
		this.name = name;
		this.address = address;
		this.number = number;
		this.email = email;
	}
	
	@Override
	public String toString() {
		String s = "";
		s += "Name: " + name + "\n";
		s += "Address: " + address + "\n";
		s += "Phone number: " + number + "\n";
		s += "Email: " + email + "\n";
		
		return s;
	}
}
