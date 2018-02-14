package hoofdstuk11;

import java.applet.Applet;
import java.awt.*;



public class H11O4 extends Applet {


    public void init() {

    }

    public void paint(Graphics g) {
        int y = 0;

        for (int teller = 1; teller < 11; teller++) {
            y += 30;

        g.drawString(teller + " * " + "3" + " = " + (teller*3), 70, y);

    }

    }
}