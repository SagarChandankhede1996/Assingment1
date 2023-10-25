package assignment3;

public class A2 {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();

//can use scanner also, I have not used for your simplification		
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=i;j<=n-1;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
