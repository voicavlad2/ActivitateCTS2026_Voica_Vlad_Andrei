package Facade1.clase;

public class Pacient {

    private String nume;

    public Pacient() {
    }

    public Pacient(String nume) {
        this.nume = nume;
    }

    public boolean areStareGrava(String numePacient){
        System.out.println("Se verifica starea pacientului: " + numePacient);
        return true;
    }

    public String getNume() {
        return nume;
    }
}
