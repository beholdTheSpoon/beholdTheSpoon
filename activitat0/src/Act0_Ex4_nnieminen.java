
import java.util.Scanner;

public class Act0_Ex4_nnieminen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdueix un frase.");
		String paraulaProhibida = "hola";
		String frase = scanner.nextLine();
		String subs[] = frase.split(" ");
		
		scanner.close();
		
		for(int i = 0; i<subs.length; i++) {
			if(subs[i].equals(paraulaProhibida)) {
				for(int j = 0; j<subs[i].length(); j++) {
					subs[i] = subs[i].replace(subs[i].charAt(j), 'X');
				}
			}
		}

		for(String i : subs) {
			System.out.print(i+" ");
		}
	}

}
