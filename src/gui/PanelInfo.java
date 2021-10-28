package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelInfo extends JPanel{

    private JLabel etiquetaJugadas;
    private JTextField campoJugadas;
    private JLabel etiquetaJugador;
    private JTextField campoJugador;

    public PanelInfo() {
        setSize(new Dimension(100,100));

        etiquetaJugadas = new JLabel("Jugadas: ");
        //etiquetaJugadas.setBounds(200, 600, 200, 30);
        campoJugadas = new JTextField();
        campoJugadas.setEditable(false);
        campoJugadas.setText("10");

        etiquetaJugador = new JLabel("Jugador: ");
        //etiquetaJugador.setBounds(200, 600, 200, 30);
        campoJugador = new JTextField();
        campoJugador.setEditable(false);
        campoJugador.setText("ABC");

        setLayout(new FlowLayout());

        add(etiquetaJugadas);
        add(campoJugadas);
        add(etiquetaJugador);
        add(campoJugador);

    }

    public void actualizarJugadas(String jugadas) {
        campoJugadas.setText(jugadas);
    }

    public void actualizarJugador(String jugador) {
        campoJugador.setText(jugador);
    }
}