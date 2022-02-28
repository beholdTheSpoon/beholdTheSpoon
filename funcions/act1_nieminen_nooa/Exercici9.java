public class Exercici9 {

	public static void main(String[] args) {
		int[][] matriu = {{5, 2, 3}, {7, 4, 5, 20, 43}, {234, 25, 673, 45, 90}, {45, 65, 23}, {354, 34}};
		int resultat = maximMatriu(matriu);
		System.out.println(resultat);
	}
	
	static int maximMatriu(int[][] x) {
		int[] valors = new int[x.length];
		
		for(int i=0; i<x.length; i++) {			
			for(int k=0; k<x.length; k++) {
	            for(int l=k+1; l<x[i].length; l++) {	//ordenem els valors a dins de cada sub array
					if(x[i][k]>x[i][l]) {
						int ultimValor = x[i][k];
						x[i][k] = x[i][l];
						x[i][l] = ultimValor;
					}
				}
	        }
		}
		
		for(int i=0; i<x.length; i++) {
			for(int j=0; j<x[i].length; j++) {
				valors[i] = x[i][j];
			}
		}
		
		for(int i=0; i<valors.length; i++) {
            for(int j=i+1; j<valors.length; j++) {
				if(valors[i]>valors[j]) {				//agafem tots els valors mes grans de cada sub array i les fiquem
					int ultimValor = valors[i];			//en un altre array, l'ordenem i el ultim valor es el mes gran
					valors[i] = valors[j];
					valors[j] = ultimValor;
				} 
			}
        }
		
		int resultat = valors[valors.length-1];
		return resultat;
	}
}
