package hoofdstuk04;

import java.awt.*;
import java.applet.*;

public class H4O2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(100,100,200,100);
        g.drawLine(200,100,150,50);
        g.drawLine(150,50,100,100);
        g.drawRect(100, 100, 100, 100);
        g.drawRect(125,125, 25, 25);
        g.drawRect(170,165,25,35);

    }
}