package hoofdstuk08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class H8Praktijk extends Applet {
    TextField tekstvak;
    TextField tekstvak2;

    String schremtekst;
    Label label;

    Button knop;
    Button knop1;
    Button knop2;
    Button knop3;

    double getal;
    double getal2;


    public void init() {
        tekstvak = new TextField("", 14);
        add(tekstvak);

        tekstvak2 = new TextField("", 14);
        add(tekstvak2);

        knop = new Button("*");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);

        knop1 = new Button("/");
        KnopListener1 k2 = new KnopListener1();
        knop1.addActionListener( k2 );
        add(knop1);

        knop2 = new Button("+");
        KnopListener2 k3 = new KnopListener2();
        knop2.addActionListener( k3 );
        add(knop2);

        knop3 = new Button("-");
        KnopListener3 k4 = new KnopListener3();
        knop3.addActionListener( k4 );
        add(knop3);

    }
    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String a = tekstvak.getText();
            getal = Double.parseDouble( a );
            String b = tekstvak.getText();
            getal2 = Double.parseDouble( b );
            double uitkomst = getal * getal2;
            tekstvak.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");
        }
    }
    class KnopListener1 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String c = tekstvak.getText();
            getal = Double.parseDouble( c );
            String d = tekstvak.getText();
            getal2 = Double.parseDouble( d );
            double uitkomst = getal / getal2;
            tekstvak.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");
        }
    }
    class KnopListener2 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String i = tekstvak.getText();
            getal = Double.parseDouble( i );
            String f = tekstvak.getText();
            getal2 = Double.parseDouble( f );
            double uitkomst = getal + getal2;
            tekstvak.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");
        }
    }
    class KnopListener3 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String g = tekstvak.getText();
            getal = Double.parseDouble( g );
            String h = tekstvak.getText();
            getal2 = Double.parseDouble( h );
            double uitkomst = getal - getal2;
            tekstvak.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");
        }
    }



}