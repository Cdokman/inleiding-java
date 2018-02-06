package hoofdstuk08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H8O1 extends Applet {
    Button knop;
    Button knop1;
    String schermtekst;
    String s;
    TextField tekstvak;

    public void init() {
        schermtekst = "Doet deze knop wel iets?";
        knop = new Button("ok");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);


        knop1 = new Button("reset");
        KnopListener1 k2 = new KnopListener1();
        knop1.addActionListener( k2 );
        add(knop1);

        tekstvak = new TextField("", 20);
        add(tekstvak);
        s = "";
    }

    public void paint(Graphics g) {
        g.drawString(schermtekst, 50, 60 );
    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            schermtekst = tekstvak.getText();

            repaint();
        }
    }
    class KnopListener1 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            schermtekst = "";

            repaint();
        }
    }
}