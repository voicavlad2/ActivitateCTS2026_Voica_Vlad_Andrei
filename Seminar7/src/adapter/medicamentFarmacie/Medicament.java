package adapter.medicamentFarmacie;

public class Medicament {
    protected String nume;

    public Medicament(String nume) {
        this.nume = nume;
    }

    public void cumparaMedicament() {
        System.out.println("Medicament cumparat din farmacie: " + nume);
    }

    @Override
    public String toString() {
        return "Medicament{" +
                "nume='" + nume + '\'' +
                '}';
    }
}