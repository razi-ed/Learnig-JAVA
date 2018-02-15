class Triangle extends Figure {
	
	public Triangle(double a, double b) {
		super(a, b);
	}
	
	public double area() {
		return 0.5 * d1 * d2;
	}
	
}