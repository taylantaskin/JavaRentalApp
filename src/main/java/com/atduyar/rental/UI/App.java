package com.atduyar.rental.UI;

import java.io.IOException;

import com.atduyar.rental.UI.BasicFramework.BfWindow;
import com.atduyar.rental.UI.Forms.HomeForm;

public class App {
    public static void main(String[] args) throws IOException {
        BfWindow window = new BfWindow("Hello World");

        window.openForm(new HomeForm());
        System.in.read();
        // window.openPanel(memberPanel);
        System.in.read();
        window.closeForm();
        System.in.read();
        window.closeForm();
    }

}
