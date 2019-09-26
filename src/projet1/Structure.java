package projet1;


public class Structure {
	
	//
	// Champs
	//
	private char lettre;
	private String code;
	
	//
	// Acessseur
	//
	public char getLettre() {
		return lettre;
	}
	public void setLettre(char lettre) {
		this.lettre = lettre;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	//
	// Contructeur
	//
	public Structure (char Lettre, String Code) {
		lettre = Lettre;
		code = Code;
	}
	
	//
	// Fonctions 
	//
	
	
}

