package hoofdstuk08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H8O2 extends Applet {
    Button knop;
    Button knop1;
    Button knop2;
    Button knop3;
    String schermtekst;
    String s;
    Label label;
    int getal = 0;
    int getal2 = 0;
    int getal3 = 0;
    int getal4 = 0;
    int totaal = 0;

    public void init() {
        knop = new Button("Man");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);

        knop1 = new Button("Vrouw");
        KnopListener1 k2 = new KnopListener1();
        knop1.addActionListener( k2 );
        add(knop1);

        knop2 = new Button("Man LL");
        KnopListener2 k3 = new KnopListener2();
        knop2.addActionListener( k3 );
        add(knop2);

        knop3 = new Button("Vrouw LL");
        KnopListener3 k4 = new KnopListener3();
        knop3.addActionListener( k4 );
        add(knop3);

    }

    public void paint(Graphics g) {
        g.drawString("Aantal Man " + getal, 80, 100 );
        g.drawString("Aantal Vrouw " + getal2, 80, 120 );
        g.drawString("Aantal Man LL " + getal3, 80, 140 );
        g.drawString("Aantal Vrouw LL " + getal4, 80, 160 );
        totaal = getal + getal2 + getal3 + getal4;
        g.drawString("Totaal " + totaal, 80, 180 );




    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            getal++;

            repaint();
        }
    }
    class KnopListener1 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            getal2++;

            repaint();
        }
    }class KnopListener2 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            getal3++;

            repaint();
        }
    }class KnopListener3 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            getal4++;

            repaint();
        }
    }
}