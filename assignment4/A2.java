package assignment4;

public class A2 {

	public static void main(String[] args) {
//		January  125,000 July      105,000
//		February 93,000  August    120,000
//		March    80,000  September 90,000
//		April    75,000  October   115,000
//		May      84,000  November  123,000
//		June     110,000 December  150,000
//		Write a program to store the quarterly sales report in another array and
//		display the monthly, quarterly and total sales. (Note: January, February,
//		March form the first quarter)

		String[] months= {"January","February","March", "April", "May", "June", "July", "August","September","October","November","December"};
		int[] sales= {125000, 93000, 80000, 75000, 84000, 110000, 105000, 120000, 90000, 115000, 123000, 150000};
		int totalSale=0;
		int[] qSales=new int[4];
		
		int mon=0;
		
		for(int i=0; i<qSales.length;i++)
		{
			
			for(int j=0; j<qSales.length-1; j++)
			{
				qSales[i]+=sales[mon];
				
				totalSale += sales[mon];
				mon++;
			}
	
		}
		for(int i=0; i<sales.length;i++ )
		{
			System.out.println("For "+months[i]+" sales is : "+sales[i]);
		}
		System.out.println();
		for(int i=0; i<qSales.length;i++)
		{
			System.out.println("For quarter "+(i+1)+" sales is : "+qSales[i]);
		}
		System.out.println();
		System.out.println("Total sale is :- "+totalSale);
	}

}
