package Composite1.clase;

public class Sectie implements ElementSpital{
    private String numeSectie;

    public Sectie(String numeSectie){
        this.numeSectie = numeSectie;
    }

    @Override
    public void afiseazaDetalii(String identare) {
        System.out.println(identare + "Numele sectiei este " + numeSectie);
    }
}
