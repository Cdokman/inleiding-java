package hoofdstuk04;

import java.awt.*;
import java.applet.*;

public class H4O7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRoundRect(150, 100, 70, 50, 10, 10);
        g.setColor(Color.black);
        g.drawOval(165, 105, 15, 15);
        g.fillOval(165,105,15,15);
        g.setColor(Color.black);
        g.drawOval(165, 130, 15, 15);
        g.fillOval(165,130,15,15);
        g.setColor(Color.black);
        g.drawOval(190, 105, 15, 15);
        g.fillOval(190,105,15,15);
        g.setColor(Color.black);
        g.drawOval(190, 130, 15, 15);
        g.fillOval(190,130,15,15);


    }
}