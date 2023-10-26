package assignment4;

public class A3 {

	public static void main(String[] args) {
		
		int[] ev = {850,945,1145,1155,1230,1245,1330,1340,1425,1445};
		int min=60, inTime=0, oTime=0, sum=0;
		for(int i=0; i< ev.length;i++)
		{
			int m=0;
			if(i%2==0) {
				m=ev[i]%100;
				if(ev[i]<900) {
					inTime=min-m;
				} else {
					inTime=m;
				}
		
			} else {
				oTime=ev[i]%100;
				
			}
			
			if(ev[i]<900)
			{
				sum=oTime+inTime;
			}else {
				sum+=oTime-inTime;
			}
			
		}
		int Ohr=sum/100;
		int Omin= sum%100;
		System.out.printf("%d hrs %d min",Ohr, Omin);
	}
}
