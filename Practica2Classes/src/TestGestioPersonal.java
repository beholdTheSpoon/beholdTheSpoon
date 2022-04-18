
public class TestGestioPersonal {

	public static void main(String[] args) {
		GestioPersonal gp = new GestioPersonal(5);
		AlumnePractiques a1 = new AlumnePractiques();
		Treballador t1 = new Treballador();
		Persona persona1 = new Persona(123, "Bro", "MMMMM", "01/01/2000", "via via", "lleida");
		
		
		a1.setNom("Alumne");
		a1.setCognoms("McAlumneFace");
		a1.setId(20);
		
		
		t1.setNom("Treballador");
		t1.setCognoms("Fortissim");
		t1.setId(10);
		
		
		gp.afegirPersona(a1);
		gp.afegirPersona(t1);
		gp.afegirPersona(persona1);
		
		Persona personaBuscat1 = gp.buscarPersona(10);
		Persona personaBuscat2 = null;
		try {
			 personaBuscat2 = gp.buscarPersona("Treballar");
		} catch (Exception e) {
			System.out.println("no existeix");
		}
		
		
		personaBuscat1.mostrar();
		personaBuscat2.mostrar();
		
		
	}

}
