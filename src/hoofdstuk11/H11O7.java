package hoofdstuk11;

        import java.applet.Applet;
        import java.awt.*;

public class H11O7 extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int y =0;
        int x =0;
        int hoogte = 750;
        int gewicht = 750;

        for (teller = 0; teller < 50; teller++) {
            x += 7.5;
            y += 7.5;
            gewicht -= 15;
            hoogte -= 15;
            g.drawRoundRect(x, y, gewicht, hoogte, gewicht, hoogte);
        }

    }
}