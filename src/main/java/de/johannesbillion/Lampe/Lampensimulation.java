package de.johannesbillion.Lampe;

import basis.*;



public class Lampensimulation {
    public static void main(String[] args) {
        new Lampensimulation();
    }
    Fenster fenster = new Fenster(500, 500);
    Knopf kloeschen, kerstellen,farbeAendern, positionAendern, groesseAendern, versteckeLampe;;
    ZahlenFeld eingabeNummer;
    Lampe lampe[] = new Lampe[2];


    public Lampensimulation() {
            kloeschen = new Knopf("Löschen",30, 20, 100, 20);
            kloeschen.setzeKnopfLauscher(knopf -> setlampeAusblenden());
            kerstellen = new Knopf("Neue Lampe", 150, 20, 150, 20);
            kerstellen.setzeKnopfLauscher(knopf -> setKreiserstellen());
            farbeAendern = new Knopf("Farbe Ändern", 500, 120, 150, 30);
            farbeAendern.setzeKnopfLauscher(knopf -> setFarbeAendern());
            eingabeNummer = new ZahlenFeld (400, 120, 150, 20);

                lampe[0] = new Lampe();
                lampe[0].zeichneLampe(100,100, 20);
                lampe[1] = new Lampe();
                lampe[1].zeichneLampe(200, 100, 20);
                lampe[2] = new Lampe();
                lampe[2].zeichneLampe(300, 100, 20);


            }

    public void setlampeAusblenden(){
        var aktuelleLampe = eingabeNummer.ganzZahl();
        lampe[aktuelleLampe].versteckeLampe();
            }

    public void setFarbeAendern(){
        var aktuelleLampe = eingabeNummer.ganzZahl();
        lampe[aktuelleLampe].farbeAuswahl();
    }
    public void setKreiserstellen(){
        var aktuelleLampe = eingabeNummer.ganzZahl();
        lampe[aktuelleLampe].zeichneLampe(100,100, 20);
    }

}




