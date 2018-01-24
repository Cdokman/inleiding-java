package hoofdstuk04;

import java.awt.*;
import java.applet.*;

public class H4O8 extends Applet {

    public void init() {
        setSize(800,350);
    }

    public void paint(Graphics g) {
        g.drawRoundRect(20, 140, 100, 50, 10, 10);
        g.drawRect(20, 40, 100, 80);
        g.setColor(Color.magenta);
        g.drawRect(140, 40, 90, 60);
        g.fillRect(140,40,90,60);
        g.setColor(Color.black);
        g.drawOval(140, 40, 90, 60);
        g.drawOval(250, 40, 90, 60);
        g.setColor(Color.magenta);
        g.fillArc(240, 40, 100, 50, 15, 45);
        g.fillArc(240,40,100,50,15,45);
        g.setColor(Color.magenta);
        g.drawOval(140, 140, 90, 60);
        g.fillOval(140,140,90,60);
        g.setColor(Color.black);
        g.drawOval(250, 140, 70, 60);



    }
}