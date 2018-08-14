import java.text.ParseException;
import java.util.Scanner;

public class NVHopDong extends NhanVien {
	int sosanpham;
    double tienmoiSP;
    

    @Override
	public double tinhLuong(){
		return sosanpham * tienmoiSP;
	}
	public void nhap() throws ParseException{
		super.nhap();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so san pham: ");
		this.sosanpham = sc.nextInt();
		System.out.print("Nhap tien moi san pham: ");
		this.tienmoiSP = sc.nextDouble();
	}
	
	@Override
	public String toString() {
		return super.toString() + "Luong: " + tinhLuong();
	}
}