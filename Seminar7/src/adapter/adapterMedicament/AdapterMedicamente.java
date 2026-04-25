package adapter.adapterMedicament;

import adapter.medicamentFarmacie.Medicament;

public class AdapterMedicamente extends Medicament {

    private adapter.medicamentSpital.Medicament medicamentSpital;

    public AdapterMedicamente(adapter.medicamentSpital.Medicament medicamentSpital) {
        super(medicamentSpital.getNume());
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}