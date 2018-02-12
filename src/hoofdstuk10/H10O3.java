package hoofdstuk10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H10O3 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int dag;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het maand nummer en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt( s);
            switch(dag) {
                case 1:
                    tekst = "Januari,31";
                    break;
                case 2:
                    tekst = "Februari,28";
                    break;
                case 3:
                    tekst = "Maart,31";
                    break;
                case 4:
                    tekst = "April,30";
                    break;
                case 5:
                    tekst = "Mei,31";
                    break;
                case 6:
                    tekst = "Juni,30";
                    break;
                case 7:
                    tekst = "Juli,31";
                    break;
                    case 8:
                    tekst = "Augustus,31";
                    break;
                case 9:
                    tekst = "September,30";
                    break;
                    case 10:
                    tekst = "Oktober,31";
                    break;
                case 11:
                    tekst = "November,30";
                    break;
                case 12:
                    tekst = "December,31";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }
            repaint();
        }
    }
}