package hoofdstuk08;

import jdk.internal.dynalink.linker.LinkerServices;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H8O3 extends Applet {
    TextField tekstvak;
    Label label;
    double getal;
    Button knop;
    String schermtekst;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Prijs");
        tekstvak.addActionListener( new TekstvakListener() );

        knop = new Button("OK");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);

        add(label);
        add(tekstvak);

        TextField uitvoering;

    }

    public void paint(Graphics g) {
        g.drawString("Bedrag van BTW " + getal, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            repaint();
        }
    }
    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            getal = Double.parseDouble( tekstvak.getText() )*1.21;

            repaint();
        }
    }


    }