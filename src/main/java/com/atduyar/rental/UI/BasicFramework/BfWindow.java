
package com.atduyar.rental.UI.BasicFramework;

import java.awt.BorderLayout;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BfWindow {
    private JFrame frame;
    private Stack<BfForm> formHistory;
    private BfForm currentForm;

    public BfWindow(String title) {
        this.frame = new JFrame(title);
        this.formHistory = new Stack<BfForm>();
        changeTitle(title);
    }

    private void changeTitle(String title) {
        this.frame.setTitle(title);
    }

    public void openForm(BfForm panel) {
        panel.setWindow(this);
        this.formHistory.push(panel);
        this.currentForm = panel;
        display();
    }

    public void replaceForm(BfForm panel) {
        panel.setWindow(this);
        this.formHistory.pop();
        this.formHistory.push(panel);
        this.currentForm = panel;
        display();
    }

    public void closeForm() {
        this.formHistory.pop();
        if (this.formHistory.isEmpty()) {
            this.exit();
        }
    }

    public void exit() {
        this.frame.dispose();
        System.exit(0);
    }

    public void display() {
        this.frame.getContentPane().removeAll();

        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setLayout(new BorderLayout()); // Set BorderLayout for the JFrame
        this.frame.getContentPane().add(this.currentForm.getPanel(), BorderLayout.CENTER);
        this.frame.pack();
        this.frame.setVisible(true);
    }
}
