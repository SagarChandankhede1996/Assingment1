package assingment1;

public class A6 {

	public static void main(String[] args) {
		//Input a 3 digit number and find whether the given number is an “Armstrong
//		Number”
//		Test Case:
//
//		Input: 153
//		Output : 153 is an Armstrong Number
//		Input: 150
//		Output: 150 is not an Armstrong
		m1(153);
		m1(150);
	}
	static void m1(int n)
	{
		int m,c=0;
		int temp=n;
		
		for(int i=n;i>0;i--)
		{
			m=n%10;//153%10=3, 15%10=5, 1%10=1
			n=n/10;//153/10=15, 15/10=1, 1/10=0;
			c=c+(m*m*m);//0+27=27 ,27+(5*5*5)=27+125=152, 152+(1*1*1)=152+1=153
		}
		if(temp==c)
		{
			System.out.println(temp+" is an Armstrong Number");
		} else {
			System.out.println(temp+" is not an Armstrong");
		}
	}
}
