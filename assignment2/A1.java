package assignment2;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CosFun(60);
				
	}
	static void CosFun(double n)
	{
	
		double x=Math.toRadians(n);
		double a=1, sum=1;
		long b=1;
		int m=-1;
		
		for(int i=1; i<=20;i++)
		{
			a *= x;//a = a*i;
			b *= i;
			
			if(i%2 == 0) {
				sum += a/b*m;
				m = -m;
			}
		}
		float sumr=(float) sum; 
		System.out.println("Cos("+n+") = "+sumr);
	}
}
