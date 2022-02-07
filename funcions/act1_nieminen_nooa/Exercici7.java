public class Exercici7 {
	public static void main(String[] args) {
		int[] array = {2, 5, 67, 4, 6, 10, 7};
		int parells = sumaArray(array);
		System.out.println(parells);
	}
	
	static int sumaArray(int[] x) {
		int parells = 0;
		for(int i=0; i<x.length; i++) {	//mirem si el valor a la posicio x[i] es dona 0 quan es divideix per 2, i incrementem el comptador anomenat parells.
			if(x[i] % 2 == 0) {
				parells++;
			}
		}
		
		return parells;
	}
}
