package ro.ase.cts.simplefactory.clase;

public class Autobuz extends MijlocTransport {

    public Autobuz(int numarRoti, String numarInmatriculare) {
        super(numarRoti,numarInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Autobuzix");
    }


}
