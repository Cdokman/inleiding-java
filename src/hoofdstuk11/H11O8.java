package hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

public class H11O8 extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int y =20;
        int x =20;
        int hoogte = 750;
        int gewicht = 750;

        for (teller = 0; teller < 2000; teller++) {
            gewicht -= 15;
            hoogte -= 15;
            g.drawRoundRect(x, y, gewicht, hoogte, gewicht, hoogte);
        }

    }
}
