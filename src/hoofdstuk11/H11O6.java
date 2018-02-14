package hoofdstuk11;

import java.applet.Applet;
        import java.awt.*;

public class H11O6 extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int y =0;
        int x =0;
        int hoogte = 300;
        int gewicht = 300;

        for (teller = 0; teller < 5; teller++) {
            x += 25;
            y += 25;
            gewicht -=50;
            hoogte -=50;
            g.drawRoundRect(x,y,gewicht,hoogte,gewicht,hoogte);




        }


    }
}