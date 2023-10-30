package w2assignment1;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter input Statement :- ");
		String in=sc.nextLine();
		String[] sep = in.split(" ");
		String rev="";
		for(int i=sep.length-1; i>=0 ;i--) 
		{
			
				rev=rev+sep[i]+" ";
				
		}
		System.out.println(rev);
		sc.close();
	}

}
