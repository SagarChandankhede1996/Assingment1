package assignment4;

public class A5 {
	public static void main(String[] args) {
		int[] years= {2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010};
		int[] profits = {12, 18, 20, 38, 53, 93, 77, 61, 59, 56};
		
		
		int largest=profits[0];
		for(int i=0; i< profits.length;i++)
		{
			if(profits[i]>largest) {
				largest = profits[i];
			}
		}
		for(int i=0; i< profits.length;i++) 
		{
			if(largest==profits[i]) {
				System.out.println("The Year of decline in profits began is from "+years[i+1]);
			}
		}
	}
}
