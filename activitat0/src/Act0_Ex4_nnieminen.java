import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Act0_Ex4_nnieminen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String frase = scanner.nextLine();
		String paraulaProhibida = "hola";
		paraulaProhibida = Pattern.quote(paraulaProhibida);
		StringBuilder sfrase = new StringBuilder(frase);
		String fraseNou = null;
		scanner.close();
		
		Pattern paraula = Pattern.compile(paraulaProhibida, Pattern.CASE_INSENSITIVE);
		Matcher matcher = paraula.matcher(frase);
		
		while (matcher.find()) {
		     System.out.println(matcher.start() +" - "+ (matcher.end()-1));
		     for(int i = 0; i<frase.length(); i++) {
		    	 if(i>=matcher.start() && i<=matcher.end()) {
		    		sfrase.insert(i, "X");		    	 }
		     }
		}
		
		System.out.println(matcher);
		System.out.println(sfrase);
		
		
		
		
		
		
		
		
		
	}

}
