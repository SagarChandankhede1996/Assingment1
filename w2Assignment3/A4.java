package w2Assignment3;

import java.util.Random;
import java.util.Scanner;


public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index value:-");
		int c=sc.nextInt();
		int[] n=new int[100];
		Random random = new Random();
		 for (int i = 0; i < 100; i++) {
			 n[i] = random.nextInt(1000);
	        }
		
		try {
			if(n.length<c||c<0) {
				throw new IndexOutOfBoundsException();
			} else {
				System.out.println("index condition satisfied");
			}
		} catch (Exception i) {
			System.err.println("Out of bound");
		}
	}

}
