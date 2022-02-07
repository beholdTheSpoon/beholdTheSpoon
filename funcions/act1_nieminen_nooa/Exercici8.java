public class Exercici8 {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6 , 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19, 20};
		int[] resultat = primersArray(array);
		for(int i = 0; i<resultat.length; i++) {
            System.out.print(resultat[i] + " ");
        }
	}
	
	static int[] primersArray(int[] x) {
		int[] primers = new int[x.length];			//fem lo de mirar si un valor es primer o no, pero a cada index del array.
		int pIndex = 0;								//i despres ho assignem al array de primers.
		for(int i=0; i<x.length; i++) {
			boolean esPrimer = true;
			int j = 2;	
			if(x[i]==2 || x[i]==3 || x[i]==1) {
				esPrimer = true;
				primers[pIndex] = x[i];
				pIndex++;
			} else {
				while(j<=x[i]/2) {
					if(x[i]%j==0) {
						esPrimer=false;
						break;
					}	
					j++;
				}	
				if(esPrimer == true) {
					esPrimer = true;
					primers[pIndex] = x[i];
					pIndex++;
				} else {
					esPrimer = false;
				}
			}
		}
		int n = 0;
		for(int i=0; i<primers.length; i++) {		//tallem els zeros (0) del array de primers, per que quedi net i del tamany correcte.
			if(primers[i] != 0) {
				n++;
			}
		}
		int[] array = new int[n];
		for(int i=0; i<array.length; i++) {
			array[i] = primers[i];
		}
				
		return array;
	}
}
