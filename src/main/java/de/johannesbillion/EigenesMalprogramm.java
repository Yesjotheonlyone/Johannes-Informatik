package de.johannesbillion;

import basis.Fenster;
import basis.IgelStift;
import basis.Maus;
import basis.MausLauscherStandard;

import javax.swing.*;
import java.awt.*;

public class EigenesMalprogramm {
    Fenster f = new Fenster();
    Maus m;
    IgelStift s = new IgelStift();

    private MausLauscherStandard mausLauscher;

    //Konstruktor
    public EigenesMalprogramm() {
        //GUI-starten
        this.addGUI();
    }

    //Methode zum Hinzufügen des MausLauschers zum Fenster
    public void addMouseListener() {
        mausLauscher = this.getMouseListener();
        f.setzeMausLauscherStandard(mausLauscher);
    }

    //Funktion zum Erzeugen des allgemeinen Maus-Listeners
    private MausLauscherStandard getMouseListener() {
        return new MausLauscherStandard() {
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
        };
    }

    //Funktion zum Erzeugen der GUI
    public void addGUI() {
        //Fenster mit Attributen
        JFrame jFrame = new JFrame("Bedienungsfenster");
        jFrame.setSize(200, 200);

        //Löschen-Knopf
        JButton allesLoeschen = new JButton("Alles Löschen");
        allesLoeschen.addActionListener(e -> f.loescheAlles());
        jFrame.getContentPane().add(allesLoeschen);

        //Toggle-Knopf
        JToggleButton zeichenToggle = new JToggleButton("Zeichenmodus ein");
        zeichenToggle.addActionListener(e -> {
            //Wenn der Knopf ausgewählt ist, wird zwischen Zeichenmodus und Radiermodus gewechselt
            if (zeichenToggle.isSelected()) {
                //Füge Mauslistener hinzu
                this.addMouseListener();
                //Setze Stiftattribute
                s.normal();
                s.setzeLinienBreite(5);
                //Ändere Knopftext
                zeichenToggle.setText("Radierermodus ein");
            } else if (!zeichenToggle.isSelected()) {
                //Setze Stiftattribute
                s.radiere();
                s.setzeLinienBreite(50);
                //Ändere Knopftext
                zeichenToggle.setText("Zeichenmodus ein");
            }
        });
        jFrame.getContentPane().add(zeichenToggle);

        //Layout
        jFrame.setLayout(new FlowLayout());
        //Bildschirmposition
        jFrame.setLocationRelativeTo(null);
        //Sichtbarkeit
        jFrame.setVisible(true);
    }
}
