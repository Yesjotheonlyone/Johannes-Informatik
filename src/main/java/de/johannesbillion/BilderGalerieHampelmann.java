package de.johannesbillion;

import basis.*;

public class BilderGalerieHampelmann {
    private Fenster f;
    private Bild b1, b2, b3, b4;
    private IgelStift s;

    private int x;

    public BilderGalerieHampelmann() {
        x = 0;
        f = new Fenster("Hampelmanngalerie", 640, 200);
        f.setzeHintergrundFarbe(Farbe.GELB);
        s = new IgelStift();
        b1 = new Bild(100, 10, 100, 150);
        b1.setzeHintergrundFarbe(Farbe.GRUEN);
        b2 = new Bild(100, 10, 100, 150);
        b2.setzeHintergrundFarbe(Farbe.GRUEN);
        b3 = new Bild(100, 10, 100, 150);
        b3.setzeHintergrundFarbe(Farbe.GRUEN);
        b4 = new Bild(100, 10, 100, 150);
        b4.setzeHintergrundFarbe(Farbe.GRUEN);

        s.maleAuf(b1);
        this.zeichneP1();
        s.maleAuf(b2);
        this.zeichneP2();
        s.maleAuf(b3);
        this.zeichneP3();
        s.maleAuf(b4);
        this.zeichneP4();
    }

    public void zeichneP1() {
        s.hoch();
        s.bewegeBis(50, 30);
        s.zeichneKreis(20);
        s.dreheBis(270);
        s.bewegeUm(20);
        s.runter();
        s.bewegeUm(40);
        s.dreheUm(30);
        s.bewegeUm(50);
        s.bewegeUm(-50);
        s.dreheUm(-60);
        s.bewegeUm(50);
        s.bewegeUm(-50);
        s.dreheUm(30);
        s.bewegeUm(-30);
        s.dreheUm(40);
        s.bewegeUm(50);
        s.bewegeUm(-50);
        s.dreheUm(-80);
        s.bewegeUm(50);
    }

    public void zeichneP2() {
        s.hoch();
        s.bewegeBis(50, 30);
        s.zeichneKreis(20);
        s.dreheBis(270);
        s.bewegeUm(20);
        s.runter();
        s.bewegeUm(40);
        s.dreheUm(30);
        s.bewegeUm(50);
        s.bewegeUm(-50);
        s.dreheUm(-60);
        s.bewegeUm(50);
        s.bewegeUm(-50);
        s.dreheUm(30);
        s.bewegeUm(-30);
        s.dreheUm(20);
        s.bewegeUm(50);
        s.bewegeUm(-50);
        s.dreheUm(-40);
        s.bewegeUm(50);
    }

    public void zeichneP3() {
        s.hoch();
        s.bewegeBis(50, 30);
        s.zeichneKreis(20);
        s.dreheBis(270);
        s.bewegeUm(20);
        s.runter();
        s.bewegeUm(40);
        s.dreheUm(30);
        s.bewegeUm(50);
        s.bewegeUm(-50);
        s.dreheUm(-60);
        s.bewegeUm(50);
        s.bewegeUm(-50);
        s.dreheUm(30);
        s.bewegeUm(-30);
        s.dreheUm(80);
        s.bewegeUm(50);
        s.bewegeUm(-50);
        s.dreheUm(190);
        s.bewegeUm(50);
    }

    public void zeichneP4() {
        s.hoch();
        s.bewegeBis(50, 30);
        s.zeichneKreis(20);
        s.dreheBis(270);
        s.bewegeUm(20);
        s.runter();
        s.bewegeUm(40);
        s.dreheUm(30);
        s.bewegeUm(50);
        s.bewegeUm(-50);
        s.dreheUm(-60);
        s.bewegeUm(50);
        s.bewegeUm(-50);
        s.dreheUm(30);
        s.bewegeUm(-30);
        s.dreheUm(120);
        s.bewegeUm(50);
        s.bewegeUm(-50);
        s.dreheUm(130);
        s.bewegeUm(50);
    }

    public void maleBilder() {
        s.maleAuf(b1);
        this.zeichneP1();
        s.maleAuf(b2);
        this.zeichneP2();
        s.maleAuf(b3);
        this.zeichneP3();
        s.maleAuf(b4);
        this.zeichneP4();
        s.setzeSichtbar(false);
    }

    public void zeigeVon1bis4() {
        this.maleBilder();
        b2.setzeSichtbar(false);
        b3.setzeSichtbar(false);
        b4.setzeSichtbar(false);
        b1.setzeSichtbar(true);
        Hilfe.pause(1000);
        b1.setzeSichtbar(false);
        b2.setzeSichtbar(true);
        Hilfe.pause(1000);
        b2.setzeSichtbar(false);
        b3.setzeSichtbar(true);
        Hilfe.pause(1000);
        b3.setzeSichtbar(false);
        b4.setzeSichtbar(true);
        Hilfe.pause(1000);
    }
    public void animiereEinMal() {
        b4.setzeSichtbar(false);
        b1.setzeSichtbar(true);
        Hilfe.pause(100);
        b1.setzeSichtbar(false);
        b2.setzeSichtbar(true);
        Hilfe.pause(100);
        b2.setzeSichtbar(false);
        b3.setzeSichtbar(true);
        Hilfe.pause(100);
        b3.setzeSichtbar(false);
        b4.setzeSichtbar(true);
        Hilfe.pause(100);
    }
    public void fuehreAnimationAus() {
        while (x<5)
            this.zeigeVon1bis4();
        x++;
    }

    public void fuehreFünfMalAus() {
        for (int i=0; i<5; i++)
            this.animiereEinMal();
    }
}

