import java.util.Scanner;

public class exercice5 {
	
	static Scanner sc = new Scanner(System.in);
	static int age = 0;

	public static void main(String[] args) {
		
		System.out.println("Ecrivez votre age :");
		age = sc.nextInt();
		
		
		if(age < 6) {
			System.out.println("Vous n'avez pas encore l'age");
		}else {
			if (age > 5 && age < 8) {
				System.out.println("Poussin");
			}else {
				if (age < 10) {
					System.out.println("Pupille");
					}else {
						if (age < 12) {
							System.out.println("Minime");
						}else {
							System.out.println("Cadet");
					}
				}
			}

	}
	}
}
