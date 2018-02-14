package hoofdstuk11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;



public class H11OPraktijk extends Applet {

    TextField tekstvak;
    Label label;
    Button knop;
    String schermtekst;
    int tafel;


    public void init() {
        tekstvak = new TextField("Type hier in", 20);
        label = new Label("Tafels");


        knop = new Button("OK");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);

        add(label);
        add(tekstvak);

        TextField uitvoering;
    }

    public void paint(Graphics g) {
        int y = 0;

        for (int teller = 1; teller < 11; teller++) {
            y += 30;

            g.drawString(teller + " * " + tafel + " = " + teller*tafel, 70, y);



        }

    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tafel = Integer.parseInt(tekstvak.getText());


            repaint();
        }
    }
}