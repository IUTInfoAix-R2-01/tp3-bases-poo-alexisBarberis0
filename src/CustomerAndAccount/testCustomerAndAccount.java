package CustomerAndAccount;

public class testCustomerAndAccount {
	public static void main(String[] args) {
		Customer c1 = new Customer(4,"Toto",'M');
		System.out.println("L'id est : " + c1.getId());
		System.out.println("Le nom est : " + c1.getName());
		System.out.println("Le genre est : " + c1.getGender());
		System.out.println("voici le nom et l'id : " + c1);
		
		Account a1 = new Account(70, c1);
		System.out.println("voici le compte de c1 : " + a1);
		a1 = new Account(70, c1, 120.04);
		System.out.println("voici le compte de c1 mis a jour: " + a1);
		a1.setBalance(200.00);
		System.out.println("L'argent de c1 à été changé à " + a1.getBalance());
		a1.deposit(105);
		System.out.println("105 euros ont été ajouté au compte de c1 il a en tout : " + a1.getBalance());
		a1.withdraw(50);
		System.out.println("50 euros ont été retiré au compte de c1 il a en tout : " + a1.getBalance());
		a1.withdraw(5000);
		}
}
	
