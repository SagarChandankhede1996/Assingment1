package assignment3;

public class A3 {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();

//can use scanner also, I have not used for your simplification

		int n=5;
		for(int i=1;i<=n; i++)
		{
			for(int j=1; j<=i-1;j++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=2*n; j++)
			{
				if(i>1 && i<5 && j>1 && j<10)
				{
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
	}

}
