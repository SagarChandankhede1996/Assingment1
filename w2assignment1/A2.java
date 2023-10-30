package w2assignment1;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Input String :-");
		String in = sc.nextLine();
		
		System.out.println("Character to replace :-");
		String cr=sc.next();
		sc.nextLine();
		System.out.println("Replacement Character :-");
		String rc=sc.next();
		sc.nextLine();
		
		String output="";
		for(int i=0; i< in.length(); i++)
		{
			char value=in.charAt(i);
			String ch = Character.toString(value);
			if(ch.equals(cr)) {
				output = in.replace(ch, rc);
				
			}
		}
		System.out.println(output);
		
		sc.close();
	}

}
