package de.johannesbillion;

import basis.*;
import javax.swing.*;
import java.util.Arrays;


public class bubblesort {
    public Fenster window;
    public int[] numbers = new int[100];

    public void sortingArray() {
        for (int i = 0; i < 100; i++) {
            numbers[i] = Hilfe.zufall(0, 100);
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog(i));
        }
    }
}