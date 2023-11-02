package w2Assignment4;
interface shape{
	double getArea();
}
class Rectangle implements shape{
	private double x;
	private double y;
	public Rectangle(int X, int Y) {
		this.x=X;
		this.y=Y;
	}
	@Override
	public double getArea() {
	
		return x*y;
	}
	
}
class Circle implements shape{
private double r;
	public Circle(int R) {
		this.r=R;
	}
	@Override
	public double getArea() {
		
		return r*r*(22.0/7);
	}
	
}
public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle(3, 5);
		System.out.println("Area of Reactangle : "+r.getArea());
		
		Circle c=new Circle(5);
		System.out.println("Area of Circle : "+c.getArea());
		
	}

}
