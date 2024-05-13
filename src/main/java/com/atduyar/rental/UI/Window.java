
package com.atduyar.rental.UI;

import java.awt.BorderLayout;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window {
    private String title;
    private JFrame frame;
    private Stack<JPanel> panels;
    private JPanel panel;

    public Window(String title) {
        this.title = title;
        this.frame = new JFrame(title);
        this.panels = new Stack<JPanel>();
    }

    private void changeTitle(String title) {
        this.title = title;
        this.frame.setTitle(title);
    }

    public void openPanel(JPanel panel) {
        this.panels.push(panel);
        this.panel = panel;
        display();
    }

    public void replacePanel(JPanel panel) {
        this.panels.pop();
        this.panels.push(panel);
        this.panel = panel;
        display();
    }

    public void closePanel() {
        this.panels.pop();
        if (this.panels.isEmpty()) {
            this.exit();
        }
    }

    public void exit() {
        this.frame.dispose();
    }

    public void changePanel(int i) {
        this.panel = this.panels.get(i);
    }

    public void display() {
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.getContentPane().removeAll();
        this.frame.setLayout(new BorderLayout()); // Set BorderLayout for the JFrame
        this.frame.getContentPane().add(this.panel, BorderLayout.CENTER);
        this.frame.pack();
        this.frame.setVisible(true);
    }
}
