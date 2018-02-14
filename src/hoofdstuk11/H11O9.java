package hoofdstuk11;
import java.applet.Applet;
import java.awt.*;

public class H11O9 extends Applet {
    public void init() {
        setSize(1000, 1000);
    }

    int breedte = 50;
    int hoogte = 50;
    int x = 50;
    int y = 50;


    public void paint(Graphics g) {
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6 || kolom == 8) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);

            } else {
                g.setColor(Color.black);
                g.drawRect(x, y, breedte, hoogte);

            }
            x += breedte;
            x = 50;
            y += hoogte;
            for (kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.black);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte, hoogte);

                }
                x += breedte;
            }
            x += breedte;
            x = 50;
            y += hoogte;
            for (kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.black);
                    g.fillRect(x, y, breedte, hoogte);

                }
                x += breedte;
            }
            x += breedte;
            x = 50;
            y += hoogte;
            for (kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.black);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte, hoogte);

                }
                x += breedte;
            }
            x += breedte;
            x = 50;
            y += hoogte;
            for (kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.black);
                    g.fillRect(x, y, breedte, hoogte);

                }
                x += breedte;
            }
            x += breedte;
            x = 50;
            y += hoogte;
            for (kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.black);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte, hoogte);

                }
                x += breedte;
            }
            x += breedte;
            x = 50;
            y += hoogte;
            for (kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.black);
                    g.fillRect(x, y, breedte, hoogte);

                }
                x += breedte;
            }
            x += breedte;
            x = 50;
            y += hoogte;
            for (kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.black);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte, hoogte);

                }
                x += breedte;
            }
            x += breedte;
            x = 50;
            y += hoogte;
            for (kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte, hoogte);

                } else {
                    g.setColor(Color.black);
                    g.fillRect(x, y, breedte, hoogte);


                }
                x += breedte;
            }
        }
    }
}