package de.johannesbillion;

import basis.*;

public class ZufallsExperiement {

    Fenster f;
    BeschriftungsFeld titel, frage, antwort, spielbeschreibung;
    ZahlenFeld Eingabe;
    Integer zufallsZahl, rateZahl;
    TextFeld kommentar;
    Knopf ende, neu;

    private ZufallsExperiement(){
        f = new Fenster("Zufallsexperiment", 200, 300);
        titel = new BeschriftungsFeld("Zahlenraten", 45, 30, 110, 30);
        titel.setzeSchriftGroesse(20);
        frage = new BeschriftungsFeld("Welche Zahl...", 35, 80, 130, 20);
        Eingabe = new ZahlenFeld(80, 100, 40, 30);
        Eingabe.setzeSchriftGroesse(20);
        Eingabe.setzeFokus();
        antwort = new BeschriftungsFeld("Bewertung", 70, 150,60,20);
        kommentar = new TextFeld(20, 170, 160, 30);
        kommentar.setzeBenutzbar(false);
        ende = new Knopf("Ende", 10, 250, 50 , 20);
        neu = new Knopf("Start", 140, 250, 50 ,20);
        zufallsZahl = Hilfe.zufall(1, 99);
        rateZahl = 0;
    }
    private Spiel(){

        if(rateZahl == zufallsZahl){

        }
        while (!ende.wurdeGedrueckt()){
            if(Eingabe.returnWurdeGedrueckt()){
                this.antwort();
            }
            if(neu.wurdeGedrueckt()){
                this.rateZahl();
            }
            f.gibFrei();
        }
    }

}