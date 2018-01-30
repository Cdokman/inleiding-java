package hoofdstuk04;

import java.awt.*;
import java.applet.*;

public class H4O3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawRect(100, 50, 150, 40);
        g.fillRect(100, 50, 150, 40);
        g.setColor(Color.black);
        g.drawRect(100, 90, 150, 40);
        g.setColor(Color.blue);
        g.drawRect(100, 130, 150, 40);
        g.fillRect(100, 130, 150, 40);
        g.setColor(Color.black);
        g.drawLine(100,50,100,300);
    }
}