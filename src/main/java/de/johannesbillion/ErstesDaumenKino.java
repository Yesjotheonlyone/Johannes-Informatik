package de.johannesbillion;

import basis.*;

import java.nio.file.Path;

public class ErstesDaumenKino {

    private Fenster f;
    private Bild b1;

    public ErstesDaumenKino() {
        f = new Fenster(440, 240);

        b1 = new Bild(20,20,400,200);
        b1.ladeBild("C:\\Users\\jo10h\\Documents\\Schule\\Bilder\\Yeet-0\\Muybridge_race_horse_animated-0.png");
        b1 = new Bild(20,20,400,200);
        b1.ladeBild("C:\\Users\\jo10h\\Documents\\Schule\\Bilder\\Yeet-0\\Muybridge_race_horse_animated-0.png");
        b1 = new Bild(20,20,400,200);
        b1.ladeBild("C:\\Users\\jo10h\\Documents\\Schule\\Bilder\\Yeet-0\\Muybridge_race_horse_animated-0.png");
        b1 = new Bild(20,20,400,200);
        b1.ladeBild("C:\\Users\\jo10h\\Documents\\Schule\\Bilder\\Yeet-0\\Muybridge_race_horse_animated-0.png");
        b1 = new Bild(20,20,400,200);
        b1.ladeBild("C:\\Users\\jo10h\\Documents\\Schule\\Bilder\\Yeet-0\\Muybridge_race_horse_animated-0.png");
        b1 = new Bild(20,20,400,200);
        b1.ladeBild("C:\\Users\\jo10h\\Documents\\Schule\\Bilder\\Yeet-0\\Muybridge_race_horse_animated-0.png");
        b1 = new Bild(20,20,400,200);
        b1.ladeBild("C:\\Users\\jo10h\\Documents\\Schule\\Bilder\\Yeet-0\\Muybridge_race_horse_animated-0.png");
        b1 = new Bild(20,20,400,200);
        b1.ladeBild("C:\\Users\\jo10h\\Documents\\Schule\\Bilder\\Yeet-0\\Muybridge_race_horse_animated-0.png");
    }

    public void abspielungEins() {

        for (int i = 0; i < 15; i++) {

            f.ladeBildInZeichenflaeche();
        }
    }

    public void sichtbarness() {
        b1.setzeSichtbar(true);


    }
    public void fuehreFünfMalAus() {
        for (int i=0; i<5; i++)
            this.sichtbarness();
    }

}

