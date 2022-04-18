

public class Problema3 {

	public static void main(String[] args) {
		inici();
	}
	
	public static void inici() {
		int n = 895;
		char arrayBin[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int nbits = 10;
		char[] resultat = decimalAbinari(n, arrayBin, nbits);
		for(int i = 0; i<resultat.length; i++) {
			System.out.print(resultat[i]);
		}
	}
	
	public static char[] decimalAbinari(int n, char [] arrayBin, int nbits) {
		if(n<=1023) {
		nbits--;
		int bit = n%2;
		n = n/2;
		char cBit = '0';
		
		if(bit == 1) {
			cBit = '1';
		} else {
			cBit = '0';
		}
		
		if(nbits != -1) {
			arrayBin[nbits] = cBit;
			decimalAbinari(n, arrayBin, nbits);
		return arrayBin;
		}} else {
			System.out.println("numero massa gran");
		}
		return arrayBin;
	}
}
