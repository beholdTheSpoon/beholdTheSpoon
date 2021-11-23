import java.util.Scanner;
import java.util.Random;

//aqui hi han les versions ampliacio 1 i 2

public class Practica3ElPenjatBasicaVAmp1_nnieminen {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdueix una paraula: ");
		String paraulaSecreta = scanner.next();
		char paraulaJoc[] = new char[paraulaSecreta.length()];
		
		int intents = 10;	//es pot canviar intents i fer-la mes gran, la corda i la estructura es faran mes llargs.
		int numeroInicialIntents = intents;
		
		char ninot[][] = new char[intents-3][5];		//el tamany augmenta depenen dels intents
		int pOriginC[][] = 	{{1},{3}};					//punt origen de la corda
		char corda = '|';
		int cPal = 0;
		int cCorda = 0;
		int cPa = 0;
		
		int passosNinot[][] = {
								{2+cCorda,3},
								{3+cCorda,3},
								{3+cCorda,4},
								{3+cCorda,2},
								{4+cCorda,2},
								{4+cCorda,4}
								};
		
		char parts[][] = {
							{'O'},
							{'|'},
							{'\\'},
							{'/'},
							{'/'},
							{'\\'},
							{'-'}
							};
	
		for (int i = 0; i < ninot.length; i++) {
			for (int j = 0; j < ninot[i].length; j++) {
				if(i > 0 && i < ninot.length && j==0) {
					ninot[i][j] = '|';
				}
				
				if(i==ninot.length-1 && j>=0 && j<ninot[j].length) {
					ninot[i][j] = '=';
				}
			}
		}
		
		boolean perdut = false;
		int c = 0;
		int cL = 0;
		
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
			for (int j = 0; j < ninot.length; j++) {
				for (int k = 0; k < ninot[j].length; k++) {
					System.out.print(ninot[j][k]);
				}
				System.out.println();
			} 
			
			System.out.println();
			String resposta = scanner.next();
			char r = resposta.charAt(0);									//resposta del usuari es el primer caracter del String resposta
			
			for(int j = 0; j < paraulaJoc.length; j++) {
				
				if(r == '9') {
					while(paraulaSecreta[j] != r) {
						r = (char) ('a' + rand.nextInt(26));
					}
				}
				
				if(paraulaJoc[j] == '-') {									//si es troba una linia, s'incrementa el comptador de linies (cL)
					cL++;
				}
				
				if(paraulaSecreta.charAt(j) == r) {
					paraulaJoc[j] = r;										//si el caracter de la paraulaSecreta a la posicio j es igual a la resposta del usuari, s'incrementa el comptador del caracter.
					c++;
				}
			}
			
			
			
			if(i == intents - 1) {											//CONDICIO DE PERDUA: i es igual a intents-1
				perdut = true;
				ninot[passosNinot[cPa][0]][passosNinot[cPa][1]] = parts[cPa][0]; 
				for (int j = 0; j < ninot.length; j++) {
					for (int k = 0; k < ninot[j].length; k++) {
						System.out.print(ninot[j][k]);
					}
					System.out.println();
				} 
				System.out.println("Has perdut.");
				System.out.print("La paraula era: " + paraulaSecreta);
				break;
			} 
			
			if(cL == 1 && c > 0) {											//CONDICIO DE GUANYAMENT: el comptador de linies es 1 (per que el bucle del comptador ve abans que lo del caracter), i el comptador de caracters es mes que 0.
				System.out.println("Has guanyat!");
				System.out.print("La paraula era: " + paraulaSecreta );
				break;
			}
			
			if(c == 0) {													//CONDICIO DE CONTINUACIO/PERDUA DE INTENTS: si no es troba cap caracter que coincideix amb la resposta es continua normalment, pero si es troba una coincidencia, s'incrementa intents perque el bucle continui mes.
				System.out.println("Malament.");
				if(cPal!=3) {
					ninot[0][cPal+1] = '-';
					cPal++;
				} else if(cPal == 3 && cCorda < numeroInicialIntents-9) {				//es dibuixa el pal si el comptador no es 3, pero si es 3 es comença a dibuixar la corda.
					ninot[pOriginC[0][0]+cCorda][pOriginC[1][0]] = corda;				//la llargada de la corda i de la estructura depen en el numero de intents.
					cCorda++;
				} else if(cPal == 3 && cCorda >= numeroInicialIntents-9) {
					ninot[passosNinot[cPa][0]][passosNinot[cPa][1]] = parts[cPa][0]; 	//es va seguint els passosNinot si dona la resposta incorrecta.
					cPa++;
				} 
				
			} else if(c > 0) {
				intents++;
			}

			System.out.println();
		}
		scanner.close();
	}
}