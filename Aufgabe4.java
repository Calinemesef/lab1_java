package com.company;
import java.util.ArrayList;

public class Aufgabe4 {
    private ArrayList<Laufwerk> laufwerke = new ArrayList<Laufwerk>();  // liste von USB-Laufwerke
    private ArrayList<Tastatur> tastaturi = new ArrayList<Tastatur>();  // liste von Tastaturen
    private int buget;  // Geldbetrag von Markus

    public int getBuget() {
        return buget;
    }

    public void setBuget(int buget) {
        this.buget = buget;
    }

    public ArrayList<Laufwerk> getLaufwerke() {
        return laufwerke;
    }

    public ArrayList<Tastatur> getTastaturi() {
        return tastaturi;
    }

    public void add_laufwerk(Laufwerk l){
        laufwerke.add(l);
    }

    public void add_tastatur(Tastatur t){
        tastaturi.add(t);
    }

    public int billigste_tastatur(){        // liefert die billigste Tastatur
        int ieftinache=Integer.MAX_VALUE;
        for(Tastatur element: tastaturi){
            if(ieftinache>element.getPreis()) {
                ieftinache = element.getPreis();
            }
        }
    return ieftinache;
    }

    public int teuerste_gegenstand(){       // liefert den teuersten Gegenstand
        int cel_mai_scump = Integer.MIN_VALUE;
        for(Tastatur element: tastaturi){
            if(cel_mai_scump<element.getPreis()) {
                cel_mai_scump = element.getPreis();
            }
        }
        for(Laufwerk element:laufwerke){
            if(cel_mai_scump<element.getPreis()){
                cel_mai_scump = element.getPreis();
            }
        }
        return cel_mai_scump;
    }

    public int teuerste_laufwerk(){     // liefert den teuersten Laufwerk
        int scumpa=-1;
        for(Laufwerk element:laufwerke){
            if(element.getPreis() > scumpa && buget>= element.getPreis())
                scumpa = element.getPreis();
        }
        if(scumpa ==-1)
            System.out.println("Markus kann kein Laufwerk kaufen");
        return scumpa;
    }

    public int zwei_gegenstande() { // liefert die zwei USB+Tastatur, die sich Markus leisten kann
        int betrag = -1;
        int varianta = 0;
        ArrayList<Laufwerk> laufwerke_buget = new ArrayList<Laufwerk>();
        for (Laufwerk element : laufwerke)
            if (element.getPreis() < this.buget) {
                laufwerke_buget.add(element);
            }
        ArrayList<Tastatur> tastaturi_buget = new ArrayList<Tastatur>();
        for(Tastatur element: tastaturi)
            if(element.getPreis() < this.buget){
                tastaturi_buget.add(element);
            }
        for (Laufwerk usb : laufwerke){
            for(Tastatur taste: tastaturi){
                if(usb.getPreis()+taste.getPreis() <buget){
                    varianta = usb.getPreis()+taste.getPreis();
                    if(varianta>betrag){
                        betrag = varianta;
                    }
                }
            }
        }
        return betrag;
    }
}
