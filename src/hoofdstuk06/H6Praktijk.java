package hoofdstuk06;

import java.awt.*;
import java.applet.*;

public class H6Praktijk extends Applet {

    double cijfer1;
    double cijfer2;
    double cijfer3;
    double gemiddelde;


    public void init() {
        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;
        gemiddelde = (cijfer1 + cijfer2 + cijfer3) / 3;
        gemiddelde = (int) (gemiddelde * 10);
        gemiddelde = gemiddelde/10;


    }

    public void paint(Graphics g) {
        g.drawString("gemiddelde is:" + gemiddelde,20,20);



    }
}