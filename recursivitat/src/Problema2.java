
public class Problema2 {

	public static void main(String[] args) {
		
		int[] array = {3, 1, 5, 6, 3, 8, 3, 5, 7, 4, 3, 0};
		int valor = 3;
		int posInici = 0;
		
		int resultat = comptar(array, valor, posInici);
		System.out.println(resultat);
	}
	
	public static int comptar(int[] array, int valor, int posInici) {
		int n = 0;
		int c = posInici;
		
		if(array[c] != valor) {
			if(c<array.length-1 && c<array.length) {
			c++;
			return comptar(array, valor, c);
			}
		} else if(array[c] == valor && c<array.length) {
			if(c<array.length-1) {
			n++;
			c++;
			return comptar(array, valor, c);
		}}
		return n;
	}
}
