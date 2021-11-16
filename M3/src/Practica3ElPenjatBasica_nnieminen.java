import java.util.Scanner;

public class Practica3ElPenjatBasica_nnieminen {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		String paraulaSecreta = "practicajava";
		char paraulaJoc[] = new char[paraulaSecreta.length()];
		boolean ple[] = new boolean[paraulaSecreta.length()];
		
		int intents = 10;
		
		for (int i = 0; i < paraulaJoc.length; i++) {
			paraulaJoc[i] = '-';
		}
		
		for (int i = 0; i < intents; i++) {
			System.out.println("\nCada intent equivocat resta un intent. Intents que queden: " + (intents-i) + "\nIntrodueix un caracter: ");
			String resposta = scanner.next();
			char r = resposta.charAt(0);
			
			for (int j = 0; j < paraulaJoc.length; j++) {
				if(paraulaSecreta.charAt(j) == r) {
					paraulaJoc[j] = r;
					ple[j] = true;
					System.out.print(paraulaJoc[j] + " ");
				}
				
				
				for (int k = 0; k < paraulaJoc.length; k++) {
					if(paraulaJoc[k] == '-') {
						ple[k] = false;
					}
				}
			}
			
			for (int l = 0; l < paraulaJoc.length; l++) {
				System.out.print(paraulaJoc[l]);
			}
	
		}
		scanner.close();
	}
	
}
