package com.calcolatrice.graphics;

import calcolatriceModel.Calcolatrice;

import javax.swing.*;
import java.awt.*;

public class CalcWindow extends JFrame {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 350;

    private TastiPanel tastiPanel;
    private DisplayPanel displayPanel;

    Calcolatrice calcolatrice;

    public CalcWindow(){
        setTitle("Calcolatrice");
        setSize(new Dimension(WIDTH, HEIGHT));

        calcolatrice=new Calcolatrice();

        tastiPanel = new TastiPanel(this, calcolatrice);
        displayPanel = new DisplayPanel(this, calcolatrice);

        Container c = getContentPane();
        setLayout(new GridBagLayout());
        c.setBackground(Color.BLACK);

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0;

        gbc.gridx = 0;
        gbc.gridy = 0;

        c.add(displayPanel, gbc);

        gbc.gridy = 1;
        gbc.weighty = 0.6;
        gbc.ipady = 100;
        c.add(tastiPanel,gbc);

    }

    public DisplayPanel getDisplayPanel() {
        return displayPanel;
    }
}
