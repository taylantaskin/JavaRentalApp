package com.atduyar.rental.UI.BasicFramework;

import javax.swing.JPanel;

public abstract class BfForm {
    private String title;
    private BfWindow window;
    protected JPanel panel;

    public BfForm() {
        this.panel = new JPanel();
        on_start();
    }

    public abstract void on_start();

    public abstract void on_close();

    public String getTitle() {
        return title;
    }

    public BfWindow getWindow() {
        return window;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWindow(BfWindow bfWindow) {
        this.window = bfWindow;
    }
}
