package hoofdstuk05;

import java.awt.*;
import java.applet.*;

public class H5O2 extends Applet {
    //declaratie.
    int lengteValerie;
    int lengteJeroen;
    int lengteHans;
    int nulpunt;



    public void init() {
        setSize(1000,1000);
        nulpunt=300;
        lengteValerie= 20;
        lengteJeroen= 20;
        lengteHans= 20;

              }

    public void paint(Graphics g) {
    super.paint(g);

    setBackground(Color.white);
    g.setColor(Color.black);
    g.drawLine(300, 302, 100,302);
    g.drawLine(100,100,100,300);

        g.setColor(Color.blue);
        g.fillRect(120,nulpunt - (lengteJeroen*2),40,lengteJeroen*2);
        g.setColor(Color.red);
        g.fillRect(170,nulpunt - (lengteValerie*2),40,lengteValerie*2);
        g.setColor(Color.yellow);
        g.fillRect(220,nulpunt - (lengteHans*2),40,lengteHans*2);

        g.setColor(Color.black);
        g.drawString("100",80,110);
        g.drawString("80",85,150);
        g.drawString("60",85,190);
        g.drawString("40",85,230);
        g.drawString("20",85,270);

}



}