package assingment1;

import java.util.Scanner;

@SuppressWarnings("unused")
public class A2 {

	public static void main(String[] args) {
//		Write a program to swap both halfs of a 4 digit number.
//		Input a 4-digit number. Interchange the first half with the second half.
//		Test case:
//		Input: 4523
//		Output : 2345
		
		
//		Scanner sc =new Scanner(System.in); can use scanner also
//		int n=sc.nextInt();
		int n=4523;
		
		int u=n%10;//3
		int t=n%100/10;//2
		int h=n%1000/100;//5
		int th=n/1000;//4
	
		int output=t*1000+u*100+th*10+h;
		System.out.println(output);
	}

}
