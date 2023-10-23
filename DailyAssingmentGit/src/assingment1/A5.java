package assingment1;

public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input 3 numbers and find the largest.
//		Test Case:
//		Input: 7
//		3
//		5
//		Output: 7
//
//		Condition : Your program cannot have more than 2 comparisons.
		
		int a=7;
		int b=3;
		int c=5;
		
		if(a>b && a>c) {
			System.out.println(a);
		} else if (b>c && b>a) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}

}
