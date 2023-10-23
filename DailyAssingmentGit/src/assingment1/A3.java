package assingment1;

public class A3 {

	public static void main(String[] args) {
//		Given the days express in the form of Years: Months: Weeks: Days
//		Test Case:
//
//		Input : 1020 days
//		Output: 2 Years : 9 Months: 2 Weeks : 6 Days
//
//		Hint : 365 days make a year, 30 days make a month , 7 days make a week

		int n=1020;
		int y=n/365;
		int r1=n%365;
		int m=r1/30;
		int r2=r1%30;
		int w=r2/7;
		int d=r2%7;
		
		System.out.println(y+" Years : "+m+" Months: "+w+" Weeks : "+d+" Days");
	}

}
