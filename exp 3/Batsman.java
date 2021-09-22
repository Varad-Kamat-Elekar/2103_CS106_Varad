
public class Batsman {
	String name;
	int numOfGamesPlayed, numOfCenturies, fiftiesScored;
	float avgRunsScored;
	
	
	
	Batsman(String name, int fiftiesScored, int numOfGamesPlayed,int numOfCenturies,float avgRunsScored){
		this.name = name;
		this.numOfGamesPlayed  = numOfGamesPlayed;
		this.numOfCenturies = numOfCenturies;
		this.fiftiesScored = fiftiesScored;
		this.avgRunsScored = avgRunsScored;
	}
	
	void displayResults(){
		System.out.println("========== Batsmen of the full team========\n");
		System.out.println("Name of Batsman: " + name);
		System.out.println("Number of games played: " + numOfGamesPlayed);
		System.out.println("Number of centuries scored: " + numOfCenturies);
		System.out.println("Fifties scored: " + fiftiesScored);
		System.out.println("Average runs per over: " + avgRunsScored);
		System.out.println("\n=====================\n");
	}
	
	void printBatsman(){
		System.out.println("==========Each Batsman Stats========\n");
		System.out.println("Name of Batsman: " + name);
		System.out.println("Number of games played: " + numOfGamesPlayed);
		System.out.println("Number of centuries scored: " + numOfCenturies);
		System.out.println("Fifties scored: " + fiftiesScored);
		System.out.println("Average runs per over: " + avgRunsScored);
		System.out.println("\n=====================\n");
	}
}
