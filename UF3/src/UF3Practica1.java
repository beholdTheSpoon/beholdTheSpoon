import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class UF3Practica1 {

	public static void main(String[] args) {
		UF3Practica1 program = new UF3Practica1();
		program.inici();
	}
	
	public void inici() {
		File file = new File("Document.txt");
		Scanner scanner = new Scanner(System.in);
		
		comptarParaulesLinia(file);
	}
	
	public int comptarParaulesLinia(File file) {
		String[] dataNou = null;
		try {
			Scanner read = new Scanner(file);
			while(read.hasNextLine()) {
				String data = read.nextLine();
				
				dataNou = data.split("\r");
			}
		} catch (FileNotFoundException e) {
			System.out.println("error!");
		}

		return dataNou.length;
	}
	/*
	public int comptarParaulesTotal() {
		
	}
	
	public int comptarParaula() {
		
	}
*/
}
