package composite.clase;

public interface DepartamentAbstarct {
    void afiseazaDetalii();
    void adaugaNod(DepartamentAbstarct nod);
    void stergeNod(DepartamentAbstarct nod);
    DepartamentAbstarct getNodCopil(int index);
}
