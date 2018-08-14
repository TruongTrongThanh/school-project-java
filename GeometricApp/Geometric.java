public class Geometric {

    // Dữ liệu
	private String name; // tên
    private double x, y; // tọa độ
    // Dữ liệu
    
    // Phương thức khởi tạo
	public Geometric(){}
	public Geometric(String name, double x, double y) {
		this.name = name;
		this.x = x;
		this.y = y;
    }
    // Phương thức khởi tạo
    
    // Phương thức GET SET
    public void setName(String value) {
        name = value;
    }
    public String getName() {
        return name;
    }
    
	@Override
	public String toString() {
        return "Tên: " + name + "\nTọa độ: x = " + x + ", y = " + y;
        
	}
}