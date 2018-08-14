

public class NVBienChe extends NhanVien {
	double hesoluong;
	double luongcoban;
	public NVBienChe(){};
	public NVBienChe(int maNV, String hoten, String diachi, double hesoluong, double luongcoban) {
		super(maNV,hoten,diachi);
		this.hesoluong = hesoluong ;
		this.luongcoban = luongcoban ;
	}
	public double luong(){
		return hesoluong * luongcoban;
	}
	public void nhap(){
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap he so luong: ");
		this.hesoluong = sc.nextDouble();
		System.out.print("Nhap luong co ban: ");
		this.luongcoban = sc.nextDouble();
	}
}
