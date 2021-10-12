package com.company;

import java.util.Arrays;

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

