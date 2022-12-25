package de.johannesbillion;

import basis.*;
import javax.swing.*;
import java.util.Arrays;

public class array {
    public Fenster fenster;
    public String[] tiere;
    public BeschriftungsFeld b1, b2;
    public Knopf ok;
    int[] intArr = new int[100];

    public ZahlenFeld eingabeAnzahl;

    public array(){
        fenster = new Fenster("Arrays", 500, 500);
        b1 = new BeschriftungsFeld("", 100, 100, 300, 20);
        b2 = new BeschriftungsFeld("Wie viel Tiere möchten Sie eingeben?", 100, 250, 300, 20);

        eingabeAnzahl = new ZahlenFeld(100, 300, 100, 20);
        //eingabeTiere.setzeTextFeldLauscher();

        ok = new Knopf("OK", 100, 350, 70, 30);
        //ok.setzeKnopfLauscher(knopf -> eingabeTiere());


    }
    public void sortingArray(){
        for (int i = 0; i < 100; i++) {
            intArr[i] = Hilfe.zufall(0,100);
            intArr[i] = Integer.parseInt(JOptionPane.showInputDialog(i));
        }
        System.out.println(intArr);
        //this.bubblesort();
    }
    public void swap(int i, int i1){
        int temp = intArr[i];
        intArr[i] = intArr[i1];
        intArr[i1] = temp;
    }
    public void bubblesort(){
        for (int i = intArr.length; i >1 ; --i) {
            for (int j = 0; j < i-1; j++) {
                if (intArr[i]>intArr [+ 1]){
                    swap(j, j+1);
                }
            }
        }
    }
    public void ausfuehren(){
        tiere = new String[3];

        tiere[0] = "Ameise";
        tiere[1] = "Hund";
        tiere[2] = "Gecko";
        System.out.println(tiere[0] + ", " + tiere[1] + ", " + tiere[2]);
        b1.setzeText(tiere[0] + ", " + tiere[1] + ", " + tiere[2]);
    }

    public void eingabeTiere(){

        tiere = new String[eingabeAnzahl.ganzZahl()];
        for (int i = 0; i < eingabeAnzahl.ganzZahl(); i++) {
            tiere[i] = JOptionPane.showInputDialog("Wähle Tier Nr." + (i + 1));
            b1.setzeText(Arrays.toString(tiere));
        }

        //b1.setzeText(tiere[0] + ", " + tiere[1] + ", " + tiere[2]);
    }
}
