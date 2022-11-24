package de.johannesbillion;

import basis.*;

public class Test {

    private Fenster fenster;
    private BeschriftungsFeld würfel;
    private ZahlenFeld zahl;
    private BeschriftungsFeld punkte, anzeige, gewürfelt;
    private Knopf ende, wuerfel, neu;
    private int eingabeZahl, punkteSp1, w1, w2, w3;
    private boolean spieler;

    public void Wuerfel() {
        fenster = new Fenster(500, 500);
        würfel = new BeschriftungsFeld("Wie oft Würfeln", 20, 20, 200, 50);
        zahl = new ZahlenFeld(20, 80, 20, 20);
        punkte = new BeschriftungsFeld("Punkte:", 20, 110, 50, 50);
        anzeige = new BeschriftungsFeld("Gewürfelte Zahlen:", 20, 230, 200, 50);
        ende = new Knopf("Ende", 20, 290, 80, 50);
        wuerfel = new Knopf("Würfeln", 20, 350, 80, 50);
        neu = new Knopf("Neu", 20, 410, 80, 50);
        eingabeZahl = 0;
        punkteSp1 = 0;
        w1 = 0;
        w2 = 0;
        w3 = 0;

        wuerfel.setzeKnopfLauscher(knopf -> this.ausgabe());

    }

    public void ausgabe() {
        eingabeZahl = zahl.ganzZahl();
        punkteSp1 = eingabeZahl;
        this.wuerfeln();
        System.out.println("Ergebnis: Spieler 1 hat"+eingabeZahl+" mal gewürfelt. Er hat die Zahlen: "+w1+","+w2+","+w3+"gewürfelt. Er hat "+punkteSp1+" Punkte erzielt." );
    }

    public void wuerfeln() {
        if (eingabeZahl == 1) {
            w1 = Hilfe.zufall(1, 6);
        } else if (eingabeZahl==2) {
            w1 = Hilfe.zufall(1, 6);
            w2 = Hilfe.zufall(1, 6);
        } else if (eingabeZahl==3) {
            w1 = Hilfe.zufall(1, 6);
            w2 = Hilfe.zufall(1, 6);
            w3 = Hilfe.zufall(1, 6);
        }
    }
    public void auswerten(){
        if (w1==w2 || w2==w3 || w3==w1){
            punkteSp1=0;
        }
    }
}


