package de.johannesbillion.arrayExercises;

import basis.*;

public class Sort {

    //Code um Klasse direkt hier ausführbar zu machen
    public static void main(String[] args) {
        new Sort();
    }

    //Variablen
    public Fenster fenster;
    public String[] tiere;
    public BeschriftungsFeld b1, b2;
    public Knopf ok;
    int[] intArr = new int[100];

    public ZahlenFeld eingabeAnzahl;

    public Sort(){
        //Anzeige Fenster
        fenster = new Fenster("Arrays", 500, 500);

        //Initialisierung des Arrays in den Konstruktor verschoben
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Hilfe.zufall(0,100);
            //Das ist quatsch, es sollen ja Zufallszahlen sein
            //intArr[i] = Integer.parseInt(JOptionPane.showInputDialog(i));
        }

        //Methode zum Zeichen des Arrays

        drawArray();

        //Starten der Sortiermethode
        this.bubblesort();
    }



    //Die Methode hast du aus dem Internet, oder?
    public void bubblesort(){
        for (int i = intArr.length; i >1 ; --i) {
            for (int j = 0; j < i-1; j++) {
                if (intArr[i]>intArr [+ 1]){
                    swap(j, j+1);
                }
            }
            //Zeichnen des Arrays nach jedem Durchlauf
        }
    }
    //Die Methode hast du aus dem Internet, oder?
    public void swap(int i, int i1){
        int temp = intArr[i];
        intArr[i] = intArr[i1];
        intArr[i1] = temp;
    }

    //Überlege dir hier einmal eine Methode, um das Array zeichnen zu lassen
    public void drawArray() {
        //Hier zeichnest du das Array
    }

}
