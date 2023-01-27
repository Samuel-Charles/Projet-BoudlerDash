package Main;

import View.Board;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public static void main(String[] args) {
        new Main();

    }
    public Main() {
        JFrame win = new JFrame();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setTitle("Boudler Dash | Game");
        win.setSize(687, 709);
        win.add(new Board());
        win.setResizable(false);
        win.setLocationRelativeTo(null);
        win.setVisible(true);
        win.setBackground(Color.black);
        //win.pack();


    }

}

