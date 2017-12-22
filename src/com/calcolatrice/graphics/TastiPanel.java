package com.calcolatrice.graphics;

import calcolatriceModel.Calcolatrice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TastiPanel extends JPanel {

    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bplus, bminus, bmult, bdiv, bequal, bpoint, bce, bm, bmr, bmc;

    public TastiPanel(CalcWindow mainWindow, Calcolatrice calcolatrice){
        setLayout(new GridLayout(4,5,5,5));
        setBackground(Color.BLACK);

        b0 = new JButton("0");
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcolatrice.key(Integer.parseInt(b0.getText()));
                mainWindow.getDisplayPanel().getTf().setText(calcolatrice.getDisplay());
            }
        });

        b1 = new JButton("1");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcolatrice.key(Integer.parseInt(b1.getText()));
                mainWindow.getDisplayPanel().getTf().setText(calcolatrice.getDisplay());
            }
        });

        b2 = new JButton("2");
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcolatrice.key(Integer.parseInt(b2.getText()));
                mainWindow.getDisplayPanel().getTf().setText(calcolatrice.getDisplay());
            }
        });


        b3 = new JButton("3");
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcolatrice.key(Integer.parseInt(b3.getText()));
                mainWindow.getDisplayPanel().getTf().setText(calcolatrice.getDisplay());
            }
        });

        b4 = new JButton("4");
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcolatrice.key(Integer.parseInt(b4.getText()));
                mainWindow.getDisplayPanel().getTf().setText(calcolatrice.getDisplay());
            }
        });

        b5 = new JButton("5");
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcolatrice.key(Integer.parseInt(b5.getText()));
                mainWindow.getDisplayPanel().getTf().setText(calcolatrice.getDisplay());
            }
        });

        b6 = new JButton("6");
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcolatrice.key(Integer.parseInt(b6.getText()));
                mainWindow.getDisplayPanel().getTf().setText(calcolatrice.getDisplay());
            }
        });

        b7 = new JButton("7");
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcolatrice.key(Integer.parseInt(b7.getText()));
                mainWindow.getDisplayPanel().getTf().setText(calcolatrice.getDisplay());
            }
        });

        b8 = new JButton("8");
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcolatrice.key(Integer.parseInt(b8.getText()));
                mainWindow.getDisplayPanel().getTf().setText(calcolatrice.getDisplay());
            }
        });

        b9 = new JButton("9");
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcolatrice.key(Integer.parseInt(b9.getText()));
                mainWindow.getDisplayPanel().getTf().setText(calcolatrice.getDisplay());
            }
        });

        bplus = new JButton("+");
        bplus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcolatrice.key(Calcolatrice.BUTTON_PLUS);
                mainWindow.getDisplayPanel().getTf().setText(calcolatrice.getDisplay());
            }
        });

        bminus = new JButton("-");
        bminus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcolatrice.key(Calcolatrice.BUTTON_MINUS);
                mainWindow.getDisplayPanel().getTf().setText(calcolatrice.getDisplay());
            }
        });

        bmult = new JButton("X");
        bmult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcolatrice.key(Calcolatrice.BUTTON_MOLT);
                mainWindow.getDisplayPanel().getTf().setText(calcolatrice.getDisplay());
            }
        });

        bdiv = new JButton("/");
        bdiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcolatrice.key(Calcolatrice.BUTTON_DIV);
                mainWindow.getDisplayPanel().getTf().setText(calcolatrice.getDisplay());
            }
        });

        bequal = new JButton("=");
        bequal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcolatrice.key(Calcolatrice.BUTTON_RETURN);
                mainWindow.getDisplayPanel().getTf().setText(calcolatrice.getDisplay());
            }
        });

        bpoint = new JButton(".");
        bpoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcolatrice.key(Calcolatrice.BUTTON_COMMA);
                mainWindow.getDisplayPanel().getTf().setText(calcolatrice.getDisplay());
            }
        });

        bce = new JButton("CE");
        bce.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcolatrice.key(Calcolatrice.BUTTON_CE);
                mainWindow.getDisplayPanel().getTf().setText(calcolatrice.getDisplay());
            }
        });

        bm = new JButton("M+");
        bm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcolatrice.key(Calcolatrice.BUTTON_M);
                mainWindow.getDisplayPanel().getTf().setText(calcolatrice.getDisplay());
            }
        });

        bmr = new JButton("MR");
        bmr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcolatrice.key(Calcolatrice.BUTTON_MR);
                mainWindow.getDisplayPanel().getTf().setText(calcolatrice.getDisplay());
            }
        });

        bmc = new JButton("MC");
        bmc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcolatrice.key(Calcolatrice.BUTTON_MC);
                mainWindow.getDisplayPanel().getTf().setText(calcolatrice.getDisplay());
            }
        });

        add(b7);
        add(b8);
        add(b9);
        add(bplus);
        add(bce);
        add(b4);
        add(b5);
        add(b6);
        add(bminus);
        add(bm);
        add(b1);
        add(b2);
        add(b3);
        add(bmult);
        add(bmr);
        add(b0);
        add(bpoint);
        add(bequal);
        add(bdiv);
        add(bmc);


    }
}
