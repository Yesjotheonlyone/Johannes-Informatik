package de.johannesbillion.arrayExercises;

import basis.*;

public class Sort {

    //Code um Klasse direkt hier ausführbar zu machen
    public static void main(String[] args) {
        Sort sort = new Sort();
    }

    //Variablen
    Fenster fenster;
    Stift pencil;
    int[] intArr = new int[100];

    public Sort() {
        //Anzeige Fenster
        fenster = new Fenster("Arrays", 500, 500);
        pencil = new Stift();

        //Initialisierung des Arrays in den Konstruktor verschoben
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Hilfe.zufall(0, 100);
        }

        //Methode zum Zeichen des Arrays
        this.drawArray();
        Hilfe.pause(50);


        //Starten der Sortiermethode
        this.bubblesort();

        //this.selectionSort
    }


    //Die Methode hast du aus dem Internet, oder?
    public void bubblesort() {

        for (int i = 0; i < intArr.length; i++) {
            //Bsp. die erste Zahl im Array ist 5

            //Vergleich der ersten Zahl im Array mit jeder anderen Zahl - Durchschieben der Zahl bis irgendwas größer ist
            for (int j = 0; j < intArr.length; j++) {

                //Vergleich zwischen Zahlen
                if (intArr[i] < intArr[j]) {
                    //Tausch wenn größer/kleiner
                    swap(i, j);
                }
            }

            this.drawArray();
            Hilfe.pause(100);
        }

    }

    public void selectionSort() {

        //For-I Schleife
        //-- Sortiermethoden-Dings

        //Immer am Ende der Schleife -> drawArray() & Hilfe.pause
    }

    public void swap(int i, int i1) {
        int temp = intArr[i];
        intArr[i] = intArr[i1];
        intArr[i1] = temp;
    }

    //Überlege dir hier einmal eine Methode, um das Array zeichnen zu lassen
    public void drawArray() {
        fenster.loescheAlles();
        for (int i = 0; i < intArr.length; i++) {
            pencil.bewegeBis(20 + i * 3, 200);
            pencil.runter();
            pencil.zeichneRechteck(2,intArr[i]);
            pencil.hoch();
        }
    }

}
