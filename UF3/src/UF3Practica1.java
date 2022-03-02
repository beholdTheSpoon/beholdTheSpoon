import java.util.Scanner;
import java.io.File;
import java.io.PrintStream;

public class UF3Practica1 {

	public static void main(String[] args) {
		UF3Practica1 program = new UF3Practica1();
		program.inici();
	}
	
	public void inici() {
		File file = new File("Document.txt");
		File resultat = new File("Resultat.txt");
		PrintStream write = null;
		
		try {
			write = new PrintStream(resultat);
		} catch(Exception e) {
			System.out.println("error");
		}
		
		Scanner scanner = new Scanner(System.in);
		crearFitxer(resultat);
		cercarParaula(file, write);
		comptarParaulesLinia(file, write);
		
	}
	
	
	public void crearFitxer(File f) {
		try {
		      if (f.createNewFile()) {
		      } else {
		        System.out.println("Fitxer existeix");
		      }
		    } catch (Exception e) {
		      System.out.println("Error");
		      e.printStackTrace();
		    }
	}
	
	public void comptarParaulesLinia(File f, PrintStream write) {
		try {
			Scanner read = new Scanner(f);
			while(read.hasNextLine()) {
				String data = read.nextLine();	
				int comptadorParaules = 1;				//num of words == quant. of spaces
				for(int i=0; i<data.length(); i++) {
					char espai = data.charAt(i);		//space char is current index
					if(espai == ' ')  {					//if space char is a space, increment
						comptadorParaules++;	
					}
				}
				write.println(data + " " + comptadorParaules);
			}
			read.close();
			
		} catch (Exception e) {
			System.out.println("error!");
		}

	}
	
	public void cercarParaula(File f, PrintStream write) {
		
		Scanner read = null;
		Scanner scanner = null;
		
		try {
			read = new Scanner(f);
			scanner = new Scanner(System.in);
		} catch(Exception e) {
			System.out.println("bruh");
		}
		
		try {
			
			System.out.println("Quina paraula vols cercar?");
			String paraula = scanner.next();
			scanner.close();
			
			String paraulaMajuscules = paraula.toUpperCase();
			System.out.println(paraulaMajuscules);
			
			while(read.hasNextLine()) {
				
				String data = read.nextLine();
				System.out.println(data.replaceAll(paraula, paraulaMajuscules));
				
				write.println(data.replaceAll(paraula, paraulaMajuscules));
			}
			
		} catch(Exception e) {
			System.out.println("error");
		}
	}
}
