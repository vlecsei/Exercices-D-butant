import java.util.Scanner;

public class exercice7 {
	
	static Scanner sc = new Scanner(System.in);
	static int nbre;
	static int i;
	static int produit;
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Entrez un nombre :");
		nbre = sc.nextInt();
		
		for(i = 1; i <= nbre; i++) {
			produit = produit * i;
		}
		
		System.out.println("La factorielle de "+nbre+" est égale à "+produit);
		
	}

}
