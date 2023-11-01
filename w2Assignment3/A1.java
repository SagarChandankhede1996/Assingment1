package w2Assignment3;

import java.util.Scanner;

class NoMatchException extends RuntimeException {
	public NoMatchException() {
		
	}
	public NoMatchException(String message) {
		super(message);
	}
}
class StringMatch {
	public static String match(String o) {
		if(o!="India") {
			throw new NoMatchException("Input String is not matching");
		}
			return "sucssess! String is matching";
	
	}
}
public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		String s=StringMatch.match(sc.nextLine());
		try {
			String s=StringMatch.match("India");
			System.out.println(s);
			String s1=StringMatch.match("bagladesh");
			System.out.println(s1);
		} catch (NoMatchException n) {
			System.err.println(n.getMessage());
		}
	}

}
