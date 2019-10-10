package projet1;

import javax.swing.*;
import java.awt.*;

public class Fenetre {
	
	// Déclaration des objets
	private JFrame fenetre;
	private JPanel pan;
	private int SizeX = 0;
	private int SizeY = 0;
	
	private JButton Btn_Traduire = new JButton("Traduire");
	
	// Constructeur de la classe
	public Fenetre(int pSizeX, int pSizeY)
	{
		SizeX=pSizeX;
		SizeY=pSizeY;
		
		fenetre = new JFrame("Traducteur Morse");
		fenetre.setSize(SizeX, SizeY);
		fenetre.setLocationRelativeTo(null);
		
		pan = new JPanel();
		fenetre.setContentPane(pan);
		
		fenetre.add(pan);
		fenetre.setVisible(true);
		
	}
	
	public void Button(int pWidth, int pHeigh)
	{
		fenetre.setLayout(null);
		
		
	}
}
