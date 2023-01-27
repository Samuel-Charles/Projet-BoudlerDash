package Controller;

import javax.swing.*;
import java.awt.*;


public class Player {

    private int  tilex, tiley;

    private Image player,ground1;
    private Player p;

    int i = 0;
    private int speed;

    private String direction;

    /*
    *le constructeur de notre joueur
    * @author Group1
     */
    public Player() {
        ImageIcon img = new ImageIcon("C://Users//LATITUDE//Desktop//Try//droit.png");
        player = img.getImage();
        img = new ImageIcon("C://Users//LATITUDE//Desktop//Try//droit.png");
        ground1 = img.getImage();
        //this.ai = ai;
        speed = 40;
		/*x = 32;
		y = 32;*/

        tilex = 2;
        tiley = 2;

    }
    public Image getPlayer() {
        return player;
    }
    public Image getGround() {
        return ground1;
    }
    /*public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }*/
    public int getTileX() {
        return tilex;
    }
    public int getTileY() {
        return tiley;
    }
    public void move(float dx, float dy) {



        tilex += dx;
        tiley += dy;

    }


}

