package projet1;

public class Liste {

	//
	// Champs
	//
	private Structure x;
	private Liste suiv;
	
	//
	// Acesseurs
	//
	public Structure getX() {
		return x;
	}
	public void setX(Structure x) {
		this.x = x;
	}
	public Liste getSuiv() {
		return suiv;
	}
	public void setSuiv(Liste suiv) {
		this.suiv = suiv;
	}
	
	//
	// Contructeur
	//
	public Liste(Structure X, Liste Suiv) {
		x = X;
		suiv = Suiv;
	}
	
	//
	// Fonctions
	//
	
	// EstVide 
	public static boolean estVide(Liste l) {
		return l == null;
	}
	
	// Reste 
	public static Liste reste(Liste l) {
		return l.suiv;
	}
	
	// Construire
	public static Liste cons(Structure pX, Liste pL) {
		return new Liste(pX, pL);
	}
	
	// Retourne Lettre
	public static char lettreValeur(Liste l) {
		return l.x.getLettre();
	}
	
	// Retourne Code
	public static String codeValeur(Liste l) {
		return l.x.getCode();
	}
	
	// Insertion d'un code 
	public static void addCode(Liste l, Structure x) {
		Liste code = new Liste(x, null);
		l.setSuiv(code);
	}
	
	// Suppression d'un code
	
}

