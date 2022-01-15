
public class Exercici2 {
    public static void main(String[] args) {
    	boolean resultat = esPrimer(31);
		System.out.println(resultat);
    }
    //fem el procediment d'un activitat anterior de buscar un numero primer
    static boolean esPrimer(int num) {
		boolean esPrimer = true;
		int i = 2;	
		if(num==2 || num==3 || num==1) {
			esPrimer = true;
		} else {		
			while(i<=num/2) {
				if(num%i==0) {
					esPrimer=false;
					break;
				}	
				i++;
			}	
			if(esPrimer == true) {
				esPrimer = true;
			} else {
				esPrimer = false;
			}
		}
		return esPrimer;
	}
}
