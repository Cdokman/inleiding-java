package hoofdstuk06;

import java.awt.*;
import java.applet.*;

public class H6O2 extends Applet {
    int a;
    int b;
    int c;


    public void init() {
        a= 60*60;
        b= a*24;
        c= b*365;
    }

    public void paint(Graphics g) {
        g.drawString(" hoeveel seconden er in een 1 uur : " + a, 20, 20);
        g.drawString(" hoeveel seconden er in een 1 dag : " + b, 20, 40);
        g.drawString(" hoeveel seconden er in een 1 jaar : " + c, 20, 60);

    }
}