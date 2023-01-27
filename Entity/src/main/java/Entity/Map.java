package Entity;

import Controller.*;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Scanner;


public class Map {

    Player p;
    try1 t;
    private Scanner m;
    private int  tilex, tiley;
    private String Map[] = new String[17];
    public Image grass,enemy,ground,diamond,diamond1,diamond2;
    Image wall;
    Image finish;
    int x,y;
    public int a;

    /*
    *@author Group1
     */

    public Map() {
        //t= new try1();
        ImageIcon img = new ImageIcon("C://Users//LATITUDE//Desktop//Try//ground.png");
        grass = img.getImage();
		/*img.getIconWidth();
		img.getIconHeight();
		System.out.println(img.getIconHeight());
		System.out.println(img.getIconWidth());*/
        img = new ImageIcon("C://Users//LATITUDE//Desktop//Try//wall.png");
        wall = img.getImage();
        img = new ImageIcon("C://Users//LATITUDE//Desktop//Try//ball1.png");
        finish = img.getImage();
        img = new ImageIcon("C://Users//LATITUDE//Desktop//Try//ball1.png");
        enemy = img.getImage();
        img = new ImageIcon("C://Users//LATITUDE//Desktop//Try//DE.png");
        ground = img.getImage();
        img = new ImageIcon("C://Users//LATITUDE//Desktop//Try//DI2.png");
        diamond = img.getImage();
        img = new ImageIcon("C://Users//LATITUDE//Desktop//Try//DI.png");
        diamond1 = img.getImage();
        img = new ImageIcon("C://Users//LATITUDE//Desktop//Try//DI3.png");
        diamond2 = img.getImage();
        img.getIconHeight();
        System.out.println("veillez entrer la map");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();


	/*	if(!getMap(p.getTileX(), p.getTileY() -1).equals("w")) {
			img = new ImageIcon("C://Users//LATITUDE//Desktop//Try//droit.png");
			wall = img.getImage();
		}*/

        tilex = 1;
        tiley = 1;
        openfile();
        readfile();
        closefile();
    }

    public void ask() {
		/*System.out.println("veillez entrer la map");
		Scanner sc = new Scanner(System.in);
		 a = sc.nextInt();*/
    }
    public String getMap(int x, int y) {
        String index = Map[y].substring(x, x+1);
        return index;
    }

    /*
    *Nos diferents getters et setters
    * @see
     */
    public int getTileX() {
        return tilex;
    }
    public int getTileY() {
        return tiley;
    }

    public Image getGrass() {
        return grass;
    }

    public Image getWall() {
        return wall;
    }

    public Image getFinish() {
        return finish;
    }

    public Image getEnemy() {
        return enemy;
    }
    public Image getGround() {
        return ground;
    }

    public Image getDiamond() {
        return diamond;
    }

    public Image getDiamond1() {
        return diamond1;
    }
    public Image getDiamond2() {
        return diamond2;
    }


    /*
    *Methode qui ouvre notre fichier txt et renvoie une error si ne peut le lire
    * @see
     */
    public void openfile() {



        try {
            String b;
            if (a == 1) {
                b = "C://Users//LATITUDE//Desktop//map.txt";
            }
            else {
                b= "C://Users//LATITUDE//Desktop//map2.txt";
            }
            //System.out.println(b);
            m = new Scanner(new File(b));}
        catch(Exception e) {
            System.out.println("error in loading map");
        }


    }
    /*
    *notre getter qui recupere la valeur de la map qu'on sauvegarder dans notre BDD
    * @see
     */
    public int getA() {
        System.out.println(a);
        return a;
    }

    /*
    *la methode qui lit notre fichier txt
    * @see
     */
    public void readfile() {
		/*if ( a =="1") {

		}*/
        while(m.hasNext()) {

            for(int i = 0;i < 17; i++) {
                //System.out.println(m.nextLine());
                Map[i] = m.next();
            }
        }

    }

    public void move(int dx, int dy) {



        tilex += dx;
        tiley += dy;

    }

    private void closefile() {
        m.close();

    }

}
