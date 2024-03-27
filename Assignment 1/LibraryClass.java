
public class LibraryClass {
	String bookname;
	String author;
	int year;
	
	public static void main(String[] args) {
		LibraryClass book1 = new LibraryClass();
		LibraryClass book2 = new LibraryClass();
		
		book1.author="Charles";
		book1.bookname="Leaders eat last";
		book1.year=2019;
		
		book2.author="Bobby";
		book2.bookname="Two face";
		book2.year=2020;
		
		System.out.println("Book name is:"+book1.bookname+"\nAuthor is:"+book1.author+"\nPublishing year is:"+book1.year);
		System.out.println("Book name is:"+book2.bookname+"\nAuthor is:"+book2.author+"\nPublishing year is:"+book2.year);
	}

}
