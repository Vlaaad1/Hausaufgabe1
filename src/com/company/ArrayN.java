package com.company;

class ArrayN{
    private int zahlen[]; //un obiect
    public ArrayN(int z[]){
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
