import java.util.Scanner;

public class exercice6 {
	
	static Scanner sc = new Scanner(System.in);
	static int nbre;
	static int i;
	static int somme;
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Entrez un nombre :");
		nbre = sc.nextInt();
		
		for(i = 0; i <= nbre; i++) {
			somme = somme + i;
		}
		
		System.out.println("La somme des nombres de 0 à "+nbre+" est égale à "+somme);
		
	}

}
