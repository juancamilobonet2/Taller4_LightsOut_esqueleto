package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBotones extends JPanel{
	
	public PanelBotones(){
		JButton button1 = new JButton("NUEVO");
		JButton button2 = new JButton("REINICIAR");
		JButton button3 = new JButton("TOP-10");
		JButton button4 = new JButton("CAMBIAR JUGADOR");
		
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		
		button1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent evt) {
		        pushNuevo(evt);
		    }
		});
		
		button2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent evt) {
		        pushReiniciar(evt);
		    }
		});
		
		button3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent evt) {
		        pushTop10(evt);
		    }
		});
		
		button4.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent evt) {
		        pushCambiar(evt);
		    }
		});
		
	}
	
	private void pushNuevo(ActionEvent evt) {
		//juego nuevo
		System.out.println("Button1 clicked");
	}
	
	private void pushReiniciar(ActionEvent evt) {
		//Reiniciar juego
		System.out.println("Button2 clicked");
	}
	
	private void pushTop10(ActionEvent evt) {
		//Menu top 10
		System.out.println("Button2 clicked");
	}
	
	private void pushCambiar(ActionEvent evt) {
		//Cambiar jugador
		System.out.println("Button2 clicked");
	}

}
