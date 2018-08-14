
public class Program {

	public static void main(String[] args) {
		Person p = new Person("Võ Thị Sáu", "51 CMT8 Tp.HCM", "0163605748", "vothisau@gmail.com");
		System.out.println(p + "\n");
		
		Student s = new Student("Trương Trọng Thanh", "10 Mậu Thân Phan Thiết", "01636057484", "1651010128thanh@ou.edu.vn", Student.Year.JUNIOR);
		System.out.println(s + "\n");
		
		Employee e = new Employee("Lệ Thị Cẩm Vân", "kk12a3 Tam Đảo Tp.HCM", "0165152487", "lethicamvan@gmail.com", 31, 2000000, "20/2/2018", "Trưởng phòng");
		System.out.println(e + "\n");
		
		Staff sf = new Staff("Trần Lê Ninh", "251 Tô Hiến Thành Tp.HCM", "01654852647", "tranleninh@gmail.com", 24, 3000000, "2/12/2017", "Nhân viên");
		System.out.println(sf + "\n");
		
		Faculty fy = new Faculty("Trần Văn Đang", "12 Nguyễn Tri Phương Tp.HCM", "0165425874", "tranvangdang@gmail.com", 20, 500000, "4/8/2010", "Quản lý", 8);
		System.out.println(fy + "\n");
	}

}
