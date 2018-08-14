import java.text.ParseException;
import java.util.Scanner;

public class NVBienChe extends NhanVien {
	double hesoluong;
	double luongcoban;
	
	@Override
	public double tinhLuong(){
		return hesoluong * luongcoban;
	}
	public void nhap() throws ParseException {
		super.nhap();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap he so luong: ");
		this.hesoluong = sc.nextDouble();
		System.out.print("Nhap luong co ban: ");
		this.luongcoban = sc.nextDouble();
	}
	
	@Override
	public String toString() {
		return super.toString() + " Luong: " + tinhLuong();
	}
}
