package com.calcolatrice.main;

import com.calcolatrice.graphics.CalcWindow;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        CalcWindow calcWindow = new CalcWindow();
        calcWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calcWindow.setVisible(true);

    }

}
