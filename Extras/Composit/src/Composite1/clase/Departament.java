package Composite1.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements ElementSpital{

    private String numeDepartament;
    private List<ElementSpital> elementeSpital = new ArrayList<>();

    public Departament(String numeDepartament) {
        this.numeDepartament = numeDepartament;
    }

    public void adaugaElement(ElementSpital element) {
        elementeSpital.add(element);
    }

    @Override
    public void afiseazaDetalii(String identare) {
        System.out.println(identare + "Departament: " + numeDepartament);
        for (ElementSpital el : elementeSpital){
            el.afiseazaDetalii(identare + " ");
        }
    }
}
