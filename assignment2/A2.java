package assignment2;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input(5, 5);
		
	}
	static void input(int x, int y)
	{
		if(x > 0 && y > 0) {
			System.out.println("1st quadrant");
		} else if (x > 0 && y < 0) {
			System.out.println("4th quadarant");
		} else if (x < 0 && y > 0) {
			System.out.println("2nd quadrant");
		} else if (x < 0 && y < 0) {
			System.out.println("3rd quadrant");
		} else if ( x == 0 && y != 0) {
			System.out.println("Y axis");
		} else if(x != 0 && y==0) {
			System.out.println("x axis");
		} else {
			System.out.println("origin");
		}
	}
}
