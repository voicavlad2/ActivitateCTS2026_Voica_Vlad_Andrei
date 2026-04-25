package adapter.medicamentSpital;

public class Medicament {
    private String nume;
    private double pret;

    public Medicament(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public double getPret() {
        return pret;
    }

    public void achizitioneazaMedicament() {
        if (prezintaReteta()) {
            System.out.println("Medicament achizitionat din spital: " + nume);
        } else {
            System.out.println("Este nevoie de reteta pentru: " + nume);
        }
    }

    private boolean prezintaReteta() {
        return nume.startsWith("KA");
    }
}