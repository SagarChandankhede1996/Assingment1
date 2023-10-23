package assingment1;

public class A7 {

	public static void main(String[] args) {
//		The military uses a 4-digit number system for communicating the time of day.
//		For example, 2350 hours ie 23 hours and 50 minutes in 24-hour clock which is
//
//		11:50pm.
//
//		Write a program to input the 4-digit time and convert it to 12-hour format.
//		Eg: 2350 >>> 11:50pm
		
		int n=2350;
		
		int hour=n/100;
		int min=n%100;
		int th=hour/2;
		
		System.out.println(th+":"+min+"pm");
	}

}
