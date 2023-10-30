package w2assignment1;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input :- ");
		String in=sc.nextLine();
		int count1=0;
		int count2=0;
		
		for(int i=0; i<in.length();i++)
		{
			char ch=in.charAt(i);
			if(ch=='(')
			{
				count1++;
			} else if (ch==')') {
				count2++;
			}
		}
		if(count1==count2)
		{
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		sc.close();
	}

}
