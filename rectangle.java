package JavaProject;
class Rectangle {
	private double width;
	private double length;
	public Rectangle(double width,double length) {
		this.width=width;
		this.length=length;
	}
	public double getArea() {
		return width*length;
	}
	public double getPerimeter() {
		return 2*(width+length);
	}
}
 class Square extends Rectangle{
	public Square (double width, double length) {
		super(width, length);
	}

}