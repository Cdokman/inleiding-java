package hoofdstuk04;

import java.awt.*;
import java.applet.*;

public class H4O6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawRect(140, 25, 50, 100);
        g.fillRect(140,25,50,100);
        g.setColor(Color.black);
        g.drawRect(160, 125, 10, 100);
        g.fillRect(160,125,10,100);
        g.setColor(Color.red);
        g.drawOval(150, 30, 30, 30);
        g.fillOval(150,30,30,30);
        g.setColor(Color.orange);
        g.drawOval(150, 60, 30, 30);
        g.fillOval(150,60,30,30);
        g.setColor(Color.green);
        g.drawOval(150, 90, 30, 30);
        g.fillOval(150,90,30,30);

    }
}