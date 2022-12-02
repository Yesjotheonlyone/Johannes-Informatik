package de.johannesbillion;

import basis.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EigenesMalprogramm {
    Fenster f = new Fenster();
    Tastatur tastatur = new Tastatur();
    IgelStift s = new IgelStift();

    public MausLauscherStandard mausLauscher;
    public TastenLauscher tastenLauscher;

    public EigenesMalprogramm() {
        //GUI-starten
        this.addGUI();
        this.addTastaturListener();

    }

    //Methode zum Hinzufügen des MausLauschers zum Fenster
    public void addTastaturListener() {
        tastenLauscher = this.getTastenLauscher();
        f.setzeTastenLauscher(tastenLauscher);
    }

    public void addMouseListener() {
        mausLauscher = this.getMouseListener();
        f.setzeMausLauscherStandard(mausLauscher);
    }

    public TastenLauscher getTastenLauscher() {
        return new TastenLauscher() {
            @Override
            public void bearbeiteTaste(Komponente komponente, char c) {
                switch (c) {
                    case 's':
                        s.setzeFarbe(Farbe.SCHWARZ);
                        break;
                    case 'g':
                        s.setzeFarbe(Farbe.GRUEN);
                        break;
                    case 'o':
                    s.setzeFarbe(Farbe.ORANGE);
                        break;
                    case 'r':
                        s.setzeFarbe(Farbe.ROT);
                    default:
                }
            }
        };
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
        jFrame.getContentPane().add();

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


    //Setze String Array
    String[] figuren = {"Kreis", "Haus", "Baum"};

    public figurenAuswahl(){

        JComboBox<String> colorBox = new JComboBox<>(figuren);

        ActionListener figurenListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (colorBox.getSelectedItem().equals("Kreis")){
                    s.zeichneKreis();
            }
        }

        }

        //Initialisierung Elemente

    //TODO: Farbauswahl
    // - String Array mit verschiedenen Farben (z.B String[] colors = {"Blau", "Grün", "Rot"})
    // - JComboBox mit den Farben (z.B JComboBox<String> colorBox = new JComboBox<>(colors))
    // - JComboBox mit ActionListener und IF-Abfragen (z.B if(colorBox.getSelectedItem().equals("Blau")) {s.setzeFarbe("Blau");})
    // - JComboBox in GUI einfügen (z.B jFrame.getContentPane().add(colorBox))

}
