package projet1;

public class Liste<T>{

	//
	// Champs
	//
	
	private T data;
	private Liste<T> suiv;
	
	//
	// Acesseurs
	//
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Liste<T> getSuiv() {
		return suiv;
	}
	public void setSuiv(Liste<T> suiv) {
		this.suiv = suiv;
	}
	
	/**
	 * Constructeur de la classe Liste
	 * @param pData
	 * @param l
	 */
	public Liste(T pData, Liste<?> l) {
		data = pData;
		suiv= l;
	}
	
	/**
	 * Fonction permettant de construire une liste de chaine de caractère (String)
	 * @param x = valeur de la case 
	 * @param l = Liste das laquelle on met cette valeur
	 * @return nouvelle Liste avec x
	 */
	public static Liste<String> Cons(String x, Liste<?> l) {
		Liste<String> p;
		p=new Liste<String>(x,l);
		return p;
	}
	
	/**
	 * Fcontion permettant de crée une liste
	 * @param n = nombre de case dans la liste
	 * @return nouvelle liste avec n case
	 */
	public static Liste<?> CreeListe(int n) {
		Liste<?> l = null, p=null;
		for(int i=n; i>0; i--) {
			p=Cons("",l);
			l=p;
		}
		return p;
			
	}
	
	/**
	 * Fonction pour afficher le contenu d'une liste
	 * @param l = liste a afficher
	 * @return le contenu de la liste
	 */
	public static String Afficher(Liste<?> l) {
		Liste<?> p=l;
		String text = "";
		while(p!=null) {
			text+=p.data+",";
			p=p.suiv;
		}
		return text;
	}
	
	/**
	 * Vérifie que la liste n'est pas null
	 * @param l = liste a vérifier
	 * @return la liste est vide ? true/false
	 */
	public static boolean EstVide(Liste<?> l) {
		return l==null;
	}
	
	
}

