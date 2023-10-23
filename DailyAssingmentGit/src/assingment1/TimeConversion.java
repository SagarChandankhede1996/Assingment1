package assingment1;

public class TimeConversion {

	public static void main(String[] args) {
		// Test case:
//		Input: 7000234
//		Output: 1: 56: 40
//		Hint: 1000 milliseconds make 1 second
//		60 Seconds makes 1 minute
//		60 minutes make 1 hour

		int input = 7000234;
		
		int ms=input/1000;
		@SuppressWarnings("unused")
		int r1=input%1000;
		int m=ms/60;
		int sec=ms%60;
		int hour=m/60;
		int min=m%60;
		
		
		System.out.println(hour+" : "+min+" : "+sec);
	}

}
