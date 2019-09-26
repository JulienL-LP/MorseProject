package projet1;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Fonctions {
	
	// Recherche dans la liste si x appartient a cette liste
	public static boolean appartient (char x, Liste pListe) {
		if(Liste.estVide(pListe)) {
			return false;
		}
		else if(x == Liste.lettreValeur(pListe)) {
			return true;
		}
		else {
			return appartient(x, Liste.reste(pListe));
		}
	}
	
	// Longeur d'un liste
	public static int longueur(Liste p) {
		if (Liste.estVide(p)) {
			return 0;
		}
		else {
			return 1+longueur(Liste.reste(p));
		}
	}
	
	// Recherche codeMorse
	public static String recherche(Liste l, char lettre) {
		String code = null;
		if(appartient(lettre, l) == true) {
			for(int i = 0; i < longueur(l); i++) {
				if(lettre == Liste.lettreValeur(l)) {
					code = Liste.codeValeur(l);
				}
			}
		}
		return code;
	}
	
	// Crypte le message en morse grace a la liste de conversion
	public static void crypte(Liste l1, Liste l2) {
		
	}
	
	// Décrypte le code de morse en lettre grace à la liste de conversion
	public static void decrypte(Liste l1, Liste l2) {
		
	}
	
	// Transfert le text contenu dans le fichier et le stock dans une liste 
	public static List transfertText() {
//		try {
		List<String> l = null;
		return l;
//			List<String> liste = Files.readAllLines(Paths.get("monFichier"), Charset.forName("UTF-8"));
//			return liste;
////			liste.forEach(s->{
////				System.out.print(s);
////			});
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
}
