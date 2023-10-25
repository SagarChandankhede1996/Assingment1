package assignment3;

public class A4 {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();

//can use scanner also, I have not used for your simplification
		int n=4;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n-i; j++)
			{
				System.out.print("  ");
			}

			for(int j=i; j>=1; j--)
			{

				System.out.print(j+" ");
			}
			

			for(int j=2; j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();

		}
	}
}