public class Exercici6 {
	public static void main(String[] args) {
		int[] array = {2, 5, 3, 10};	
		int suma = sumaArray(array);
		System.out.println(suma);
	}
	
	static int sumaArray(int[] x) {
		int suma = 0;
		for(int i=0; i<x.length; i++) {	//incrementem "suma" amb el valor de la posicio x[i].
			suma+=x[i];
		}
		
		return suma;
	}
}
