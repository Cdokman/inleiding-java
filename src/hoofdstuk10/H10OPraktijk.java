package hoofdstuk10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H10OPraktijk extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int uitkomst;

    public void init () {
        tekstvak = new TextField("",20);
        label = new Label ("welke cijfer heb je en druk op enter");
        tekstvak.addActionListener(new TekstvakListener());
        tekst = "";
        add(label);
        add(tekstvak);

    }

    public void paint(Graphics g) {
        g.drawString(tekst,50,60);
    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            uitkomst = Integer.parseInt( s);


            if (uitkomst > 0 && uitkomst < 4) {
                tekst = "Slect Bezig";
            }

            else if (uitkomst >= 4 && uitkomst < 5) {
                tekst = "Onvoldoende";
            }
            else if (uitkomst == 5 ) {
                tekst = "Maatig";
            }

            else if (uitkomst >= 6 && uitkomst <= 7) {
                tekst = "Voldoende";
            }

            else if (uitkomst == 8 || uitkomst ==9 || uitkomst ==10) {
                tekst = "Goed";
            }

            else if (uitkomst >10 || uitkomst ==0 ) {
                tekst = "Kies uit 0/10";
            }

            else if (uitkomst <1){
                tekst = "Negatief";
            }


            repaint();
        }

    }
}