
public class Activitat7_4_nnieminen {
	public static void main(String[] args) {
		int arr[][]	 =	{{5,65,38,59},
						{83,43,765,72},
						{234,87,3,8},
						{90,67,54,25}
						};
		
		int mins[] = new int[arr.length];
		int maxs[] = new int[arr.length];
		int c = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				for(int k = 0; k < arr[i].length; k++) {	//primer ordenem cada valor a cada arr[][valor].
					if(arr[i][k] > arr[i][j]) {
						c = arr[i][k];
						arr[i][k] = arr[i][j];
						arr[i][j] = c;
					}
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {			
			mins[i] = arr[i][0];					//ara agafem el primer valor de cada array i les fiquem en un array mins[].
			maxs[i] = arr[i][arr[i].length - 1];			//fem el mateix amb el ultim valor de cada array i les fiquem en un array[maxs].
		}
		
		int minU;
		for(int i = 0; i < mins.length; i++) {
			for(int j = i; j < mins.length; j++) {		//ordenem mins[].
				if(mins[i] > mins[j]) {
					minU = mins[i];
					mins[i] = mins[j];
					mins[j] = minU;
				}
			}
		}

		int maxU;
		for(int i = 0; i < maxs.length; i++) {
			for(int j = i; j < maxs.length; j++) {		//ordenem maxs[].
				if(maxs[i] > maxs[j]) {
					maxU = maxs[i];
					maxs[i] = maxs[j];
					maxs[j] = maxU;
				}
			}
		}
		
		int vMax = maxs[maxs.length - 1];				//el ultim valor de maxs[] es el vMax (valor max).
		int vMin = mins[0];							//i el ultim valor de mins[] es el vMin (valor min).

		System.out.println();
		System.out.println("El valor minim es: " + vMin);
		System.out.println("El valor maxim es: " + vMax);
	}
}
