import java.util.Scanner;

public class Act0_Ex2_nnieminen {
	public static void main(String[] args) {
		System.out.println("Introdueix una paraula.");
		Scanner scanner = new Scanner(System.in);
		String par = scanner.next();
		scanner.close();
		
		StringBuilder nPar = new StringBuilder(par);
		nPar.reverse();
		String rPar = nPar.toString();

		if(par.equals(rPar)) {
			System.out.println("Es capicua");
		} else {
			System.out.println("No es capicua");
		}
		
	}

}
