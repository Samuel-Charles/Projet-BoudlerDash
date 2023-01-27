package View;

import Controller.Player;
import Entity.Map;

import Entity.try1;
import Model.Diamonds;
import Model.Finish;
import Model.Ground;
import Model.Walls;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
//import java.util.Map;

/*
*la classe de notre frame
*@author Group1
 */
public class Board extends JPanel implements ActionListener{

    private Timer time;
    private boolean win = false;
    private String Message = " ";
    private Font font = new Font("serif", Font.BOLD, 100);
    private Player p;
    private try1 o;
    private Diamonds d;
    private Finish f;
    private Ground u;
    private Walls w;
    private Map m;
    private AI ai;
    int i;
  //  Clock c;
    Random a = new Random();
    int b = a.nextInt(100);
    //int b =2;

    /*
    *@see
    * voici le constructeur de notre board(frame)
     */
    public Board() {


      //  c= new Clock();
        m = new Map();
        p = new Player();
        u = new Ground();
        f = new Finish();
        w = new Walls();
        d = new Diamonds();
        o = new try1();
        addKeyListener(new AI());
        setFocusable(true);
        time = new Timer(30, this);
        time.start();
        this.setBackground(Color.black);
        //System.out.println(m.getA());
        //p.update();
        o.open();


    }



    public void Condition() {

        if(m.getMap(p.getTileX(), p.getTileY() ).equals("k")) {
            d.diam1 = m.ground;
            i++;

        }if(m.getMap(p.getTileX(), p.getTileY() ).equals("l")) {
            d.diam2 = m.ground;
            i++;

        }if(m.getMap(p.getTileX(), p.getTileY() ).equals("m")) {
            d.diam3 = m.ground;
            i++;

        }if(m.getMap(p.getTileX(), p.getTileY() ).equals("n")) {
            d.diam4 = m.ground;
            i++;

        }if(m.getMap(p.getTileX(), p.getTileY() ).equals("o")) {
            d.diam5= m.ground;
            i++;

        }if(m.getMap(p.getTileX(), p.getTileY() ).equals("p")) {
            d.diam6 = m.ground;
            i++;

        }if(m.getMap(p.getTileX(), p.getTileY() ).equals("q")) {
            d.diam7 = m.ground;
            i++;

        }if(m.getMap(p.getTileX(), p.getTileY() ).equals("r")) {
            d.diam8 = m.ground;
            i++;

        }if(m.getMap(p.getTileX(), p.getTileY() ).equals("t")) {
            d.diam9 = m.ground;
            i++;

        }if(m.getMap(p.getTileX(), p.getTileY() ).equals("u")) {
            d.diam10 = m.ground;
            i++;

        }if(m.getMap(p.getTileX(), p.getTileY() ).equals("v")) {
            d.diam11 = m.ground;
            i++;
        }
        //
        if(m.getMap(p.getTileX(), p.getTileY() ).equals("!")) {
            u.dig1 = m.ground;
            i++;
        }
        if(m.getMap(p.getTileX(), p.getTileY() ).equals("£")) {
            u.dig2 = m.ground;
            i++;
        }
        if(m.getMap(p.getTileX(), p.getTileY() ).equals("$")) {
            u.dig3 = m.ground;
            i++;
        }
        if(m.getMap(p.getTileX(), p.getTileY() ).equals("%")) {
            u.dig4 = m.ground;
            i++;
        }
        if(m.getMap(p.getTileX(), p.getTileY() ).equals("^")) {
            u.dig5= m.ground;
            i++;
        }
        if(m.getMap(p.getTileX(), p.getTileY() ).equals("&")) {
            u.dig6 = m.ground;
            i++;
        }
        if(m.getMap(p.getTileX(), p.getTileY() ).equals("*")) {
            u.dig7 = m.ground;
            i++;
        }
        if(m.getMap(p.getTileX(), p.getTileY() ).equals("(")) {
            u.dig8 = m.ground;
            i++;
        }
        if(m.getMap(p.getTileX(), p.getTileY() ).equals(")")) {
            u.dig9 = m.ground;
            i++;
        }
        if(m.getMap(p.getTileX(), p.getTileY() ).equals("_")) {
            u.dig10 = m.ground;
            i++;
        }
        if(m.getMap(p.getTileX(), p.getTileY() ).equals("+")) {
            u.dig11 = m.ground;
            i++;
        }
        if(m.getMap(p.getTileX(), p.getTileY() ).equals("-")) {
            u.dig12 = m.ground;
            i++;
        }
        if(m.getMap(p.getTileX(), p.getTileY() ).equals("=")) {
            u.dig13 = m.ground;
            i++;
        }
        if(m.getMap(p.getTileX(), p.getTileY() ).equals("/")) {
            u.dig14 = m.ground;
            i++;
        }
        if(m.getMap(p.getTileX(), p.getTileY() ).equals(">")) {
            u.dig15 = m.ground;
            i++;
        }
        if(m.getMap(p.getTileX(), p.getTileY() ).equals("<")) {
            u.dig16 = m.ground;
            i++;
        }
        if(m.getMap(p.getTileX(), p.getTileY() ).equals("{")) {
            u.dig17 = m.ground;
            i++;
        }
        if(m.getMap(p.getTileX(), p.getTileY() ).equals("}")) {
            u.dig18 = m.ground;
            i++;
        }
        if(m.getMap(p.getTileX(), p.getTileY() ).equals("[")) {
            u.dig19 = m.ground;
            i++;
        }
        if(m.getMap(p.getTileX(), p.getTileY() ).equals("]")) {
            u.dig20 = m.ground;
            i++;
        }
        if(m.getMap(p.getTileX(), p.getTileY() ).equals(".")) {
            u.dig21 = m.ground;
            i++;
        }
        if(m.getMap(p.getTileX(), p.getTileY() ).equals(";")) {
            u.dig22 = m.ground;
            i++;
        }
        if(m.getMap(p.getTileX(), p.getTileY() ).equals("?")) {
            u.dig23 = m.ground;
            i++;
        }
        if(m.getMap(p.getTileX(), p.getTileY() ).equals(",")) {
            u.dig24 = m.ground;
            i++;
        }
        if(m.getMap(p.getTileX(), p.getTileY() ).equals("ù")) {
            u.dig25 = m.ground;
            i++;
        }
        if(m.getMap(p.getTileX(), p.getTileY() ).equals("é")) {
            u.dig26 = m.ground;
            i++;
        }
        if(m.getMap(p.getTileX(), p.getTileY() ).equals("è")) {
            u.dig27 = m.ground;
            i++;
        }



    }



    public void actionPerformed(ActionEvent e) {
        if(m.getMap(p.getTileX() -1, p.getTileY() ).equals("f") || m.getMap(p.getTileX() +1, p.getTileY() ).equals("f")
                || m.getMap(p.getTileX(), p.getTileY() -1).equals("f") || m.getMap(p.getTileX() , p.getTileY() +1).equals("f")){
            Message = "Winner";

            win = true;
        }

        repaint();


    }

    /*
    *la methode qui nous permet de paint nos diffrent element dans notre frame
    * @see
     */
    public void paint(Graphics g) {


        super.paint(g);
        if(!win) {
            for(int y = 0;y < 16; y++) {
                for(int x = 0; x < 16; x++) {
                    if(m.getMap(x, y).equals("f")) {
                        g.drawImage(f.getFinishs(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("z")) {
                        g.drawImage(f.getFinish2(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("g")) {
                        g.drawImage(u.getGround1(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("w")) {
                        g.drawImage(w.getWall(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("a")) {
                        g.drawImage(w.getWall2(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("i")) {
                        g.drawImage(d.getDiamond(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("h")) {
                        g.drawImage(d.getDiamond1(), x * 40, y * 40 , null);
                    }
                    if(m.getMap(x, y).equals("j")) {
                        g.drawImage(d.getDiamond2(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("d")) {
                        g.drawImage(u.getDig(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("k")) {
                        g.drawImage(d.getDiam1(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("l")) {
                        g.drawImage(d.getDiam2(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("m")) {
                        g.drawImage(d.getDiam3(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("n")) {
                        g.drawImage(d.getDiam4(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("o")) {
                        g.drawImage(d.getDiam5(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("p")) {
                        g.drawImage(d.getDiam6(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("q")) {
                        g.drawImage(d.getDiam7(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("r")) {
                        g.drawImage(d.getDiam8(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("t")) {
                        g.drawImage(d.getDiam9(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("u")) {
                        g.drawImage(d.getDiam10(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("v")) {
                        g.drawImage(d.getDiam11(), x * 40, y * 40, null);
                    }
                    //

                    if(m.getMap(x, y).equals("!")) {
                        g.drawImage(u.getDig1(), x * 40, y * 40, null);
                    }

                    if(m.getMap(x, y).equals("£")) {
                        g.drawImage(u.getDig2(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("$")) {
                        g.drawImage(u.getDig3(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("%")) {
                        g.drawImage(u.getDig4(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("^")) {
                        g.drawImage(u.getDig5(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("&")) {
                        g.drawImage(u.getDig6(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("*")) {
                        g.drawImage(u.getDig7(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("(")) {
                        g.drawImage(u.getDig8(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals(")")) {
                        g.drawImage(u.getDig9(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("_")) {
                        g.drawImage(u.getDig10(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("+")) {
                        g.drawImage(u.getDig11(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("-")) {
                        g.drawImage(u.getDig12(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("=")) {
                        g.drawImage(u.getDig13(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("/")) {
                        g.drawImage(u.getDig14(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals(">")) {
                        g.drawImage(u.getDig15(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("<")) {
                        g.drawImage(u.getDig16(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("{")) {
                        g.drawImage(u.getDig17(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("}")) {
                        g.drawImage(u.getDig18(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("[")) {
                        g.drawImage(u.getDig19(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("]")) {
                        g.drawImage(u.getDig20(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals(".")) {
                        g.drawImage(u.getDig21(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals(";")) {
                        g.drawImage(u.getDig22(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("?")) {
                        g.drawImage(u.getDig23(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals(",")) {
                        g.drawImage(u.getDig24(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("ù")) {
                        g.drawImage(u.getDig25(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("é")) {
                        g.drawImage(u.getDig26(), x * 40, y * 40, null);
                    }
                    if(m.getMap(x, y).equals("è")) {
                        g.drawImage(u.getDig27(), x * 40, y * 40, null);
                    }



                    //g.drawImage(o.getPlayer(),  p.getTileX() * 32, p.getTileY() *32, null);
                    //g.drawImage(m.getWall(), p.getTileX() * 32, p.getTileY() *32, null);
                }
            }
            g.drawImage(p.getPlayer(), p.getTileX() * 40, p.getTileY() *40, null);
        }

        if (win) {
            g.setColor(Color.ORANGE);
            g.setFont(font);
            g.drawString(Message, 150, 300);
        }

        //g.drawImage(p.getGround(), p.getTileX1() * 40, p.getTileY1() *40, null);
		/*for (int a=0; a < 3;a++) {
			g.drawImage(p.getGround(), p.getTileX1() * 40, p.getTileY1() *40, null);
			if((!m.getMap(p.getTileX1(), p.getTileY1() -1).equals("w") && (!m.getMap(p.getTileX1(), p.getTileY1() -1).equals("g")) )){
				if(b <= 50) {
					p.move2( 0, -1);
				}
			}
			if((!m.getMap(p.getTileX1(), p.getTileY1() +1).equals("w") && (!m.getMap(p.getTileX1(), p.getTileY1() +1).equals("g")) )){
				if(b >= 50) {
					p.move2( 0, +1);
				}
		}
		}*/

        //o.paint(g);

    }

    /*
    *La methode de notre key listener
    * @see
    * @author Group1
     */

    public class AI extends KeyAdapter{
        @Override
        //private Player p;
        public void keyPressed(KeyEvent e) {
            int keycode = e.getKeyCode();
            if (keycode == KeyEvent.VK_UP) {
                if((!m.getMap(p.getTileX(), p.getTileY() -1).equals("w") && (!m.getMap(p.getTileX(), p.getTileY() -1).equals("g")) && (!m.getMap(p.getTileX(), p.getTileY() -1).equals("a")))){
                    p.move( 0, -1);
                    //m.diamond = m.ground;
                    //System.out.println("w");
                    //m.diamond = m.ground;

                }
                Condition();
                if(m.getMap(p.getTileX(), p.getTileY() ).equals("i")) {
                    d.diamond = m.ground;
                    i++;

                }
                if(m.getMap(p.getTileX(), p.getTileY() ).equals("h")) {
                    d.diamond1 = m.ground;
                    i++;
                }
                if(m.getMap(p.getTileX(), p.getTileY() ).equals("j")) {
                    d.diamond2 = m.ground;
                    i++;
                }

                System.out.println(i);
				/*if(!m.getMap(p.getTileX(), p.getTileY() -1).equals("i")){
					//	m.diamond = m.ground;
						p.move( 0, -1);
						//m.diamond = m.ground;
					}*/
            }



            if (keycode == KeyEvent.VK_DOWN) {
                if((!m.getMap(p.getTileX(), p.getTileY() +1).equals("w") && (!m.getMap(p.getTileX(), p.getTileY() +1).equals("g")) && (!m.getMap(p.getTileX(), p.getTileY() +1).equals("a")))) {
                    p.move( 0, 1);
                }
                Condition();
                if(m.getMap(p.getTileX(), p.getTileY() ).equals("i")) {
                    d.diamond = m.ground;
                    i++;
                }
                if(m.getMap(p.getTileX(), p.getTileY() ).equals("h")) {
                    d.diamond1 = m.ground;
                    i++;
                }
                if(m.getMap(p.getTileX(), p.getTileY() ).equals("j")) {
                    d.diamond2 = m.ground;
                    i++;
                }System.out.println(i);

            }
            if (keycode == KeyEvent.VK_LEFT) {
                if((!m.getMap(p.getTileX() -1, p.getTileY()).equals("w") && (!m.getMap(p.getTileX() -1, p.getTileY()).equals("g")) && (!m.getMap(p.getTileX() -1, p.getTileY() ).equals("a")))) {
                    p.move( -1, 0);
                }
                Condition();
                if(m.getMap(p.getTileX(), p.getTileY() ).equals("i")) {
                    d.diamond = m.ground;
                    i++;
                }
                if(m.getMap(p.getTileX(), p.getTileY() ).equals("h")) {
                    d.diamond1 = m.ground;
                    i++;
                }
                if(m.getMap(p.getTileX(), p.getTileY() ).equals("j")) {
                    d.diamond2 = m.ground;
                    i++;
                }System.out.println(i);

            }
            if (keycode == KeyEvent.VK_RIGHT) {
                if((!m.getMap(p.getTileX() +1, p.getTileY() ).equals("w") && (!m.getMap(p.getTileX() +1, p.getTileY() ).equals("g")) && (!m.getMap(p.getTileX() +1, p.getTileY() ).equals("a")))) {
                    p.move( 1, 0);
                }
                Condition();
                if(m.getMap(p.getTileX(), p.getTileY() ).equals("i")) {
                    d.diamond = m.ground;
                    i++;
                }
                if(m.getMap(p.getTileX(), p.getTileY() ).equals("h")) {
                    d.diamond1 = m.ground;
                    i++;
                }
                if(m.getMap(p.getTileX(), p.getTileY() ).equals("j")) {
                    d.diamond2 = m.ground;
                    i++;
                }System.out.println(i);

            }
        }
        public void keyReleased(KeyEvent e) {

        }
        public void keyTyped(KeyEvent e) {

        }

    }
}


