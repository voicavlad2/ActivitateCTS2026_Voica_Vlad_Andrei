package Prototype.main;

import Prototype.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rez1 = new Rezervare("Gica", 20,2,"+402349014");
        Rezervare rez2 = rez1.clone();

        ((Rezervare)rez2).setOraRezervare(10);
        ((Rezervare)rez2).setOraRezervare(10);

        System.out.println(rez1.toString());
        System.out.println(rez2.toString());
    }
}
