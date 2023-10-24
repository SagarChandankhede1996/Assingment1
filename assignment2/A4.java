package assignment2;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Test Data input :-");
		int n=sc.nextInt();
		int x=n*3;
		int[] a=new int[x];
		a[0]=0;
		a[1]=1;
		for (int i=2; i<=a.length-1; i++)
		{
			a[i]=a[i-1]+a[i-2];
		}
		for(int obj:a)
		{
			if(obj%2 == 0) {
				System.out.print(obj+" ");
			}
			
		}
	}

}
