package com.company;

import java.util.ArrayList;
import java.util.List;

public class Uni {
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
