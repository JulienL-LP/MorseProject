package projet1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void LireString() {
		String ligne_lue = null;
		try {
//			InputStreamReader lecteur = new InputStreamReader(System.in);
//			BufferedReader entree = new BufferedReader(lecteur);
			Scanner sc = new Scanner(System.in);
			List<String> lignes = Arrays.asList(sc.nextLine());
			Path fichierCode = Paths.get("monFichierCode");
			Files.write(fichierCode, lignes, Charset.forName("UTF-8"));
			
			
		} catch (IOException e) {
			System.exit(0);
		}

	}
	
	public static void main(String[] args) {

		
//		Liste listeMorse = new Liste(0, null);
//		Liste A = new Liste(2, null);
//		Liste B = new Liste(3, null);
//		Fonctions.insertion(4, A);
//		Fonctions.insertion(6, A);
//		Fonctions.insertion(4, B);
//		Fonctions.insertion(5, B);
//		Liste.afficher(B);
//		
		String codeMorse[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
                ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                "...","-","..-","...-",".--","-..-","-.--","--..",
                ".-.-.-","-----",".----","..---","...--","....-",".....",
                "-...","--...","---..","----"};
		
		String corespondance = "ABCDEFGHIJKLMNOPQRSTUVWXYZ.0123456789";
		
		
		
		System.out.print("Entrer le texte à traduire ");
		String x;
//		x = LireString();
//		x = x.toUpperCase();
//		for (int i = 0; i< x.length(); i++) {
//			for (int t = 0; t < corespondance.length(); t++) {
//				if(x.charAt(i) == corespondance.charAt(t)) {
//					System.out.print(" "+codeMorse[t]+" ");
//					break;
//				}
//			}
//		}
		List<String> listeACoder;
		listeACoder = new ArrayList<String>();
		
		try {
			Scanner sc = new Scanner(System.in);
			List<String> lignes = Arrays.asList(sc.nextLine());
			Path fichierCode = Paths.get("monFichierCode");
			Files.write(fichierCode, lignes, Charset.forName("UTF-8"));
			List<String> lignesCodes = Files.readAllLines(Paths.get("monFichierCode"), Charset.forName("UTF-8"));
//			lignesCodes.forEach(s -> listeACoder.add(s) );
			lignesCodes.forEach(s ->{
				listeACoder.add(s);
				for(String l: s.split(" ")) {
					for(int i = 0; i < l.length(); i++) {
						for(int t = 0; t < corespondance.length(); t++) {
							if(l.charAt(i) == corespondance.charAt(t)) {
								System.out.print(" "+codeMorse[t]+" ");
								break;
							}
						}
					}
//					System.out.println(s+" hey ");
				}
			});
			
			for (String string : lignesCodes) {
				System.out.println(string);
			}
		} catch (IOException e) {
			System.exit(0);
		}
//		blabla test merge
		
//		
//		try {
//			Scanner sc = new Scanner(System.in);
//			List<String> lignes = Arrays.asList(sc.nextLine());
//			Path fichier = Paths.get("monFichier");
//			Files.write(fichier, lignes, Charset.forName("UTF-8"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Liste l = new Liste("", null);
		try {
			int i = 0;
			List<String> texte = Files.readAllLines(Paths.get("monFichierCode"), Charset.forName("UTF-8"));
			for(String s: texte) {
				for(String r: s.split(" ")) {
					i++;
					System.out.println(i);
					Liste.insertionChaine(l, r);

					}
					
				}
			
			for(int inc = 0; inc < Fonctions.longueur(l); inc++) {
				System.out.println(Liste.afficherChaine(l));
				System.out.println(" hey ");
			}

			
//			
//			texte.forEach(s -> {
//				for (String l: s.split(" ")) {
//					System.out.println(s+" hey ");
//				}
//			}) ;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
/* class fichier properties*/
}
