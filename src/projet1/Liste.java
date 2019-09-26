package projet1;

public class Liste<T>{

	//
	// Champs
	//
	private T s;
	private Structure x;
	private Liste<T> suiv;
	
	//
	// Acesseurs
	//
	public Structure getX() {
		return x;
	}
	public void setX(Structure x) {
		this.x = x;
	}
	public Liste<T> getSuiv() {
		return suiv;
	}
	public void setSuiv(Liste<T> suiv) {
		this.suiv = suiv;
	}
	
	//
	// Contructeur
	//

	public Liste(T pS) {
		s = pS;
		suiv= null;
	}
	
	public Liste(T pS, Liste<T> pSuiv) {
		s = pS;
		suiv= pSuiv;
	}
	
	//
	// Fonctions
	//
	
	// EstVide 
	public static boolean estVide(Liste<?> l) {
		return l == null;
	}

	// Reste 
	public static Liste<?> reste(Liste<?> l) {
		return l.suiv;
	}

	// Construire
	public static Liste<Structure> cons(Structure pX, Liste<Structure> pL) {
		return new Liste<Structure>(pX, pL);
	}
	
	// Retourne Lettre
	public static char lettreValeur(Liste<String> l) {
		return l.x.getLettre();
	}
	
	// Afficher Lettre
	public static String afficherChaine(Liste<String> l) {
		return l.s;
	}
	
	// Retourne Code
	public static String codeValeur(Liste<String> l) {
		return l.x.getCode();
	}
	
	// Insertion d'une structure 
		public static void insertionChaine(Liste<String> l, String s) {
			if (l.suiv == null)
				l.suiv = new Liste<>(s);
			else insertionChaine(l.suiv, s);
		}
		
	// Insertion d'une structure 
	public static void addCode(Liste<Structure> l, Structure x) {
		Liste<Structure> code = new Liste<>(x);
		l.setSuiv(code);
	}
	
	// Suppression d'un code
	
}

