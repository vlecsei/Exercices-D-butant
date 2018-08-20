import java.util.Scanner;

public class exercice3 {
	
	
	static float prixHT = 0;
	static int quantite = 0;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
	
		
	while(prixHT == 0 || quantite == 0) {
		System.out.println("Quel est le prix hors taxes ?");
		prixHT = sc.nextFloat();
		
		
		System.out.println("Quelle est la quantité ?");
		quantite = sc.nextInt();
		
	}System.out.println("Le prix TTC total est de "+prixHT*1.196*quantite+" euros.");
		
		

	}

}
