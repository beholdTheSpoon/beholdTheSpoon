import java.util.Scanner;

public class Act0_Ex1_nnieminen {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdueix una frase.");
		String frase = scanner.nextLine();
		String subs[] = frase.split(" ");
		scanner.close();
		
		for(int i=0; i<subs.length; i++) {
			System.out.println(subs[i]+" "+subs[i].length()); //vaig passar molta estona amb stringbuilder, substrings, un monton de variables i finalment he pensat "i si faig split()?" tenia com 30 linies i tot he fet amb nomes 2........................
		}
	}	
}
