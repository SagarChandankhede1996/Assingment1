package project;

import java.util.Scanner;

class CompetitionLog {
    private int playerNumber;
    private String completeSets;
    private String inCompleteSets;
    private int piecesBuilt;

    public CompetitionLog(int playerNumber) {
        this.playerNumber = playerNumber;
        this.completeSets = "";
        this.inCompleteSets = "";
        this.piecesBuilt = 0;
    }

    public int getPlayerNumber() {
        return this.playerNumber;
    }

    public String getCompleteSets() {
        return this.completeSets;
    }

    public String getIncompleteSets() {
        return this.inCompleteSets;
    }

    public int getPiecesBuilt() {
        return this.piecesBuilt;
    }

    public void setCompleteSets(String completeSets) {
        this.completeSets = completeSets;
    }

    public void setIncompletesets(String incompleteSets) {
        this.inCompleteSets = incompleteSets;
    }

    public void setPiecesBuilt(int piecesBuilt) {
        this.piecesBuilt = piecesBuilt;
    }

    public String legoString() {
        return "Player " + this.playerNumber + " completed the following sets: " + this.completeSets +
                "\nPlayer " + this.playerNumber + " did not complete the following sets: " + this.inCompleteSets +
                "\nPlayer " + this.playerNumber + " built a total of " + this.piecesBuilt + " pieces";
    }
}

public class LegoSetCompetition {
    public static void main(String[] args) throws InterruptedException {
        int day = 1;
        int pbPlayer1 = 0;
        int pbPlayer2 = 0;
        
        CompetitionLog p1 = new CompetitionLog(1);
        CompetitionLog p2 = new CompetitionLog(2);
        
        Scanner sc = new Scanner(System.in);
        
        String[] LegoName = new String[3];
        int[] countP = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the Name of the Lego set " + (i + 1));
            LegoName[i] = sc.nextLine();
            System.out.println("Enter the Number of pieces the Lego set " + (i + 1));
            countP[i] = sc.nextInt();
            
            sc.nextLine();
            
        }
        for(int i=0;i<3; i++)
        {
        	p1.setCompleteSets(LegoName[0]+", "+LegoName[1]+", "+LegoName[2]);
        }

        while (true) {
            System.out.println("No of pieces Player 1 used for building on Day " + day);
            pbPlayer1 += sc.nextInt();
            p1.setPiecesBuilt(pbPlayer1);
            System.out.println("No of pieces Player 2 used for building on Day " + day);
            pbPlayer2 += sc.nextInt();
            p2.setPiecesBuilt(pbPlayer2);

            day++;

            if (pbPlayer1 >= getTotalPieces(countP) || pbPlayer2 >= getTotalPieces(countP)) {
                break;
            }
        }
        if (p1.getPiecesBuilt() > p2.getPiecesBuilt())
        {
        	 
              p1.getCompleteSets();
              p1.getIncompleteSets();
        } else if (p1.getPiecesBuilt() < p2.getPiecesBuilt()){
        	
            p2.getCompleteSets();
            p2.getIncompleteSets();
        }
        if (pbPlayer1 < getTotalPieces(countP) || pbPlayer2 < getTotalPieces(countP))
        {
        	
        }
      
        winner(p1, p2, LegoName, day);

        System.out.println("The competition lasted for " + day + " days");

        sc.close();
    }

    public static int getTotalPieces(int[] pieceCounts) {
        int total = 0;
        for (int count : pieceCounts) {
            total += count;
        }
        return total;
    }

    public static void winner(CompetitionLog p1, CompetitionLog p2, String[] LegoName, int day) {
        if (p1.getPiecesBuilt() > p2.getPiecesBuilt()) {
            System.out.println("Congratulation to player 1 for winning the competition");
            System.out.println("Additional information about the competition result is below:");
            for(int i=0;i<3; i++)
            {
            	p1.setCompleteSets(LegoName[0]+", "+LegoName[1]+", "+LegoName[2]);
            }
           p1.setIncompletesets("None");
            System.out.println(p1.legoString());
            System.out.println(p2.legoString());
        } else if (p2.getPiecesBuilt() > p1.getPiecesBuilt()) {
            System.out.println("Congratulation to player 2 for winning the competition");
            System.out.println("Additional information about the competition result is below:");
            for(int i=0;i<3; i++)
            {
            	p2.setCompleteSets(LegoName[0]+", "+LegoName[1]+", "+LegoName[2]);
            }
           p2.setIncompletesets("None");
            System.out.println(p2.legoString());
            System.out.println(p1.legoString());
        } else {
            System.out.println("It's a tie and the competition lasted for " + day + " days");
            System.out.println("Additional information about the competition result is below:");
            for (String Name : LegoName) {
                System.out.println("New set: " + Name);
            }
        }
    }
}
