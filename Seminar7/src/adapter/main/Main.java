package adapter.main;

import adapter.adapterMedicament.AdapterMedicamente;
import adapter.medicamentFarmacie.Medicament;

public class Main {
    public static void main(String[] args) {

        // farmacie
        Medicament medFarmacie = new Medicament("Nurofen");
        medFarmacie.cumparaMedicament();

        // spital
        adapter.medicamentSpital.Medicament medSpital =
                new adapter.medicamentSpital.Medicament("KA123", 30);

        // adapter
        Medicament medAdaptat = new AdapterMedicamente(medSpital);
        medAdaptat.cumparaMedicament();
    }
}