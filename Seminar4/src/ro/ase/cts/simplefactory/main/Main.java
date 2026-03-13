package ro.ase.cts.simplefactory.main;

import ro.ase.cts.simplefactory.clase.Autobuz;
import ro.ase.cts.simplefactory.clase.MijlocTransport;
import ro.ase.cts.simplefactory.fabrica.Depou;
import ro.ase.cts.simplefactory.fabrica.Tipuri;

public class Main {

    public static void main(String[] args){
        Depou depou = new Depou();
        MijlocTransport autobuz = depou.getMijlocTransport(Tipuri.AUTOBUZ,4,"B1wff@g" );
        MijlocTransport tramvai = depou.getMijlocTransport(Tipuri.TRAMVAI,24, "Bteg@1g" );

    }
}
