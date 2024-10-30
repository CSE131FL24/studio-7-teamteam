package studio7;

public class Hockey {
	private String name;
	private int num;
	private String shoot_hand;
	private int goal_cur;
	private int points_cur;
	private int goal_total;
	private int points_total;
	
	public Hockey(String name, int num, String shoot_hand, int goal_cur, int points_cur, int goal_total, int points_total) {
		this.name = name;
		this.num = num;
		this.shoot_hand = shoot_hand;
		this.goal_cur = goal_cur;
		this.points_cur = points_cur;
		this.goal_total = goal_total;
		this.points_total = points_total;
		
	}
	public String getShoot_hand() {
		return shoot_hand;
	}
	public void setShoot_hand(String shoot_hand) {
		this.shoot_hand = shoot_hand;
	}
	public int getGoal_cur() {
		return goal_cur;
	}
	public void setGoal_cur(int goal_cur) {
		this.goal_cur = goal_cur;
		this.goal_total += goal_cur;
	}
	public int getPoints_cur() {
		return points_cur;
	}
	public void setPoints_cur(int points_cur) {
		this.points_cur = points_cur;
		this.points_total += points_cur;
	}
	public int getGoal_total() {
		return goal_total;
	}
	
	public int getPoints_total() {
		return points_total;
	}
	
	public String toString() {
		return name + "\t\t" + num + "\t" + shoot_hand + "\t\t" + goal_cur + "\t\t" + points_cur + "\t\t" + goal_total + "\t\t" + points_total;
	}
	

}
