package com.company;

import java.math.BigInteger;

public class Aufgabe3 {
    int[] zahl1 = new int[]{1,2,3,4,5,6,7,8}; // erste Zahl als Array
    int[] zahl2 = new int[]{1,2,3,4,5,6,7}; // zweite Zahl als Array
    BigInteger big_zahl1= BigInteger.valueOf(0); // erste Zahl als BigInteger umgeschrieben
    BigInteger big_zahl2= BigInteger.valueOf(0); // zweite Zahl als BigInteger umgescrhieben

    public BigInteger summe(){

        for(int i:zahl1){       // wandelt den Array der ersten Zahl in einem BigInteger um
            big_zahl1 = big_zahl1.multiply(BigInteger.valueOf(10));
            big_zahl1 = big_zahl1.add(BigInteger.valueOf(i));
        }

        for(int i:zahl2){       // wandelt den Array der zweiten Zahl in einem BigInteger um
            big_zahl2 = big_zahl2.multiply(BigInteger.valueOf(10));
            big_zahl2 = big_zahl2.add(BigInteger.valueOf(i));

        }
        return big_zahl1.add(big_zahl2);    // addiert die zwei Zahlen
    }

    public BigInteger differenz(){
        for(int i:zahl1){        // wandelt den Array der ersten Zahl in einem BigInteger um
            big_zahl1 = big_zahl1.multiply(BigInteger.valueOf(10));
            big_zahl1= big_zahl1.add(BigInteger.valueOf(i));
        }
        for(int i:zahl2){        // wandelt den Array der zweiten Zahl in einem BigInteger um
            big_zahl2 = big_zahl2.multiply(BigInteger.valueOf(10));
            big_zahl2 = big_zahl2.add(BigInteger.valueOf(i));
        }
        return big_zahl1.subtract(big_zahl2);   // subtrachiert die zwei Zahlen
    }

    public BigInteger multiplikation(int i){
        BigInteger rezultat = big_zahl1.multiply(BigInteger.valueOf(i));   
        return rezultat;   // multipliziert die erste Zahl mit einer Ziffer
    }

    public BigInteger division(int i){
        BigInteger rezultat = big_zahl1.divide(BigInteger.valueOf(i));
        return rezultat;     // teilt die erste Zahl durch eine Ziffer
    }
}