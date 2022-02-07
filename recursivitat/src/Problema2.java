
public class problema2 {

	public static void main(String[] args) {

		problema2 programa = new problema2();

		programa.inici();

	}

	public void inici() {
		int[] array = { 2, 2, 8, 3, 1, 3, 8, 4, 3, 9, 3, 0, 1, 6, 4, 9, 3 };
		int valor = 3;
		int posInici = 0;

		int resultat = comptar(array, valor, posInici);
		System.out.println("El numero " + valor + " apareix " +resultat+ " vegades en el array.");
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
