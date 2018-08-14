
public class Faculty extends Employee {
	private int workingTime;
	
	public Faculty(String name, String address, String number, String email, int roomNumber, double salary, String startDate, String position, int workingTime) {
		super(name, address, number, email, roomNumber, salary, startDate, position);
		this.workingTime = workingTime;
	}
	
	@Override
	public String toString() {
		String s = "";
		
		s += super.toString();
		s += "Working time: " + workingTime + "\n";
		
		return s;
	}
}
