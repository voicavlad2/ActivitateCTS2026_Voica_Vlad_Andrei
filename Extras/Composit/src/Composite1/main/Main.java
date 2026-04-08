package Composite1.main;

import Composite1.clase.Departament;
import Composite1.clase.ElementSpital;
import Composite1.clase.Sectie;

public class Main {
    public static void main(String[] args) {
        ElementSpital cardiologie = new Sectie("Cardiologie");
        ElementSpital chirurgieGenerala = new Sectie("Chirurgie Generală");
        ElementSpital neurochirurgie = new Sectie("Neurochirurgie");

        Departament deptChirurgie = new Departament("Departament Chirurgie");
        Departament deptMedical = new Departament("Departament Medical General");
        Departament structuraSpital = new Departament("Spitalul Central");

        deptChirurgie.adaugaElement(chirurgieGenerala);
        deptChirurgie.adaugaElement(neurochirurgie);

        deptMedical.adaugaElement(cardiologie);
        deptMedical.adaugaElement(deptChirurgie);

        structuraSpital.adaugaElement(deptMedical);

        structuraSpital.afiseazaDetalii("");
    }
}
