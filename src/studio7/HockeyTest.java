package studio7;

public class HockeyTest {
	
	public static void output_all(Hockey[] hockeys) {
		System.out.println("Name" + "\t" + "Jersey Number" + "\t" + "Play Hand"  + "\t" + "Current Goals" + "\t" + "Current Points" + "\t" + "Total Goals" + "\t" + "Total Points");
		for (Hockey hockey : hockeys) {
	        System.out.println(hockey.toString());
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hockey[] players = {
		        new Hockey("Alice", 12, "Right", 5, 10, 25, 35),
		        new Hockey("Bob", 9, "Left", 8, 12, 30, 42),
		        new Hockey("Charlie", 22, "Right", 7, 11, 28, 39)
		    };
		System.out.println(players[0].getGoal_cur());
		output_all(players);
	}

}
