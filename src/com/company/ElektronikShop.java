package com.company;


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
