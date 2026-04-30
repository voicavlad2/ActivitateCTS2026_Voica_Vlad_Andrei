package composite.main;

import composite.clase.Departament;
import composite.clase.Sectie;
import composite.clase.Structura;

public class Main {
    public static void main(String[] args) {
        System.out.println("DA");

        Structura spital = new Departament("spital");
        Structura departamentAdministrativ = new Departament("Administrativ");

        Structura secretariat = new Sectie("Secretariat", 20);
        Structura management = new Sectie("Management", 50);

        ((Departament)spital).adaugaStructura(departamentAdministrativ);
        ((Departament)spital).adaugaStructura(management);

        ((Departament)departamentAdministrativ).adaugaStructura(secretariat);
        spital.printeazaDetaliiStructura("");

        ((Departament)spital).stergeStructura(management);
        ((Departament)departamentAdministrativ).adaugaStructura(management);

        spital.printeazaDetaliiStructura("");
    }
}
