import java.util.Scanner;

public class exercice7 {
	
	static Scanner sc = new Scanner(System.in);
	static int nbre;
	static int produit = 1;
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Entrez un nombre :");
		nbre = sc.nextInt();
		
		for(int i = 1; i <= nbre; i++) {
			produit = produit * i;
		}
		
		System.out.println("La factorielle de "+nbre+" est égale à "+produit);
		
	}

}
