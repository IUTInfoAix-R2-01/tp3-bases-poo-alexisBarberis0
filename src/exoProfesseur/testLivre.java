package exoProfesseur;

public class testLivre {

	public static void main(String[] args) {
		Livre book = new Livre("Winnie l'ourson", 13.90, 3);
		System.out.println(book.getName());
		System.out.println(book.getPrice());
		System.out.println(book.getQuantite());
		book.setQuantite(2);
		System.out.println(book);
		}

}
