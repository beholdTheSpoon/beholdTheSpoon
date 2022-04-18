
public class Problema2 {

	public static void main(String[] args) {
		inici();
	}

	public static void inici() {
		int[] array = {5, 3, 5, 4, 8, 4, 3, 3, 5, 3, 5, 7, 3, 1, 3, 5, 3, 5};
		int valor = 5;
		int posInici = 0;

		int resultat = comptar(array, valor, posInici);
		System.out.println("Apareix " + resultat + " vegades al array.");
	}

	public static int comptar(int[] array, int valor, int posInici) {
		if (posInici == array.length) {
			return 0;
			
		} else {
			if (array[posInici] != valor && posInici < array.length) {
				return comptar(array, valor, posInici + 1);
			}
			
			if (array[posInici] == valor && posInici < array.length) {
				return comptar(array, valor, posInici + 1) + 1;
			}
			
			return 0;
		}
	}
}
