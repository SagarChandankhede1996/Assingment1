package assignment4;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
//		Write a program to input an array from the user and reverse the order of
//		elements in an array in place i.e. without using any additional arrays.
//		Note: Please make the changes in array and not print the array in reverse.
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of Array capacity :-");
		int n=sc.nextInt();
		
		int[] a=new int[n];
		
		System.out.println("Enter "+n+" numbers :- ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0; i<(n)/2; i++)
		{
			int temp=0;
			temp=a[i];
			a[i]=a[n-1-i];
			a[n-1-i]=temp;
		}
		for(int obj : a)
		{
			System.out.print(obj+" ");
		}
	}

}
