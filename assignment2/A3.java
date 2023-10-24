package assignment2;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Lower = ");
		int l=sc.nextInt();
		System.out.print("Enter upper = ");
		int u=sc.nextInt();
		
		int[] a=new int[u];
		a[0]=0;
		a[1]=1;
		for (int i=2; i<=a.length-1; i++)
		{
			a[i]=a[i-1]+a[i-2];
		}
		for(int obj:a)
		{
			if(obj >= l && obj <=u) {
				System.out.println(obj);
			}
			
		}
	}

}
