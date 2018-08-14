

public class NVHopDong extends NhanVien {
	int sosanpham;
    double tienmoiSP;
    
    public NVHopDong(){};
    
	public NVHopDong (int maNV, String hoten, String diachi, int sosanpham, double tiemmoiSP) {
		super(maNV,hoten,diachi);
		this.sosanpham = sosanpham;
		this.tienmoiSP = tienmoiSP;
    }
    
	public double luong(){
		return sosanpham * tienmoiSP;
	}
	public void nhap(){
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so san pham: ");
		this.sosanpham = sc.nextInt();
		System.out.print("Nhap tien moi san pham: ");
		this.tienmoiSP = sc.nextDouble();
	}
}