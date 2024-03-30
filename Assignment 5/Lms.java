class Libraryitem{
	String title;
	String itemtype;
	
	public Libraryitem(String title,String itemtype){
		this.title = title;
        this.itemtype = itemtype;
	}
	
	public void display() {
        System.out.println("Title:" + title + "\nType:" + itemtype);
    }
}


class Book extends Libraryitem {
    String author;

    public Book(String title, String author) {
        super(title, "Book");
        this.author = author;
    }

    public void display() {
        super.display();
        System.out.println("Author: " + author);
    }
}


class DVD extends Libraryitem {
    String director;

    public DVD(String title, String director) {
        super(title, "DVD");
        this.director = director;
    }

    public void display() {
        super.display();
        System.out.println("Director: " + director);
    }
}




public class Lms {
	public static void main(String[] args) {
		Book b = new Book("Java 101", "jhonny bravo");
        DVD d = new DVD("Inception", "Christopher Nolan");
        
        b.display();
        d.display();
	}
	

}
