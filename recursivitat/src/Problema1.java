import java.util.Scanner;

public class Problema1 {

	public static void main(String[] args) {
		System.out.println("Introdueix un numero: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		int resultat = sumatori(n);
		System.out.println(resultat);
	}
	
	public static int sumatori(int n) {
		if(n>0) {
			return n + sumatori(n-1);
		} else {
			return n;
		}
	}
}
