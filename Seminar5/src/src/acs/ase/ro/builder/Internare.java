package src.acs.ase.ro.builder;

public class Internare {
    protected boolean patRabatabil;
    protected boolean micDejun;
    protected boolean halat;
    protected boolean papuci;
    protected String numePacient;

    public Internare(boolean patRabatabil, boolean micDejun, boolean halat, boolean papuci, String numePacient) {
        this.patRabatabil = patRabatabil;
        this.micDejun = micDejun;
        this.halat = halat;
        this.papuci = papuci;
        this.numePacient = numePacient;
    }

    public void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    public void setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
    }

    public void setHalat(boolean halat) {
        this.halat = halat;
    }

    public void setPapuci(boolean papuci) {
        this.papuci = papuci;
    }

    public Internare setNumePacient(String numePacient) {
        this.numePacient = numePacient;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare{");
        sb.append("patRabatabil=").append(patRabatabil);
        sb.append(", micDejun=").append(micDejun);
        sb.append(", halat=").append(halat);
        sb.append(", papuci=").append(papuci);
        sb.append(", numePacient='").append(numePacient).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
