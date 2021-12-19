import java.util.Scanner;

public class Act0_Ex3_nnieminen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String frase = scanner.nextLine();
		scanner.close();
		
		String nFrase = frase.replaceAll(" {2,}", " ");
		System.out.println(nFrase);
	}

}
