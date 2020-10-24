package com.company;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class Aufgabe1 {
    private ArrayList<Integer> note = new ArrayList<Integer>();


    public ArrayList<Integer> getNote() {
        return note;
    }

    public void add(int note) {
        this.note.add(note);
    }

    public ArrayList<Integer> nicht_ausreichend() {     // ergibt alle Noten die nicht ausreichend sind( <40)
        ArrayList<Integer> note_mici = new ArrayList<Integer>();
        for(Integer element:note){
            if(element<40){
                note_mici.add(element);
            }
        }
        return note_mici;
    }

    public double durchschnitt(){       // liefert den Durchschnittswert
        double suma=0;
        for(Integer element:note){
            suma += element;
        }
        return suma/note.size();
    }

    public ArrayList<Integer> abgerundet(){     // rundet diejenigen Noten, bei welchen der Fall ist
        ArrayList<Integer> rotunjit = new ArrayList<Integer>();
        for(Integer element:note){
            if(element<38){
                rotunjit.add(element);
            }else
                if(element%10 >=3 && element%10 <5 ){
                    while(element%10 !=5){
                        element++;
                    }
                rotunjit.add(element);
                }
                else
                    if(element%10 >=8 ){
                        while(element%10 !=0){
                            element++;
                        }
                        rotunjit.add(element);
                    }
                    else
                        rotunjit.add(element);
        }
        return rotunjit;
    }

    public int maximale_Note() {    // liefert die maximale Note, die abgerundet wurde
        ArrayList<Integer> rotunjit = new ArrayList<Integer>();
        rotunjit = abgerundet();
        int max = 0;
        for (Integer element : rotunjit) {
            if (max < element)
                max = element;
        }
        return max;
    }
}
