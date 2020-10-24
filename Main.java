package com.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
//	 write your code here
        Aufgabe1 note = new Aufgabe1();
        note.add(30);note.add(33);note.add(40);note.add(50);note.add(60);note.add(78);note.add(83);note.add(97);note.add(100);

        System.out.println("Aufgabe 1");
        System.out.println("Noten die nicht ausreichend sind: "+note.nicht_ausreichend());
        System.out.println("Durchschnitt aller Noten: "+note.durchschnitt());
        System.out.println("Noten nach der Abrundung: "+note.abgerundet());
        System.out.println("Maximale note nach der Abrundung: "+note.maximale_Note());
        System.out.println("\n\n");

        System.out.println("Aufgabe 2");
        Aufgabe2 zahlen = new Aufgabe2();
        zahlen.add(5);zahlen.add(7);zahlen.add(11);zahlen.add(20);zahlen.add(30);zahlen.add(45);
        System.out.println("Kleinste Zahl ist: "+zahlen.minimal());
        System.out.println("Grosste Zahl ist: "+zahlen.maximal());
        System.out.println("Maximale n-1 Summe ist: "+zahlen.max_summe());
        System.out.println("Minimale n-1 Summe ist: "+zahlen.min_summe());
        System.out.println("\n\n");


        System.out.println("Aufgabe 3");
        System.out.println("Die zwei Zahlen sind 12345678 und 123567");
        Aufgabe3 ex = new Aufgabe3();
        Aufgabe3 exx = new Aufgabe3(); // ca sa ia aceleasi numere, inainte de suma
        System.out.println("Summe der zwei Zahlen ist: "+ex.summe());
        System.out.println("Differenz der zwei Zahlen ist: "+exx.differenz());
        System.out.println("\n\n");


        System.out.println("Aufgabe 4");
        Laufwerk l1 = new Laufwerk(15);
        Laufwerk l2 = new Laufwerk(25);
        Laufwerk l3 = new Laufwerk(35);
        Tastatur t1 = new Tastatur(30);
        Tastatur t2 = new Tastatur(40);
        Tastatur t3 = new Tastatur(60);

        Aufgabe4 markus = new Aufgabe4();
        markus.setBuget(80);
        markus.add_laufwerk(l1);
        markus.add_laufwerk(l2);
        markus.add_laufwerk(l3);
        markus.add_tastatur(t1);
        markus.add_tastatur(t2);
        markus.add_tastatur(t3);

        System.out.println("Billigste Tastatur: "+markus.billigste_tastatur());
        System.out.println("Teuerster Gegenstand: "+markus.teuerste_gegenstand());
        System.out.println("Teuerster Laufwerk: "+markus.teuerste_laufwerk());
        System.out.println("Summe der zwei Gegenstande die sich Markus leisten kann ist: "+markus.zwei_gegenstande());

    }
}
