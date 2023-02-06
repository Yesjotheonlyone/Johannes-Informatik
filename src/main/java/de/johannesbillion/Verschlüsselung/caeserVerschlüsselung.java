package de.johannesbillion.Verschlüsselung;

import basis.*;
class verschluessung
{
    //private Fenster f;
    //private TextFeld t;
    private int aktuellePosition,neuePosition,verschiebung;
    //private char[]alphabet1;
    //private char[]text;
    private char aktuelleBuchstabe,neueBuchstabe;
    private String texteingabe;
    private String alphabet;
    private String neu1;
    public verschluessung(){
    //f = new Fenster(200,200);
    //t = new TextFeld(50,50,100,100);
        texteingabe = "Pflanze";
        verschiebung = 3;
        alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ÄÖÜäöü.,-;abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ÄÖÜäöü.,-;";
        aktuellePosition = 0;
        neu1="";
        neuePosition = 0;
    }public void verschluesseln(){
    for(int i=0; i<texteingabe.length(); i++){
        aktuelleBuchstabe = texteingabe.charAt(i);
        System.out.println("Aktueller Buchstabe: "+aktuelleBuchstabe);
        aktuellePosition = alphabet.indexOf(aktuelleBuchstabe);
        System.out.println("Aktuelle Position: "+aktuellePosition);neuePosition = aktuellePosition + verschiebung;
        System.out.println("Verschiebung: "+verschiebung);
        System.out.println("Neue Position: "+neuePosition);
        neueBuchstabe = alphabet.charAt(neuePosition);
        System.out.println("Neuer Buchstabe: "+neueBuchstabe);
        neu1= neu1+neueBuchstabe;
        System.out.println("Verschlüsselt: "+neu1);
    }
}
}

