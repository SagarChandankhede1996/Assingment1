package w2assignment1;
import java.util.*;
public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Input :- ");		
		String in=sc.nextLine();
		char n=' ',m=' ';
		int count = 0;
		String output="";
		for(int i=0; i<in.length(); i++)
		{			
			int j=i+1;	
			if(j>=in.length())
			{
				break;
			} else {
				char c1=in.charAt(i); char c2=in.charAt(j);
				if(c1==c2) {
					n=c1;
					count++;
					
				} else if (c1 != c2){
					m=c2;
					n=c1;
					output+=(n+""+(count+1));
					n=c2;
					count=0;
				}
			}
		}
		System.out.println(output+m+(count+1));

		sc.close();
	}
}