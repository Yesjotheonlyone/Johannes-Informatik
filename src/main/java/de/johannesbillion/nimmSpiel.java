package de.johannesbillion;

import basis.*;

public class nimmSpiel {
    private final Fenster fenster;
    private BeschriftungsFeld b1, b2, b3;
    private Knopf k1, k2, k3;
    private int punkteaktuell;
    private boolean Spieler1;

    public nimmSpiel(){
        fenster = new Fenster("Nimm Spiel",500,500);
        b1 = new BeschriftungsFeld("Spieleranzeige",50, 50, 500, 20);
        b2 = new BeschriftungsFeld("Gewinneranzeige", 50, 400, 500, 20);
        b3 = new BeschriftungsFeld("Hölzeranzahl", 50, 150, 500, 20);
        k1 = new Knopf("-1", 75, 200, 300, 40);
        k2 = new Knopf("-2", 75, 245, 300, 40);
        k3 = new Knopf("-3", 75, 290, 300, 40);
        punkteaktuell = Hilfe.zufall(10,20);
        b3.setzeText("Anzahl der Hölzer: " + punkteaktuell);
        Spieler1 = true;
        k1.setzeKnopfLauscher(knopf -> ausfuehren(1));
        k2.setzeKnopfLauscher(knopf -> ausfuehren(2));
        k3.setzeKnopfLauscher(knopf -> ausfuehren(3));
    }
    public void ausfuehren(int minusAnzahl) {
        punkteaktuell -= minusAnzahl;
        this.gewinner();
        this.spielerWechsel();
        b3.setzeText("Anzahl der Hölzer " + punkteaktuell);
    }
    public void gewinner(){
        if (punkteaktuell == 1){
            if (Spieler1){
                b2.setzeText("Spieler 1 hat verloren");
            }
            else {
                b2.setzeText("Spieler 2 hat verloren");
            }
        }
    }
    public void spielerWechsel(){
        if (Spieler1){
            b1.setzeText("Spieler 1");
            Spieler1 = false;
        } else {
            b1.setzeText("Spieler 2");
            Spieler1 = true;
        }
    }
}