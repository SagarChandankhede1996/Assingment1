package assignment3;

public class A5 {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();

//can use scanner also, I have not used for your simplification
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n-i; j++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=2*i-1; j++)
			{
				if(j>1 && j<2*i-1 && i>1 && i<=5)
				{
					System.out.print("  ");
				} else {
					System.out.print(i+" ");
				}
				
			}
			System.out.println();
		}
		for(int i=n-1; i>=1; i--)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=2*i-1; j++)
			{
				if(j>1 && j<2*i-1 && i>1 && i<5)
				{
					System.out.print("  ");
				} else {
					System.out.print(i+" ");
				}
				
			}
			System.out.println();
		}
	}

}
