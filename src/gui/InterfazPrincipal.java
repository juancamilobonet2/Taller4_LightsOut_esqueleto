package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class InterfazPrincipal extends JFrame{
	
	private PanelSettings panelSettings;
	private PanelTablero panelTablero;
	private PanelBotones panelBotones;
	private PanelInfo panelInfo;
	private PanelEmpty panelTest;
	
	public InterfazPrincipal () {
		BorderLayout bl = new BorderLayout();
		setLayout(bl);
		
		setTitle("Lights Out!");
		setSize(new Dimension(800,800));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panelSettings = new PanelSettings();
		panelSettings.setBackground(Color.blue);
		panelSettings.setBounds(0, 0, 800, 100);
		add(panelSettings);
		
		panelTablero = new PanelTablero(0,new boolean[0][0]);
		panelTablero.setBackground(Color.white);
		panelTablero.setBounds(0, 100, 800, 500);
		add(panelTablero);
		
		panelBotones = new PanelBotones();
		panelBotones.setBackground(Color.red);
		panelBotones.setBounds(0, 600, 800, 100);
		add(panelBotones);
		
		panelInfo = new PanelInfo();
		panelInfo.setBackground(Color.yellow);
		panelInfo.setBounds(0, 700, 800, 100);
		add(panelInfo);
		
		panelTest = new PanelEmpty();
        panelTest.setBackground(Color.yellow);
        panelTest.setBounds(0, 500, 800, 100);
        add(panelTest);
		
		panelSettings.setPanelTablero(panelTablero);
		
	}
	
	public static void main(String[] args) {
		InterfazPrincipal ventana = new InterfazPrincipal();
		ventana.setVisible(true);
		
		
	}
	
	public void updateTablero(int tamanio, boolean[][] tablero) {
		
	}
}
