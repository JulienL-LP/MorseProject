package projet1;

public class Fonctions {
	
	// Verifie si un entier appartient a une liste
	public static boolean appartient( int x, Liste l) {
		
		if(Liste.estVide(l)) {
			return false;
		}
		else if (x==Liste.premierElement(l)) {
			return true;
		}
		else 
			return appartient( x, Liste.resteListe(l));
	}
	public static int longueur(Liste l) {
		if(Liste.estVide(l))
			return 0;
		else 
			return 1+longueur(Liste.resteListe(l));
	}
//	TODO: tester si une liste est un ensemble, est qu'il y a des récurances
	public static boolean estUnEnsemble(Liste l) {
		if(Liste.estVide(l)) return true;
		else if( appartient( Liste.premierElement(l), Liste.resteListe(l))) return false;
		else return estUnEnsemble(Liste.resteListe(l));
	}
//	TODO: insertion en fin d'une liste 
	public static Liste insertion( int x, Liste l) {
		Liste p = l;
		if(Liste.estVide(l)) {
			l = new Liste(x, l);
			return l;
		}
		else {
			while (!Liste.estVide(p.suiv))
			{
				p = Liste.resteListe(p);
			}
			p.suiv = new Liste(x, null);
			return l ;
		}	 
		
	}
	// enlever les doublons d'une liste
	public static Liste nettoyer(Liste l) {
		if(Liste.estVide(l)) {
			return l;
		}
		else if (appartient(Liste.premierElement(l), Liste.resteListe(l)))
		{
			return nettoyer(Liste.resteListe(l)); 
		}
		else
			return Liste.cons(Liste.premierElement(l), nettoyer(Liste.resteListe(l)));
	}
	//inclusion A est il dans B 
	public static boolean inclus(Liste A, Liste B) {
		if (Liste.estVide(A))
			return true;
		else if (!appartient(Liste.premierElement(A), B))
			return false;
		else 
			return inclus(Liste.resteListe(A), B);
	}
	// A est il egal a B
	public static boolean egal(Liste A, Liste B)
	{
		return inclus(A,B) && inclus(B,A);
	}
	// intersection les elements communs pour deux ensembles
	public static Liste inter(Liste A, Liste B)
	{
		if(Liste.estVide(A)) {
			return null;
		}
		else if(appartient(Liste.premierElement(A), B))
		{
			return Liste.cons(Liste.premierElement(A), inter(Liste.resteListe(A), B));
		}
		else
			return inter(Liste.resteListe(A),B);
	}
	// union ce qui est dans A et dans B
	public static Liste union(Liste A, Liste B)
	{
		if(Liste.estVide(A)) {
			return B;
		}
		else if(appartient(Liste.premierElement(A), B)) {
			return union(Liste.resteListe(A), B);
		}
		else
			return Liste.cons(Liste.premierElement(A), union(Liste.resteListe(A), B));
	}
	// probeme sac a dos ,
	//	Difference [()] = ()
	//	Difference [(v,R), B]= si v€B alors difference [R,B]
	//							sinon Cons(v, Difference[R],B)
	// difference entre A et B 
	public static Liste difference(Liste A, Liste B)
	{
		if(Liste.estVide(A)) {
			return B;
		}
		else if( appartient(Liste.premierElement(A), B)) {
			return difference(Liste.resteListe(A), B);
		}
		else
			return Liste.cons(Liste.premierElement(A), difference(Liste.resteListe(A),B));
	}
	
}
