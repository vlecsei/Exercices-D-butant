import java.util.Scanner;

public class exercice2 {

    
    
    
    static Scanner sc = new Scanner(System.in);
    static int nbre = 0;
   
    
    
    public static void main(String[] args) {
	
	
	    do {
	
	    System.out.println("Quelque nombre voulez-vous mettre au carré ?");
	    nbre = sc.nextInt();
	}while (nbre == 0);
	    
	    System.out.println("Le carré de "+nbre+" est "+nbre*nbre);
	    
	
    }

}