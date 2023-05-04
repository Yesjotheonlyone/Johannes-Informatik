package de.johannesbillion.Lampe;

import basis.*;

import java.awt.*;


public class Lampe {

    private Stift s1 = new Stift();
    int xwert, ywert, zradius;

    public void zeichneLampe(int x, int y, int z){
        xwert=x;
        ywert=y;
        zradius=z;
            s1.normal();
        s1.setzeFuellMuster(Muster.GEFUELLT);
        s1.setzeFarbe(Color.YELLOW);
        s1.kreis(xwert, ywert, zradius);
    }
    public void loeschen(){
        s1.setzeFuellMuster(Muster.GEFUELLT);
        s1.radiere();
        s1.kreis(xwert, ywert, zradius+1);
    }
    /*public void setzePosition(int x, int y){
        this.loeschen();
        xwert;
        ywert;
        this.zeichneLampe(xwert, ywert, zwert);
    }*/
}