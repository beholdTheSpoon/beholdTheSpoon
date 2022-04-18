
public class GestioPersonal {
	
	private int quantitat;
	Persona[] persona; 
	
	public GestioPersonal(int quant) {
		this.quantitat = quant;
		this.persona = new Persona[quantitat];
	}
	
	public void afegirPersona(Persona p) {
		for(int i = 0; i < persona.length; i++) {
			if(this.persona[i] == null) {
				this.persona[i] = p;
				break;
			}
		}
	}
	
	public void eliminarPersona(Persona p) {
		for(int i = 0; i<this.persona.length; i++) {
			if(this.persona[i]==p) {
				this.persona[i] = null;
				break;
			}
		}
	}
	
	public Persona buscarPersona(int id) {
		for(int i = 0; i<this.persona.length; i++) {
			if(this.persona[i] == null) {
				
			} else if(this.persona[i].getId() == id) {
				return this.persona[i];
			}
		}
		return null;
	}
		public Persona buscarPersona(String nom) {
			for(int i = 0; i<this.persona.length; i++) {
				if(this.persona[i] == null) {
					
				} else if(this.persona[i].getNom().equals(nom) || this.persona[i].getCognoms().equals(nom)) {
					return this.persona[i];
				}
			}
			return null;
		}
}
