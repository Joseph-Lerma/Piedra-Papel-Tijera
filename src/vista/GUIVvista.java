package vista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIVvista {


    private JFrame frame;
    private JButton btnPiedra;
    private JButton btnPapel;
    private JButton btnTijera;
    private JLabel lblResult;

    public GUIVvista() {
        frame = new JFrame("Piedra, Papel o Tijera");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        btnPiedra = new JButton("Piedra");
        btnPapel = new JButton("Papel");
        btnTijera = new JButton("Tijera");
        lblResult = new JLabel("Selecciona una opción");

        frame.add(btnPiedra);
        frame.add(btnPapel);
        frame.add(btnTijera);
        frame.add(lblResult);

        frame.setVisible(true);
    }

    public void setButtonActionListener(ActionListener listener) {
        btnPiedra.addActionListener(listener);
        btnPapel.addActionListener(listener);
        btnTijera.addActionListener(listener);
    }

    public void displayResult(String result) {
        lblResult.setText(result);
    }

    public JButton getBtnPiedra() {
        return btnPiedra;
    }

    public JButton getBtnPapel() {
        return btnPapel;
    }

    public JButton getBtnTijera() {
        return btnTijera;
    }
}

