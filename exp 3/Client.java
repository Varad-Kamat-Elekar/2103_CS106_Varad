
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Batsman batsman[] = {new Batsman("Rohit Sharma", 184, 41, 45, 46.7f), new Batsman("Virat Kohli", 277, 71, 108, 53.4f)};
		
		Bowler bowler[] = {new Bowler("Rahul Chahar", 12, 122, 0, 0, 1.8f), new Bowler("Jasprit Bumrah", 27, 288, 1, 4, 2.5f)};
		
		
		printBatsman(batsman);
		printBowler(bowler);
		printAll(batsman, bowler);
	}
	
	private static void printBowler(Bowlers[] bowler) {
		for(int i = 0; i < bowler.length; i++) {
			bowler[i].printBowler();
		}
	}

	private static void printBatsman(Batsmen[] batsman) {
		for(int i = 0; i < batsman.length; i++) {
			batsman[i].printBatsman();
		}
		
	}

	static void printAll(Batsmen batsman[], Bowlers bowler[]) {
		for(int i = 0; i < batsman.length; i++) {
			batsman[i].displayResults();
		}
		
		for(int i = 0; i < bowler.length; i++) {
			bowler[i].displayResults();
		}
	}

}
