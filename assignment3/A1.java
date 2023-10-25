package assignment3;

import java.util.Scanner;

@SuppressWarnings("unused")
public class A1 {

	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();

//can use scanner also, I have not used for your simplification
		int n=5;
		for(int i=n; i>=1;i--)//5
		{
			for(int j=i;j<=n; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
