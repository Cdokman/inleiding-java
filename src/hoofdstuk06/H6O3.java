package hoofdstuk06;

import java.awt.*;
import java.applet.*;

public class H6O3 extends Applet {
    int a = 2147483645;
    int b = 4;
    int uitkomst;

    public void init() {

        uitkomst = (a + b);
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);


    }
}