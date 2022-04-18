import java.util.Scanner;
import java.io.File;
import java.io.PrintStream;

public class UF3Practica1 {

	public static void main(String[] args) {
		UF3Practica1 program = new UF3Practica1();
		program.inici();
	}
	
	//CONTRARI DE OPTIMITZAT :(
	//almenys funciona
	
	public void inici() {
		Scanner scanner = new Scanner(System.in);
		File file = new File("Document.txt");
		File resultat = new File("Resultat.txt");
		File temp = new File("Temp.temp");
		PrintStream write = null;
		PrintStream writeTemp = null;
		System.out.println("Quina paraula vols buscar?");
		String paraula = scanner.next();
		scanner.close();
		
		try {
			write = new PrintStream(resultat);
			writeTemp = new PrintStream(temp);
		} catch (Exception e) {
			System.out.println("error");
		}

		crearTemp(temp);
		crearFitxer(resultat);
		cercarParaula(file, writeTemp, paraula);
		comptarParaulesLinia(temp, write, paraula);
		
		int nParaules = comptarParaulesLinia(file, writeTemp, paraula);
		String nParaulesBuscats = cercarParaula(file, writeTemp, paraula);
		statistics(file, write, nParaules, nParaulesBuscats, temp);
		writeTemp.close();
		
	}

	public void crearFitxer(File f) {
		try {
			if (f.createNewFile()) {
			} else {
				System.out.println("Fitxer " + f + " ja existeix");
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

	public void crearTemp(File f) {
		try {
			if (f.createNewFile()) {
			} else {
				System.out.println("Fitxer " + f + " ja existeix");
			}
		} catch (Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}

	public int comptarParaulesLinia(File f, PrintStream write, String paraula) {
		int comptadorTotal = 0;
		try {
			Scanner read = new Scanner(f);
			while (read.hasNextLine()) {
				String data = read.nextLine();
				int comptadorParaules = 1; //num of words == quant. of spaces
				for (int i = 0; i < data.length(); i++) {
					char espai = data.charAt(i); //space char == current index
					if (espai == ' ') { //if space char is a space, increment
						comptadorParaules++;
					}
				}
				
				comptadorTotal += comptadorParaules;
				write.println(data + " " + comptadorParaules);
			}
			read.close();

		} catch (Exception e) {
			System.out.println("Algun error...");
		}
		//System.out.println(comptadorTotal);
		return comptadorTotal;
	}

	public String cercarParaula(File f, PrintStream write, String paraula) {	
		Scanner read = null;
		int numeroParaulesBuscats = 0;
		
		try {
			read = new Scanner(f);

		} catch (Exception e) {
			System.out.println("Algun error...");
		}
		
		try {
			String paraulaMajuscules = paraula.toUpperCase();
			//System.out.println(paraulaMajuscules);

			while (read.hasNextLine()) {
				String data = read.nextLine();
				//System.out.println(data.replaceAll(paraula, paraulaMajuscules));
				write.println(data.replaceAll(paraula, paraulaMajuscules));
				
				String temp[] = data.split(" ");
				for(int i = 0; i < temp.length; i++) {
						if(paraula.equals(temp[i])) 
						numeroParaulesBuscats++;			
				}
			}

		} catch (Exception e) {
			System.out.println("error");
		}
		read.close();
		return paraula + ": "+ numeroParaulesBuscats;
	}

	public void statistics(File f, PrintStream write, int numParaules, String numParaulesBuscats, File temp) {
		write.println("\nNumero de vegades paraula " + numParaulesBuscats);
		write.println("Numero de paraules: " + numParaules);

		try {
			temp.deleteOnExit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
