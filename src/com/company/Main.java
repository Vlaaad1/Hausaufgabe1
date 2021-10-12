package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
      System.out.println("Aufgabe1:");
    Uni obj= new Uni();
    int[] N = new int[] {23, 16, 48, 91, 77, 20, 66, 89};
    double[] NN = new double[] {23, 16, 48, 91, 77, 20, 66, 89};
        System.out.println("Nicht ausreichende Note:");
    System.out.println(obj.wenigerAlsa40(N));
        System.out.println("Durchscnittswert:");
    System.out.println(obj.durchschnit(NN));
        System.out.println("Die abgerundete Noten:");
    System.out.println(obj.abrunden(N));
        System.out.println("Die maximale abgerundete Note:");
    System.out.println(obj.maximale(N));
        System.out.println();

        System.out.println("Aufgabe2:");
    ArrayN obj2 = new ArrayN(new int[]{4,3,8,17,3,10});
        System.out.println("Maximale Zahl:");
    System.out.println(obj2.maximaleZahl());
        System.out.println("Minimale Zahl:");
    System.out.println(obj2.minimaleZahl());
        System.out.println("Maximale Summe von n-1 Zahlen");
    System.out.println(obj2.maximaleSumme());
        System.out.println("Minimale Summe von n-1 Zahlen");
    System.out.println(obj2.minimaleSumme());
        System.out.println();

        System.out.println("Aufgabe3:");
    Operation obj3 = new Operation();
    int a[] = { 2, 3, 6, 0, 0, 0, 0};
    int b[] = { 8, 8, 0, 0, 0, 0, 0 };
    int c[] = { 2, 7, 6, 0, 0, 1, 0};
    int d[] = { 1, 0, 9, 1, 0, 5, 0 };
        System.out.println("Summe:");
    System.out.println(Arrays.toString(obj3.summe(a,b)));
    System.out.println(Arrays.toString(obj3.summe(c,d)));
        System.out.println("Differenz:");
    System.out.println(Arrays.toString(obj3.differenz(b,a)));
    System.out.println(Arrays.toString(obj3.differenz(b,c)));
        System.out.println("Multiplikation:");
    System.out.println(Arrays.toString(obj3.mul(a, 4)));
    System.out.println(Arrays.toString(obj3.mul(d, 8)));
        System.out.println("Division:");
    System.out.println(Arrays.toString((obj3.div(a,2))));
    System.out.println(Arrays.toString((obj3.div(c,6))));
        System.out.println();

        System.out.println("Aufgabe4:");
    int Usb[] = {80, 20, 15, 25};
    int Tast[] = {20 ,100, 60};
    ElektronikShop obj4 = new ElektronikShop(Usb, Tast);
        System.out.println("Die billigste Tastatur:");
    System.out.println(obj4.biligsteTastatur());
        System.out.println("Der teuerste Gegenstand");
    System.out.println(obj4.teursteGegenstand());
        System.out.println("Teurste USB Laufwerk, das man kaufen kann:");
    System.out.println(obj4.teursteUSB(30));
        System.out.println("Maximale Geldbetrag:");
    System.out.println(obj4.maximaleGeldbetrag(20));
    }
}





