
public class Student extends Person {
	public enum Year {
		FRESHMAN, SOPHOMORE, JUNIOR, SENIOR
	}
	private Year year;
	
	public Student() {
		year = Year.FRESHMAN;
	}
	public Student(String name, String address, String number, String email, Year year) {
		super(name, address, number, email);
		this.year = year;
	}
	
	public String getYear() {
		switch (year) {
			case FRESHMAN:
				return "Năm nhất";
			case SOPHOMORE:
				return "Năm hai";
			case JUNIOR:
				return "Năm ba";
			case SENIOR:
				return "Năm tư";
			default:
				return "NULL";
		}
	}
	
	@Override
	public String toString() {
		String s = "";
		
		s += super.toString();
		s += "Year: " + getYear() + "\n";
		
		return s;
	}
}
