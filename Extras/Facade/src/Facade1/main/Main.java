package Facade1.main;

import Facade1.clase.Facade;
import Facade1.clase.Pacient;

public class Main {

    public static void main(String[] args) {
        Pacient pacientUPU = new Pacient("Florian");

        Facade interfataInternare = new Facade();

        interfataInternare.efectueazaInternareRapida(pacientUPU.getNume());

    }
}
