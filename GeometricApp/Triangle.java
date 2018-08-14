class Triangle extends Geometric {
	private double side1, side2, side3;
	
	public Triangle() {
		side1 = side2 = side3 = 1.0;
	}
	public Triangle(String name, double x, double y, double side1, double side2, double side3) {
		super(name, x, y);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	@Override
	public String toString() {
		return super.toString() + "\nCạnh 1: " + side1 + ", Cạnh 2: " + side2 + ", Cạnh 3: " + side3;
	}
}