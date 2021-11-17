import java.util.Scanner;

public class Practica3ElPenjatBasica_nnieminen {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String paraulaSecreta = "practicajava";
		char paraulaJoc[] = new char[paraulaSecreta.length()];
		//boolean ple[] = new boolean[paraulaSecreta.length()];
		
		int intents = 10;

		for (int i = 0; i < paraulaJoc.length; i++) {
			paraulaJoc[i] = '-';
		}
		
		for (int i = 0; i < intents; i++) {
			
			if(i == intents-1) {
				System.out.println("Has perdut.");
				break;
			}
			
			System.out.println("\nCada intent equivocat resta un intent. Intents que queden: " + (intents-i) + "\nIntrodueix un caracter: ");
			
			
			for (int l = 0; l < paraulaJoc.length; l++) {
				System.out.print(paraulaJoc[l]);
			}
			
			System.out.println();
			
			String resposta = scanner.next();
			char r = resposta.charAt(0);
			int c = 0;

			for (int j = 0; j < paraulaJoc.length; j++) {
				if(paraulaSecreta.charAt(j) == r) {
					paraulaJoc[j] = r;
					c++;
				}
			}
			
			if(c == 0) {
				System.out.println("Malament.");
			} else if(c > 0) {
				i--;
			}

			System.out.println();
		}
		scanner.close();
	}
	
}
