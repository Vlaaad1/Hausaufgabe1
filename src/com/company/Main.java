package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
      System.out.println("Aufgabe1:");
    UNI obj= new UNI();
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
    array_n obj2 = new array_n(new int[]{4,8,17,3,10});
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
    System.out.println(obj4.maximaleGeldbetrag(90));
    }
}

class UNI {
    public List<Integer> wenigerAlsa40(int[] noten){
        //man konvertirt zu List um die add Methode zu benutzen
    List result = new ArrayList<Integer>();
    for (int i=0; i< noten.length; i++)
        if (noten[i] < 40 && noten[i]>0)
            result.add(noten[i]);
    return result;
    }

    public double durchschnit(double[] noten){
        double sum=0,j=0;
        //erstens rechnet man die Summe dann teilt an der Lange des Arrays
        for (int i=0; i< noten.length; i++)
            if (noten[i] < 101 && noten[i]>0)
            {
                sum=sum+noten[i];
                j++;
            }
        double d=sum/j;
        return d;

    }
    public List<Integer> abrunden(int[] noten){
        List result = new ArrayList<Integer>();
        //Bedingungen: Note>38 und Differenz zwischen Note und dem nachsten Vielfachen von 5 weniger als 3
        for (int i=0; i< noten.length; i++) {
           if (noten[i]>38 && (5-noten[i]%5)<3)
               result.add(noten[i]+5-noten[i]%5);
           else
               result.add(noten[i]);
        }
        return result;

    }

    public int maximale(int[] noten) {
        List<Integer> result = new ArrayList<Integer>();
        // man benutzt result um alle abgerundete Noten zu kopieren
        for (int i=0; i< noten.length; i++) {
            if (noten[i]>38 && (5-noten[i]%5)<3)
                result.add(noten[i]+5-noten[i]%5);
        }
        // hier findet man die maximale Wert der abgerundeten Noten
        int max = result.get(0);
        for (int ii=0; ii<result.size();ii++)
            if (result.get(ii) > max)
                max = result.get(ii);
        return max;
    }
}
class array_n{
    private int zahlen[]; //un obiect
    public array_n(int z[]){
        zahlen=z;
    };
    //findet den maximalen Wert
    public int maximaleZahl(){
        int max=zahlen[0];
        for(int i=0;i<zahlen.length;i++){
            if(zahlen[i]>max)
                max=zahlen[i];
        }
        return max;
    }
    //findet den minimalen Wert
    public int minimaleZahl(){
        int min=zahlen[0];
        for(int i=0;i<zahlen.length;i++){
            if(zahlen[i]<min)
                min=zahlen[i];
        }
        return min;
    }
    //maximale Summe von n-1 Zahlen ist die allgemeine Summe - minimale Wert
    public int maximaleSumme(){
        int min=minimaleZahl();
        int sum=0;
        for(int i=0;i<zahlen.length;i++)
                sum=sum+zahlen[i];
        return sum-min;
    }
    //minimale Summe von n-1 Zahlen ist die allgemeine Summe - maximale Wert
    public int minimaleSumme(){
        int max=maximaleZahl();
        int sum=0;
        for(int i=0;i<zahlen.length;i++)
            sum=sum+zahlen[i];
        return sum-max;
    }
}

 class Operation{
    public static int[] summe(int a[],int b[]) {
        int n= a.length; //Lange der beiden Arrays
        int result[] = new int[n];
        int carry=0;
        int sum=0;
        int i=n-1;
        while (i>=0)
        {
            sum = a[i] + b[i] + carry;
            result[i] = sum%10; // man adiert nur ein Ziffer
            sum = sum/10;
            carry = sum%10;
            i--;
        }
        //Fall wenn carry ist nicht null
        if (carry > 0)
        {
            int[] result2 = new int[n + 1];
            for (int k=0; k<n; k++)
                result2[k+1] = result[k];
            result2[0] = carry;
            return result2;
        }
        else return result;
    }

    public int[] differenz(int a[],int b[]){
        int n=a.length;
        int[] result = new int[n];
        int[] aux1, aux2;
        // man verifiziert welche ist die kleinste Zahl
        if (Arrays.toString(a).compareTo(Arrays.toString(b)) > 0){
            aux1 = a;
            aux2= b;
        }
        else
        {
            aux1 = b;
            aux2 = a;
        }
        int i=n-1;
        int carry=0;
        int d;
        while ( i >= 0 ) {
            d = a[i] - b[i] - carry;
            if ( d < 0 ) {
                d = 10 + d;
                carry = 1;
            }
            else
                carry=0;
            result[i] = d % 10;
            i--;
        }
        //Fall wenn carry ist gleich mit 1
        if (carry == 1) {
            int[] result2 = new int[n-1];
            for (int j=n-1;j>0;j--)
                result2[j-1] = result2[j];
            return result2;
        }
        else return result;
    }

    public int[] mul(int a[],int x) {
        int[] nein = new int[1];
        nein[0]=-1;
        //x muss immer ein Ziffer sein
        if (x>9)
            return nein;
        int n = a.length;
        int[] result = new int[n];
        int i = n-1;
        int carry=0, m;
        while (i >= 0) {
            m = a[i] * x + carry;
            result[i] = m%10;
            carry = m/10;
            i--;
        }
        if (carry > 0){
            int[] result2 = new int[n-1];
            for (int k=0; k<n; k++)
                result2[k+1] = result[k];
            result2[0] = carry;
            return result2;
        }
        else return result;
    }

     public int[] div(int a[],int x) {
         int[] nein = new int[1];
         nein[0]=-1;
         //x muss immer ein Ziffer sein
         if (x>9)
             return nein;
         int n = a.length;
         int[] result = new int[n];
         int i = 0, d=0;
         while( i < n-1) {
             result[i] = (d*10+a[i])/x;
             d = a[i]%x;
             i++;
         }
         // Fall wenn die Lange verringert
         if (result[0] == 0){
             int[] result2 = new int[n-1];
             for (int k=n-1 ; k > 0; k--)
                 result2[k-1] = result[k];
             return result2;
         }
         else return result;
     }
}


class ElektronikShop {
    private int USB[]; //Array mit Preisen der USB
    private int Tastatur[]; //Array mit Preisen der Tastaturen
    //Konstruktor
    public ElektronikShop(int u[], int t[]){
        USB=u;
        Tastatur=t;
    };
    public int biligsteTastatur(){
        int min=Tastatur[0];
        for(int i=0;i<Tastatur.length;i++){
            if(Tastatur[i]<min)
                min=Tastatur[i];
        }
        return min;
    }

    public int teursteGegenstand(){
        int max1=Tastatur[0];
        int max2=USB[0];
        //versuchen maximale Werten von beiden Arrays
        for(int i=0;i<Tastatur.length;i++){
            if(Tastatur[i]>max1)
                max1=Tastatur[i];
        }
        for(int j=0;j<USB.length;j++){
            if(USB[j]>max2)
                max2=USB[j];
        }
        //finden maximale Wert
        if (max1>max2)
            return max1;
        else
            return max2;
    }

    public int teursteUSB(int buget){
        int aux[] = new int[USB.length];
        //finden alle USB deren Preis kleiner als budget ist
        for(int i=0;i<USB.length;i++){
            if(USB[i]<= buget)
                aux[i]=USB[i];
        }
        //finden maximale Wert
        int result=aux[0];
        for(int j=0;j<aux.length;j++){
            if(aux[j] > result )
                result=aux[j];
        }
        return result;
    }

    public int maximaleGeldbetrag(int buget){
        int n=USB.length;
        int m=Tastatur.length;
        int sum=0, k=0;
        int aux[] = new int[n+m];
        for (int i=0; i<n ; i++)
            for (int j=0; j<m; j++) {
                sum = USB[i] + Tastatur[j];
                if (sum <= buget) {  // der Gesamtpreis muss kleiner als budget sein
                    aux[k] = sum;
                    k++;

                }
            }
        if (k==0) //Fall wenn die Bedingung nicht erzielt ist
            return -1;
        int betrag = aux[0];
        for (int x=0; x<k; x++)
            if(betrag <= aux[x])
                betrag = aux[x];
        return betrag;
    }
}