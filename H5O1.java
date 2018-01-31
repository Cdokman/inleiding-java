package hoofdstuk05;

import java.awt.*;
import java.applet.*;

public class H5O1 extends Applet {

    Color lijnKleur;
    Color vulKleur;
    int breedte;
    int hoogte =60;


    public void init() {
        setSize(800,350);
        lijnKleur = Color.BLACK;
        vulKleur = Color.BLUE;
        breedte = 100;
    }

    public void paint(Graphics g) {
        g.drawRoundRect(20, 140, breedte, 50, 10, 10);
        g.drawRect(20, 40, breedte, hoogte);
        g.setColor(vulKleur);
        g.drawRect(140, 40, breedte, hoogte);
        g.fillRect(140,40,breedte,hoogte);
        g.setColor(lijnKleur);
        g.drawOval(140, 40, breedte, hoogte);
        g.drawOval(250, 40, breedte, hoogte);
        g.setColor(vulKleur);
        g.fillArc(240, 40, breedte, hoogte, 15, 45);
        g.fillArc(240,40,breedte,hoogte,15,45);
        g.setColor(vulKleur);
        g.drawOval(140, 140, breedte, hoogte);
        g.fillOval(140,140,breedte,hoogte);
        g.setColor(lijnKleur);
        g.drawOval(250, 140, breedte, hoogte);



    }
}