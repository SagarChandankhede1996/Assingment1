package miniProject;

import java.util.Scanner;

class  CompetitionLog {
	private int playerNumber;
	private String completeSets;
	private String inCompleteSets;
	private int piecesBuilt;

	public CompetitionLog(int playerNumber) {
		this.playerNumber=playerNumber;
		this.completeSets="";
		this.inCompleteSets="";
		this.piecesBuilt=0;
	}
	public int getPlayerNumber()
	{
		return this.playerNumber;
	}
	public String getCompleteSets()
	{
		return this.completeSets;
	}
	public String getIncompleteSets()
	{
		return this.inCompleteSets;
	}
	public int getPiecesBuilt()
	{
		return this.piecesBuilt;
	}

	public void setCompleteSets(String completeSets) {
		this.completeSets=completeSets;
	}
	public void setIncompletesets(String incompleteSets) {
		this.inCompleteSets=incompleteSets;
	}
	public void setPiecesBuilt(int piecesBuilt) {
		this.piecesBuilt=piecesBuilt;
	}
	public String legoString() {
		//		Player <playerNumber> completed the following sets: <completesets>
		//		Player <playerNumber> didnot completed the following sets: <incompletesets>
		//		Player <playerNumber> built total of <pieces built> pieces

		return  "Player "+this.playerNumber+" completed the following sets: "+this.completeSets+
				"\nPlayer "+this.playerNumber+" didnot completed the following sets: "+this.inCompleteSets+
				"\nPlayer "+this.playerNumber+" built total of "+this.piecesBuilt+" pieces";

	}

}

public class LegoSetCompetiotion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int day = 1;
		int pbPlayer1 = 0;
		int pbPlayer2 = 0;
		CompetitionLog p1=new CompetitionLog(1);
		CompetitionLog p2=new CompetitionLog(2);
		Scanner sc =new Scanner(System.in);
//		Scanner sc =new Scanner(System.in);
		String[] LegoName= new String[3];
		int[] countP= new int[3];
		for(int i=0; i<3;i++)
		{
			System.out.println("Enter the Name of the Lego set "+(i+1));

			LegoName[i]=sc.nextLine();

			System.out.println("Enter the Number of picses the Lego set "+(i+1));
			
			countP[i]=sc.nextInt();
			sc.nextLine();
		}
	
		while (true) {

			System.out.println("No of pieces Player 1 use for building Day "+day);
			pbPlayer1 += sc.nextInt();
			System.out.println("No of pieces Player 2 use for building Day "+day);
			pbPlayer2 += sc.nextInt();

			day++;

			if (pbPlayer1 >= getTotalPieces(countP) || pbPlayer2 >= getTotalPieces(countP)) {
				break;
			}
		}
		
		winner(pbPlayer1, pbPlayer2, LegoName);
		for(int i=0; i<3;i++)
		{
			p1.setCompleteSets(LegoName[i]);
			p1.legoString();
		}
		
		System.out.println("Player 1 built a total of" + pbPlayer1 + " pieces.");
		System.out.println("Player 2 built a total of" + pbPlayer2 + " pieces.");
		System.out.println("the Competition lasted:"+day+" day");
		
		sc.close();
}


public static int getTotalPieces(int[] pieceCounts) {
	int total = 0;
	for (int count : pieceCounts) {
		total += count;
	}
	return total;
}
public static void winner(int pbPlayer1, int pbPlayer2, String[] LegoName) {
	CompetitionLog p1=new CompetitionLog(1);
	CompetitionLog p2=new CompetitionLog(2);
	if (pbPlayer1 > pbPlayer2) {
		
		System.out.println("congratulation to player 1 for winning the lego set competition");
		System.out.print("player 1 complete the following sets :");
		for (String name : LegoName) {
			System.out.print(name+" ");
		}
		System.out.println();
		
		System.out.println("player 1 did not complete the following sets : None");
	} else if (pbPlayer2 > pbPlayer1) {
		
		System.out.println("congratulation to player 2 for winning the lego set competition");
		System.out.print("player 2 complete the following sets :");
		for (String name : LegoName) {
			System.out.print(name+" ");
		}
		System.out.println();
		System.out.println("player 2 did not complete the following sets : None");
	} else {
		System.out.println("Its a tie need to Start a tiebreaker round with new sets");
		for (String Name : LegoName) {
			System.out.println("New set: " + Name);
			
		}
	}
}
}