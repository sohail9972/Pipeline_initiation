package org.Program_Under_CI_CD;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class AppletClassTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello");
        frame.add(new JLabel("Hello World"));
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

