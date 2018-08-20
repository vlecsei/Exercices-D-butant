import java.util.Scanner;

public class exercice1 {
    
    
	//Variables
        static Scanner sc = new Scanner(System.in);
	static int a = 0;	
	static int b = 0;	
	static int c = 0;
	
    public static void main(String[] args) {
	
	
	do {
		System.out.println("Entrer la valeur de a :");
		b = sc.nextInt();
		
		System.out.println("Entrer la valeur de b :");
		c = sc.nextInt();
	}while (a >= 1 && b >= 1);
	     
	     System.out.println("a = "+ c);
	     System.out.println("b = "+ b);
    }
}

