package hoofdstuk04;

import java.awt.*;
import java.applet.*;

public class H4O5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(100, 100, 100, 50, 90, 45);
        g.drawOval(100, 100, 100, 50);
        g.fillOval(100,100,100,50);

    }
}