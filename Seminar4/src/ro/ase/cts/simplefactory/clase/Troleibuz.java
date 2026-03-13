package ro.ase.cts.simplefactory.clase;

public class Troleibuz extends MijlocTransport{

    public Troleibuz(int numarRoti, String numarInmatriculare) {
        super(numarRoti, numarInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Troleibuzix");
    }
}
