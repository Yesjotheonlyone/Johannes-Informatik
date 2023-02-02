package de.johannesbillion.Verschlüsselung;

import de.johannesbillion.arrayExercises.Array;
import basis.*;

public class caeserVerschlüsselung {
    public static void main(String[] args) {
        new Array();
    }


    public class caeser_einfach implements KnopfLauscher
    {
        private Fenster fenster;
        private BeschriftungsFeld ueberSchriftEing, ueberSchriftAusg;
        private TextFeld eingabeFeld, ausgabeFeld;
        private Knopf code, decode;
        private String eingabe, ausgabe,abc,codierterText,decodierterText;
        private char aktuellerBuchstabe,neuerBuchstabe;
        private int key,positionImAlphabet,neuePositionImAlphabet;
        public caeser_einfach()
        {
            fenster = new Fenster(500,150);

            ueberSchriftEing = new BeschriftungsFeld("Hier den Text eingeben",10,10,200,10);
            eingabeFeld = new TextFeld(10,30,200,20);

            ueberSchriftAusg = new BeschriftungsFeld("Hier steht der verschlüsselte Text",220,10,300,10);
            ausgabeFeld = new TextFeld(220,30,200,20);

            code= new Knopf("Verschlüsseln",10,60,150,20);
            code.setzeKnopfLauscher(this);

            decode = new Knopf("Entschlüsseln",220,60,150,20);
            decode.setzeKnopfLauscher(this);
            this.main();

            abc="abcdefghijklmnopqrstuvwxyz";
            key=3;
            codierterText="";
            decodierterText="";

        }

        public void main()
        {

        }

        public void verschluesseln()
        {

        }
        public void entschluesseln()
        {

        }

        @Override
        public void bearbeiteKnopfDruck(Knopf k){

            }
        }

    }
}
