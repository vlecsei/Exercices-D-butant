import java.util.Scanner;

public class exercice2 {

    
    
    
    static Scanner sc = new Scanner(System.in);
    static int nbre = 0;
   
    
    
    public static void main(String[] args) {
	
	
	    do {
	
	    System.out.println("Quelque nombre voulez-vous mettre au carr� ?");
	    nbre = sc.nextInt();
	}while (nbre == 0);
	    
	    System.out.println("Le carr� de "+nbre+" est "+nbre*nbre);
	    
	
    }

}