package com.company;
import java.util.ArrayList;

public class Aufgabe2 {
    ArrayList<Integer> zahlen = new ArrayList<Integer>();

    public void add(int zahl) {
        this.zahlen.add(zahl);
    }
    public int maximal(){   // liefert die maximale Zahl
        int max = Integer.MIN_VALUE;
        for(Integer element:zahlen) {
            if (max < element)
                max = element;
        }
        return max;
    }
    public int minimal(){   // liefert die minimale Zahl
        int min = Integer.MAX_VALUE;
        for(Integer element:zahlen) {
            if (min > element)
                min = element;
        }
        return min;
    }
    public int max_summe(){ // liefert die maximale n-1 Summe, also die Summe aller Zahlen minus die kleinste Zahl
        int min = this.minimal();
        int sum=0;
        for(Integer element:zahlen)
            sum+= element;
        return sum-min;
    }
    public int min_summe(){ // liefert die minimale n-1 Summe, also die Summe aller Zahlen minus die grosste Zahl
        int max = this.maximal();
        int sum=0;
        for(Integer element:zahlen)
            sum+= element;
        return sum-max;
    }
}
