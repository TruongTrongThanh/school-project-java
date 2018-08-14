import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class NhanVien {
	private int maNV;
	private String hoten,diachi;
	private static NhanVien list[];
	private Date ngaySinh;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public abstract double tinhLuong();
	
	public void nhap() throws ParseException {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap maNV: ");
		this.maNV = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap ho ten: ");
		this.hoten = sc.nextLine();
		System.out.print("Nhap dia chi: ");
		this.diachi = sc.nextLine();
		System.out.print("Nhap ngay sinh: ");
		String dongNguoidungNhap = sc.nextLine(); // 21/11/1998 -> xem là string
		this.ngaySinh = sdf.parse(dongNguoidungNhap); // biến chuỗi String thành Date object
		
	}

	public String toString() {
		return "MaNV: " + maNV + " HoTen: " + hoten + " Diachi: " + diachi + "Ngay sinh: " + sdf.format(ngaySinh); // chuyển Date object -> String
	}
	
	
	// Static method
	public static void nhapDS() throws ParseException {
		Scanner sc = new Scanner(System.in);
		int n,chon=0,index=0;
		System.out.print("Nhap so nhan vien(1-100): ");
		n = sc.nextInt();
		while(n<=0||n>100)
		{
			System.out.println("Nhap so nhan vien ko hop le");
			System.out.println("xin hay nhap lai so nhan vien: ");
			System.out.print("Nhap so nhan vien(1-100): ");
			n = sc.nextInt();
		}
		list = new NhanVien[n];
		for(int i = 0; i<n ; i++)
		{
			do{
			System.out.print("Nhan vien thu " + (i+1) +": \n1.Nhan vien hop dong \n2.Nhan vien bien che \nChon: ");
			chon = sc.nextInt();
			if(chon==1)
			{
				NVHopDong hd = new NVHopDong();
				hd.nhap();
				list[index++]= hd;
			}
			else if(chon==2)
			{
				NVBienChe bc = new NVBienChe();
				bc.nhap();
				list[index++]= bc;
			}
			}while(chon < 1 || chon > 2);
		}
		sc.close();
	}
	public static void xuatDS(){
		for(NhanVien i : list)
		{
			System.out.println(i + "\n");
		}
	}
}