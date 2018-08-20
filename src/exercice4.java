import java.util.Scanner;

public class exercice4 {
	
	static float produitA = 0;
	static float produitB = 0;
	static Scanner sc = new Scanner(System.in);
	
	

	public static void main(String[] args) {
	
		
	System.out.println("Entrez le premier nombre :");
	produitA = sc.nextFloat();
	
	System.out.println("Entrez le deuxième nombre :");
	produitB = sc.nextFloat();
	
	if ((produitA < 0 && produitB < 0) || (produitA > 0 && produitB > 0)) {
		System.out.println("Le produit de ces deux nombres est positif");
		}else {if ((produitA < 0 && produitB > 0) || (produitA > 0 && produitB < 0)) {
		
				System.out.println("Le produit de ces deux nombres est négatif");
			
					}else System.out.println("Le produit de ces deux nombre est égale à l'infini et l'au-delà !!");
		
			}	
	
	}
}
