package studio7;

public class ReadBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadBook Book = new ReadBook("Harry Potter - Philosopher's Stone", "J. K. Rowling", 223);
		String info = Book.toString();
		System.out.println(info);
	}

}
