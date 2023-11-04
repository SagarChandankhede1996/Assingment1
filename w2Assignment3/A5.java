package w2Assignment3;
import java.util.Scanner;
import java.util.*;

class DuplicateNumberException extends RuntimeException {

	public DuplicateNumberException() {
	}
	public DuplicateNumberException(String Message) {
		super(Message);
	}

}
public class A5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		int[] a=new int[6];
		for(int i=0; i<a.length;i++) {
			System.out.print("Enter integer " + (i + 1) + ": ");
			a[i] = sc.nextInt();
		
		}
		int flag=0;
		for(int i=0; i<a.length;i++) {
			
		if(i>=a.length-1) {
			break;
		}
			try {
				
				for(int j=i+1;j<a.length;j++) {
					if (a[i]==a[j]) {
						
						throw new DuplicateNumberException();
					}
				}
				
			} catch (DuplicateNumberException e) {
				flag=1;
				System.err.println("Error: Duplicate no found: "+a[i]);
			}
		}
			if (flag!=1) {
	            System.out.println("No duplicate numbers!");
	          
	        }
		
		
	}
}