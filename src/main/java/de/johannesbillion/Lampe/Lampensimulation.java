package de.johannesbillion.Lampe;

import basis.*;



public class Lampensimulation {
    public static void main(String[] args) {
        new Lampensimulation();
    }
    Fenster fenster = new Fenster(500, 500);
    Knopf kloeschen, kerstellen;

    public Lampensimulation() {
            kloeschen = new Knopf("Löschen",30, 20, 100, 20);
            kloeschen.setzeKnopfLauscher(knopf -> fenster.loescheAlles());
            kerstellen = new Knopf("Neue Lampe", 150, 20, 150, 20);
            kerstellen.setzeKnopfLauscher(knopf -> {
                Lampe lampe = new Lampe();
                lampe.zeichneLampe(250, 250, 100);
            });
            Lampe l1 = new Lampe();
            l1.zeichneLampe(200, 200, 30);
    }

    }


