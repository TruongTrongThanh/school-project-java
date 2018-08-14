import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Employee extends Person {
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	protected int roomNumber;
	protected double salary;
	protected Date startDate;
	protected String position;
	
	public Employee() {
		roomNumber = 0;
		salary = 0.0;
		startDate = new Date();
	}
	public Employee(String name, String address, String number, String email, int roomNumber, double salary, String startDate, String position) {
		super(name, address, number, email);
		this.roomNumber = roomNumber;
		this.salary = salary;
		this.position = position;
		
		try {
			this.startDate = sdf.parse(startDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getStartDate() {
		return sdf.format(startDate);
	}
	
	@Override
	public String toString() {
		String s = "";
		
		s += super.toString();
		s += "Room number: " + roomNumber + "\n";
		s += "Salary: " + salary + "\n";
		s += "Start date: " + getStartDate() + "\n";
		s += "Position: " + position + "\n";
		
		return s;
	}
}
