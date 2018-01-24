package hoofdstuk04;

import java.awt.*;
import java.applet.*;

public class H4O4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawRect(50, 100, 50, 100);
        g.fillRect(50,100,50,100);
        g.setColor(Color.red);
        g.drawRect(100, 160, 50, 40);
        g.fillRect(100,160,50,40);
        g.setColor(Color.yellow);
        g.drawRect(150, 120, 50, 80);
        g.fillRect(150,120,50,80);


    }
}