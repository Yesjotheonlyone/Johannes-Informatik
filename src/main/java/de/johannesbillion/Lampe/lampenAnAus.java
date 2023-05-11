package de.johannesbillion.Lampe;

import basis.*;

public class lampenAnAus {
    public static void main(String[] args) {
        new lampenAnAus();
    }
    Fenster fenster = new Fenster();
    Lampe lampe[][] = new Lampe[10][10];

    public lampenAnAus(){
        for (int x = 0; x < 10; x++) {  //Reihe
            for (int y = 0; y < 10; y++) {  //Anzahl an Kreisen in Reihe
                lampe[x][y] = new Lampe(x * 50 + 30,y * 60 + 30);
            }
        }
    }


}
