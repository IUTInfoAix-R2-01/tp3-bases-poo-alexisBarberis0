package exerciceAuthor;

public class Book {
	private String name;
	private Author[] authors;
	private double price;
	private int qty = 0;
	
	public Book(String name, Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
	}
	
	public Book(String name, Author[] authors, double price, int qty) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}
	
	public String getName() {
		return name;
	}
	
	public Author[] getAuthors() {
		return authors;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public String toString() {
		String stringRep = "Book[name=" + name + ",authors={";
		for (int i = 0 ; i < authors.length-1; ++i) {
			stringRep += authors[i].toString() + ',';
		}
		stringRep += authors[authors.length-1]+ "},price=" + price + ",qty=" + qty + ']';
		return  stringRep;
	}
	
	
	public String getAuthorsNames() {
		String stringRep = "";
		for (int i = 0 ; i < authors.length-1; ++i) {
			stringRep += authors[i].getName() + ',';
		}
		stringRep += authors[authors.length-1].getName();
		return stringRep;
	}
	
	public String getAuthorsEmails() {
		String stringRep = "";
		for (int i = 0 ; i < authors.length-1; ++i) {
			stringRep += authors[i].getEmail() + ',';
		}
		stringRep += authors[authors.length-1].getEmail();
		return stringRep;
	}
	
	public String getAuthorsGenders() {
		String stringRep = "";
		for (int i = 0 ; i < authors.length-1; ++i) {
			stringRep +=  authors[i].getGender() + ',';
		}
		stringRep += authors[authors.length-1].getGender();
		return stringRep;
	}
}
