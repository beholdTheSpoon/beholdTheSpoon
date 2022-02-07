import java.util.Scanner;

public class Exercici10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean continuar = true;
		
		while (continuar == true) {
			System.out.println("Introdueix 2 numeros enters: ");
			int n1 = scanner.nextInt();
			int n2 = scanner.nextInt();
			
			System.out.println("1. Sumar " + n1 + "+" + n2);
			System.out.println("2. Restar " + n1 + "-" + n2);
			System.out.println("3. Multiplicar " + n1 + "*" + n2);
			System.out.println("4. Dividir " + n1 + "/" + n2);
			System.out.println("Elegeix introduint el numero de la opcio");
			
			//les condicions
			int opcio = scanner.nextInt();
				switch (opcio) {
					case 1: 
						System.out.println(suma(n1, n2));
						break;
					
					case 2: 
						System.out.println(resta(n1, n2));
						break;
					
					case 3: 
						System.out.println(multiplicar(n1, n2));
						break;
					
					case 4: 
						System.out.println(divisio(n1, n2));

						break;
					
					default:
						System.out.println("Invalid");
				}
			//la logica de continuar/parar
			System.out.println("Vols continuar? (S/N)");
			String resposta = scanner.next();
			if(resposta.equals("S")) {
				continuar = true;
				System.out.println("Continuant...");
			} else if(resposta.equals("N")) {
				continuar = false;
				System.out.println("Parant...");
				break;
			} else {
				System.out.println("Resposta invalida, resumint...");
			}
		}

		scanner.close();

	}
	
	//funcions aritmetiques
	
	static int suma(int x, int y) {
		return x+y;
	}
	
	static int resta(int x, int y) {
		return x-y;
	}
	
	static int multiplicar(int x, int y) {
		return x*y;
	}
	
	static int divisio(int x, int y) {
		return x/y;
	}
}