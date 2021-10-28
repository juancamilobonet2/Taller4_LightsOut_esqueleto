package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PanelSettings extends JPanel {
	
	private int tamanio;
	
	private JRadioButton option1;
    private JRadioButton option2;
    private JRadioButton option3;
	
	

	public PanelSettings() {
		//Para escoger tamaño
		JLabel label = new JLabel("Tamaño: ");
		add(label);
		
		String[] tamanios = new String[] {"4x4","5x5","6x6"};
		JComboBox<String> tamaniosList = new JComboBox<>(tamanios);
		add(tamaniosList);
		
		//Para escoger dificultad
		label = new JLabel("Dificultad: ");
		add(label);
		
		option1 = new JRadioButton("Facil");
        option2 = new JRadioButton("Medio");
        option3 = new JRadioButton("Dificil");
        
        option1.setBackground(Color.blue);
        option2.setBackground(Color.blue);
        option3.setBackground(Color.blue);
        
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
        group.add(option3);
        
        add(option1);
        add(option2);
        add(option3);
        
        
        tamaniosList.addActionListener(new ActionListener() {
        	 
            @Override
            public void actionPerformed(ActionEvent event) {
                JComboBox<String> combo = (JComboBox<String>) event.getSource();
                String selectedBook = (String) combo.getSelectedItem();
         
                if (selectedBook.equals("4x4")) {
                    tamanio = 4;
                } else if (selectedBook.equals("5x5")) {
                    tamanio = 5;
                } else if (selectedBook.equals("6x6")) {
                    tamanio = 6;
                }
            }
        });
	}
	
	public int getDificultad() {
		int dif = 0;
		if(option1.isSelected()) {
			dif = 1;
		}
		if(option2.isSelected()) {
			dif = 2;
		}
		if(option3.isSelected()) {
			dif = 3;
		}
		return dif;
	}
	
	public int getTamanio() {
		return tamanio;
	}
}
