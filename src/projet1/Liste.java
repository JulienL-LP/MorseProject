package projet1;
import java.util.Scanner;

public class Liste {

		// TODO Auto-generated method stub
		int x;
		Liste suiv;
		// TODO fonction estVide / premierElement / resteListe / cons
		// Construit une liste à partir d'un element et d'une liste 
		public Liste(int pX, Liste pli) {
			x = pX;
			suiv = pli;
		}		
		public static boolean estVide(Liste l) {
			return l==null;		
		}
		public static int premierElement(Liste l) {
			return l.x;
		}
		public static Liste resteListe(Liste l) {
			return l.suiv;
		}
		public static Liste cons(int a, Liste l) {
			return new Liste(a,l);
		}
		public static void afficher(Liste l)
		{
			while(!estVide(l)) {
				System.out.println(premierElement(l));
				l = resteListe(l);			
			}
		}

}
