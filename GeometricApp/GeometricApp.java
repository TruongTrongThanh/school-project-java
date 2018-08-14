import java.util.Scanner;

public class GeometricApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập 3 cạnh tam giác: ");
		double side1 = sc.nextDouble();
		double side2 = sc.nextDouble();
		double side3 = sc.nextDouble();
		
		Triangle t = new Triangle("Tam Giác", 10, 8, side1, side2, side3);
		System.out.println(t);
		System.out.println("Diện tích: " + t.getArea() + "\nChu vi: " + t.getPerimeter());

		// cách 2
		Geometric t = new Triangle();
		

		sc.close();
	}

}