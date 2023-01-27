package Model;

import javax.swing.*;
import java.awt.*;

public class Finish {

    public Image finish,finish2;

    /*
     *le constructeur qui permet d'imprimer les image de la fin
     * @author Group1
     */
    public Finish() {

        ImageIcon img = new ImageIcon("C://Users//LATITUDE//Desktop//Try//F3.png");
        finish = img.getImage();
        img = new ImageIcon("C://Users//LATITUDE//Desktop//Try//gate.png");
        finish2 = img.getImage();

    }

    public Image getFinishs() {
        return finish;
    }

    public Image getFinish2() {
        return finish2;
    }
}
