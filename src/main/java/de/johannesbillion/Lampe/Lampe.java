package de.johannesbillion.Lampe;

import basis.*;

import java.awt.*;


public class Lampe {

    public static void main(String[] args) {
        new Lampe();
    }

    private Stift s1 = new Stift();
    int xwert, ywert, zwert;

    private void zeichneLampe(int x, int y, int z){
        xwert=x;
        ywert=y;
        zwert=z;
            s1.normal();
        s1.setzeFuellMuster(Muster.GEFUELLT);
        s1.setzeFarbe(Color.cyan);
        s1.kreis(xwert, ywert, zwert);
    }
    public void loeschen(){
        s1.setzeFuellMuster(Muster.GEFUELLT);
        s1.radiere();
        s1.kreis(xwert, ywert, zwert+1);
    }
    /*public void setzePosition(int x, int y){
        this.loeschen();
        xwert;
        ywert;
        this.zeichneLampe(xwert, ywert, zwert);
    }*/
}