package Strategy1.clase;

public class FacturaPacient {
    private ModPlata plata;
    private String numePacient;
    private double suma;

    public FacturaPacient(String numePacient, double suma) {
        this.numePacient = numePacient;
        this.suma = suma;
    }

    public void setModPlata(ModPlata plata){
        this.plata = plata;
    }

    public void efectueazaPlata(){
        if(plata == null){
            System.out.println("Eroare: nu a fost selectata metoda platii");
        }else{
            plata.plateste(suma);
        }
    }
}
