package assignment4;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,1,0,1,1,1,1,1,1,0,0,1,1,1,0,1,1,1,0,1};
		int present=0;
		int absent=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == 1) {
				present++;
			} else {
				absent++;
			}
		}
		
		double per = present*100.0/(present + absent);
		System.out.printf("The attendance percentage of this student is %.2f %%",per);
	}

}
