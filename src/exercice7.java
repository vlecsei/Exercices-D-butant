import java.util.Scanner;

public class exercice7 {
	
	static Scanner sc = new Scanner(System.in);
	static int nbre;
	static int i;
	static double produit = 1;
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Entrez un nombre :\n");
		nbre = sc.nextInt();
		
		for(i = 1; i <= nbre; i++) {
			produit = produit * i;
		}
		
		System.out.println("La factorielle de "+nbre+" est �gale � "+produit);
		
	}

}
