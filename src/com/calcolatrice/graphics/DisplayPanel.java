package com.calcolatrice.graphics;

import calcolatriceModel.Calcolatrice;

import javax.swing.*;
import java.awt.*;

public class DisplayPanel extends JPanel {

    private JTextField tf;
    private Calcolatrice calcolatrice;

    public DisplayPanel(JFrame mainWindow, Calcolatrice calcolatrice){
        setLayout(new GridLayout(1,1));
        setBackground(Color.BLACK);
        tf = new JTextField();

        tf.setSize(mainWindow.getWidth(), mainWindow.getHeight()/3);
        tf.setPreferredSize(new Dimension(mainWindow.getWidth(), mainWindow.getHeight()/3));
        tf.setBackground(Color.BLACK);
        tf.setForeground(Color.GREEN);
        tf.setEnabled(false);
        tf.setDisabledTextColor(Color.GREEN);
        tf.setFont(new Font("Comic Sans MS", Font.BOLD, 42));
        tf.setHorizontalAlignment(JTextField.RIGHT);

        add(tf);

        this.calcolatrice=calcolatrice;
    }

    @Override
    public void paintComponents(Graphics graphics) {
        super.paintComponents(graphics);
        tf.setText(calcolatrice.getDisplay());
    }

    public JTextField getTf() {
        return tf;
    }
}
