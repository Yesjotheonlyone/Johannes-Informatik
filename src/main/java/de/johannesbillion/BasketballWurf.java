package de.johannesbillion;

import basis.*;

public class BasketballWurf {
    private final Bild ball;

        public BasketballWurf() {
            Fenster f = new Fenster("Ballwurf", 500, 300);
            f.setzeHintergrundFarbe(Farbe.GELB);
            Bild werfer1 = new Bild("/bilder/werfer.gif");
            werfer1.setzePosition(10, 100);
            Bild werfer2 = new Bild("/bilder/werfer.gif");
            werfer2.setzePosition(400, 100);
            werfer2.spiegeleBild(false);
            ball = new Bild("/bilder/ball.gif");
            ball.setzePosition(48, 95);
            ball.hPosition();
            ball.vPosition();
            ball.setzePosition(100, 200);
        }

        public void fuehreAus() {
            this.wurfNachRechts();
            this.wurfNachLinks();
        }

        public void wurfNachRechts() {
            while (ball.hPosition() < 380) {
                ball.setzePosition(ball.hPosition() + 0.001, ball.vPosition());
            }
        }

        public void wurfNachLinks() {
            while (ball.hPosition() > 0) {
                ball.setzePosition(ball.hPosition() + 0.001, ball.vPosition());
            }
        }


}
