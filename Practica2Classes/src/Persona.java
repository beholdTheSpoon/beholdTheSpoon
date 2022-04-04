
public class Persona {
	private int id;
	private String nom;
	private String cognoms;
	private String data_naixement;
	private String adreca;
	private String poblacio;
	
	public Persona() {}
	public Persona(int i, String n, String cn, String d, String a, String p) {
		this.id=i; this.nom=n; this.cognoms=cn; this.data_naixement=d; this.adreca=a; this.poblacio=p;
	}
	
	public void setId(int x) {this.id=x;}
	public void setNom(String x) {this.nom=x;}
	public void setCognoms(String x) {this.cognoms=x;}
	public void setDataNaix(String x) {this.data_naixement=x;}
	public void setAdreca(String x) {this.adreca=x;}
	public void setPoblacio(String x) {this.poblacio=x;}
	
	public int getId() {return this.id;}
	public String getNom() {return this.nom;}
	public String getCognoms() {return this.cognoms;}
	public String getDataNaix() {return this.data_naixement;}
	public String getAdreca() {return this.adreca;}
	public String getPoblacio() {return this.poblacio;}
	
	public boolean equals(Persona x) {
		if(this == x) {
			return true;
		} else {
			return false;
		}
	}
	
	public String mostrar() {
		return id + "\n" + cognoms + ", " + nom + "\n" + data_naixement + "\n" + adreca + " " + poblacio;
	}
	
}
