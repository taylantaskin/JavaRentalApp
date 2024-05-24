
package com.atduyar.rental.UI.Forms;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.atduyar.rental.UI.BasicFramework.BfForm;

public class HomeForm extends BfForm {
    public HomeForm() {
        setTitle("Home");
    }

    @Override
    public void on_start() {
        panel.add(new JLabel("Home Form", SwingConstants.CENTER));
        JButton exitBtn = new JButton("Exit");
        exitBtn.addActionListener(e -> {
            getWindow().closeForm();
        });
        panel.add(exitBtn);
        System.out.println("Home Form Started");
    }

    @Override
    public void on_close() {
        System.out.println("Home Form Closed");
    }
}
