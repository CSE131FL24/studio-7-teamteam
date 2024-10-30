package studio7;

public class Die {
	private static int faces;
	
	public Die(int faces) {
		this.faces = faces;
	}

	public static int getFaces() {
		return faces;
	}

	public static void setFaces(int faces) {
		Die.faces = faces;
	}
	
	public int dot() {
		return (int) (Math.random()*faces + 1);
	}
	
	public static void main(String[] args) {
		Die die = new Die(6);
		System.out.println(die.dot());
	}

}
