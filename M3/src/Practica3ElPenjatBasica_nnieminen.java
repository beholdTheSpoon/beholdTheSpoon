import java.util.Scanner;

public class Practica3ElPenjatBasica_nnieminen {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String paraulaSecreta = "practicajava";
		char paraulaJoc[] = new char[paraulaSecreta.length()];
		boolean perdut = false;
		int c = 0;
		int cL = 0;
		
		int intents = 10;

		for(int i = 0; i < paraulaJoc.length; i++) {
			paraulaJoc[i] = '-';
		}
		
		System.out.println("Joc del penjat.");

		for(int i = 0; i < intents; i++) { //bucle principal
			cL = 0;
			c = 0;
			if(perdut == false) {
				System.out.println("\nCada intent equivocat resta un intent. Intents que queden: " + (intents-i) + "\nIntrodueix un caracter: ");
			}
			
			for(int l = 0; l < paraulaJoc.length; l++) {
				System.out.print(paraulaJoc[l]);
			}
			
			System.out.println();
			String resposta = scanner.next();
			char r = resposta.charAt(0);
			
			for(int j = 0; j < paraulaJoc.length; j++) {
				if(paraulaJoc[j] == '-') {
					cL++;
				}
				
				if(paraulaSecreta.charAt(j) == r) {
					paraulaJoc[j] = r;
					c++;
				}
			}
			
			if(i == intents-1) {
				perdut = true;
				System.out.println("Has perdut.");
				System.out.print("La paraula era: " + paraulaSecreta);
				break;
			} 
			
			if(cL == 1 && c>0) {
				System.out.println("Has guanyat!");
				System.out.print("La paraula era: " + paraulaSecreta );
				break;
			}
			
			if(c == 0) {
				System.out.println("Malament.");
			} else if(c > 0) {
				intents++;
			}

			System.out.println();
		}
		scanner.close();
	}
}