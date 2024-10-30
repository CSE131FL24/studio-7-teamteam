package studio7;

public class ReadBook {
	private static String title;
	private static String author;
	private static int pages;
	
	public ReadBook(String title, String author, int page) {
		this.title = title;
		this.author = author;
		this.pages  = page;
	}

	public static String getTitle() {
		return title;
	}

	public static void setTitle(String title) {
		ReadBook.title = title;
	}

	public static String getAuthor() {
		return author;
	}

	public static void setAuthor(String author) {
		ReadBook.author = author;
	}

	public static int getPages() {
		return pages;
	}

	public static void setPages(int pages) {
		ReadBook.pages = pages;
	}

	public String toString() {
		return title + " is written by " + author + " has " + pages + " pages.";
	}

}
