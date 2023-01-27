package Model;

import javax.swing.*;
import java.awt.*;

public class Walls {

    public Image wall;
    public Image wall2;

    /*
     *le constructeur qui permet d'imprimer les image du mur
     * @author Group1
     */
    public Walls() {

        ImageIcon img = new ImageIcon("C://Users//LATITUDE//Desktop//Try//wall.png");
        wall = img.getImage();
        img = new ImageIcon("C://Users//LATITUDE//Desktop//Try//new.png");
        wall2 = img.getImage();
    }

    public Image getWall() {
        return wall;
    }
    public Image getWall2() {
        return wall2;
    }

}
