class FindArea {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(75.5564, 35.3134);
		Triangle trian = new Triangle(15.588, 24.435321);
		
		System.out.println("area of rectangle :"+rect.area());
		System.out.println("area of triangle :"+trian.area());
	}
}