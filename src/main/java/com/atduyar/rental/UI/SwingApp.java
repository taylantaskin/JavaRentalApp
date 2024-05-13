package com.atduyar.rental.UI;

import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class SwingApp {
    public static void main(String[] args) throws IOException {
        Window window = new Window("Hello World");

        JPanel homePanel = new JPanel();
        JPanel memberPanel = new JPanel();

        JLabel lblText = new JLabel("Hello World!", SwingConstants.CENTER);
        JLabel memberLblText = new JLabel("Hello Member World!", SwingConstants.CENTER);

        homePanel.add(lblText);
        memberPanel.add(memberLblText);

        window.openPanel(homePanel);
        System.in.read();
        window.openPanel(memberPanel);
        System.in.read();
        window.closePanel();
        System.in.read();
        window.closePanel();
    }

}
