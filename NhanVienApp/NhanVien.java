public class NhanVien {
	private int maNV;
	private String hoten,diachi;
	NV list[];
	
	public NV(){};
	public NV(int maNV, String hoten, String diachi) {
		this.maNV = maNV;
		this.hoten = hoten;
		this.diachi = diachi;
	}
	public double luong(){
		return 0;
	}
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap maNV: ");
		this.maNV = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap ho ten: ");
		this.hoten = sc.nextLine();
		System.out.print("Nhap dia chi: ");
		this.diachi = sc.nextLine();
	}
	public void xuat(){
		System.out.println("MaNV: " + maNV + " HoTen: " + hoten + " Diachi: " + diachi + " luong:" + luong());
	}
	public void nhapDS(){
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
		list = new NV[n];
		for(int i = 0; i<n ; i++)
		{
			do{
			System.out.print("Nhan vien thu " + (i+1) +": \n1.Nhan vien hop dong \n2.Nhan vien bien che \nChon: ");
			chon = sc.nextInt();
			if(chon==1)
			{
				NVHD hd = new NVHD();
				hd.nhap();
				list[index++]= hd;
			}
			else if(chon==2)
			{
				NVBC bc = new NVBC();
				bc.nhap();
				list[index++]= bc;
			}
			}while(chon < 1 || chon > 2);
		}
	}
	public void xuatDS(){
		for(NV i : list)
		{
			i.xuat();
			System.out.println(" ");
		}
	}
}