package hoofdstuk11;

import java.applet.Applet;
import java.awt.*;
public class H11O3 extends Applet {
    int a;
    int b;
    int som;

    public void init() {
        setSize(800,800);
        a=0;
        b=1;

    }

    public void paint(Graphics g) {
        int x = 50;
        int a = 0;
        int b = 1;
        int som = a +b;
        for(int teller = 1; teller <100; teller++){
            g.drawString(""+ som,x, 30);
            a = b;
            b = som;
            som = a+b;
            x += 50;
        }

    }
}