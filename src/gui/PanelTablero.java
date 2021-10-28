package gui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class PanelTablero extends JPanel{
	
	private int tamanio;
	private boolean[][] tablero;
	private int height;
	private int width;
	
	public PanelTablero(int tamanio, boolean[][] tablero) {
		this.tamanio = tamanio;
		this.tablero = tablero;
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D)g;
		
		Dimension panelDimen = getSize();
		height = (int) panelDimen.getHeight();
		width = (int) panelDimen.getWidth();
		
		System.out.println(height + " " + width);
		
		paintTablero(tamanio,g2d);
	}
	
	private void paintTablero(int tamanio, Graphics2D g2d) {
		for(int i = 0; i<tamanio; i++) {
			g2d.fillRect(50*i, 50*i, 50, 50);
		}
	}
	
	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

}
