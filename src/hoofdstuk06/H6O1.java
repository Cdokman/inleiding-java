package hoofdstuk06;

import java.awt.*;
import java.applet.*;

public class H6O1 extends Applet {
    double a= 113;
    double b;

    public void init() {
        b= a/4;
    }

    public void paint(Graphics g) {
        g.drawString("Cyrano krijgt : " + b, 20, 20);
        g.drawString("Jan krijgt: " + b, 20, 40);
        g.drawString("Ali krijgt: " + b, 20, 60);
        g.drawString("Jeannette krijgt: " + b, 20, 80);
    }
}