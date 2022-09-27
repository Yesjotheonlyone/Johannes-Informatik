package de.johannesbillion;

import basis.*;

public class EigenesMalprogramm {
    Fenster f = new Fenster();
    Knopf kEnde = new Knopf("Ende", 350, 270, 40, 25);
    Maus m;
    IgelStift s = new IgelStift();
    public void stiftFolgtMaus(){
        /*Arbeiten, Aktionteil */
        s.bewegeBis(m.hPosition(),m.vPosition());
        s.runter();
        while (! m.istGedrueckt()){
            Hilfe.kurzePause();
        }
    }
    public void radieren(){
        f.setzeMausLauscherStandard(new MausLauscherStandard() {
            @Override
            public void bearbeiteMausDruck(Object o, int i, int i1) {
                s.radiere();
                s.setzeLinienBreite(50);
            }

            @Override
            public void bearbeiteMausDruckRechts(Object o, int i, int i1) {

            }

            @Override
            public void bearbeiteMausLos(Object o, int i, int i1) {
                s.hoch();
            }

            @Override
            public void bearbeiteMausLosRechts(Object o, int i, int i1) {

            }

            @Override
            public void bearbeiteMausBewegt(Object o, int i, int i1) {
                s.bewegeBis(i, i1);
            }

            @Override
            public void bearbeiteMausGezogen(Object o, int i, int i1) {

            }
        });
    }
    public void zeichne(){
        f.setzeMausLauscherStandard(new MausLauscherStandard() {
            @Override
            public void bearbeiteMausDruck(Object o, int i, int i1) {
                s.runter();
            }

            @Override
            public void bearbeiteMausDruckRechts(Object o, int i, int i1) {

            }

            @Override
            public void bearbeiteMausLos(Object o, int i, int i1) {
                s.hoch();
            }

            @Override
            public void bearbeiteMausLosRechts(Object o, int i, int i1) {

            }

            @Override
            public void bearbeiteMausBewegt(Object o, int i, int i1) {
                s.bewegeBis(i, i1);
            }

            @Override
            public void bearbeiteMausGezogen(Object o, int i, int i1) {

            }
        });
    }
}
