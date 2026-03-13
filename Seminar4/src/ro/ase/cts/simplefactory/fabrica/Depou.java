package ro.ase.cts.simplefactory.fabrica;

import ro.ase.cts.simplefactory.clase.Autobuz;
import ro.ase.cts.simplefactory.clase.MijlocTransport;
import ro.ase.cts.simplefactory.clase.Tramvai;
import ro.ase.cts.simplefactory.clase.Troleibuz;

public class Depou {

    public MijlocTransport getMijlocTransport(Tipuri tip, int numarRoti, String numarInmatriculare){
        if(tip == Tipuri.AUTOBUZ)
            return new Autobuz(numarRoti, numarInmatriculare);
        if(tip == Tipuri.TRAMVAI)
            return new Tramvai(numarRoti, numarInmatriculare);
        if (tip == Tipuri.TROLEIBUZ)
            return new Troleibuz(numarRoti, numarInmatriculare);
        return null;
    }
}
