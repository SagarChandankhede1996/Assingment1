package w2assignment1;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Input :- ");
		String in=sc.nextLine();
		
		String sep="";
		for(int i=0; i<in.length(); i++)
		{
			char ch=in.charAt(i);
			if(ch!=' ' && ch!=',') {
				sep+=ch;
			} 
		}
		StringBuffer sb=new StringBuffer(sep);
		String output = sb.reverse().toString();
		
		if(sep.equalsIgnoreCase(output))
		{
			System.out.println("True");
		} else {
			System.out.println("false");
		}
		sc.close();
	}

}
