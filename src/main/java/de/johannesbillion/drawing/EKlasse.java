package de.johannesbillion.drawing;

import basis.*;


public class EKlasse {
    // deklaration
    private Fenster fenster1;
    private IgelStift stift1;

    public EKlasse() {
        // Konstruktion
        fenster1 = new Fenster();
        stift1 = new IgelStift();
    }


    public void zeichneAlles() {
        this.zeichneWeihnachtsbaum(100, 150, 0);
        this.zeichneStern(90, 50, 0);
        this.zeichneStern(150, 50, 0);
        this.zeichneStern(30, 50, 0);
        this.zeichneWeihnachtsbaum(30, 150, 0);
        this.zeichneHaus(60, 100, 0);
    }

    public void zeichneWeihnachtsbaum(int x, int y, int rotation) {
        stift1.bewegeBis(x, y);
        stift1.dreheBis(rotation);
        stift1.runter();
        stift1.bewegeUm(40);
        stift1.dreheUm(90);
        stift1.bewegeUm(50);
        stift1.dreheUm(270);
        stift1.bewegeUm(100);
        stift1.dreheUm(135);
        stift1.bewegeUm(120);
        stift1.dreheUm(225);
        stift1.bewegeUm(50);
        stift1.dreheUm(135);
        stift1.bewegeUm(120);
        stift1.dreheUm(90);
        stift1.bewegeUm(120);
        stift1.dreheUm(135);
        stift1.bewegeUm(50);
        stift1.dreheUm(225);
        stift1.bewegeUm(120);
        stift1.dreheUm(135);
        stift1.bewegeUm(100);
        stift1.dreheUm(270);
        stift1.bewegeUm(50);
        stift1.hoch();
    }

    public void zeichneStern(int x, int y, int rotation) {
        stift1.bewegeBis(x, y);
        stift1.dreheBis(rotation);
        stift1.runter();
        stift1.bewegeUm(100);
        for (int i = 0; i < 4; i++) {
            stift1.dreheUm(216);
            stift1.bewegeUm(100);
        }
        stift1.hoch();
    }

    public void zeichneHaus(int x, int y, int rotation) {
        stift1.bewegeBis(x, y);
        stift1.dreheUm(rotation);
        stift1.runter();
        stift1.bewegeUm(150);
        stift1.dreheUm(90);
        stift1.bewegeUm(150);
        stift1.dreheUm(90);
        stift1.bewegeUm(150);
        stift1.dreheUm(225);
        stift1.bewegeUm(106);
        stift1.dreheUm(270);
        stift1.bewegeUm(106);
        stift1.dreheUm(270);
        stift1.bewegeUm(212);
        stift1.dreheUm(225);
        stift1.bewegeUm(150);
        stift1.dreheUm(225);
        stift1.bewegeUm(212);
        stift1.hoch();
    }

    public void zeichneE(int x, int y) {
        stift1.bewegeBis(x, y);
        stift1.runter();
        stift1.bewegeUm(150);
        stift1.dreheUm(270);
        stift1.bewegeUm(50);
        stift1.dreheUm(270);

        stift1.bewegeUm(100);
        stift1.dreheUm(90);
        stift1.bewegeUm(50);
        stift1.dreheUm(90);
        stift1.bewegeUm(100);
        stift1.dreheUm(270);
        stift1.bewegeUm(50);
        stift1.dreheUm(270);
        stift1.bewegeUm(100);
        stift1.dreheUm(90);
        stift1.bewegeUm(50);
        stift1.dreheUm(90);
        stift1.bewegeUm(100);
        stift1.dreheUm(270);
        stift1.bewegeUm(50);
        stift1.dreheUm(270);
        stift1.bewegeUm(150);
        stift1.dreheUm(270);
        stift1.dreheUm(250);


    }
}
