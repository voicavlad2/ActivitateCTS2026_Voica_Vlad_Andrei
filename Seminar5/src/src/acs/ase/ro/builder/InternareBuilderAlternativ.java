package src.acs.ase.ro.builder;

public class InternareBuilderAlternativ implements InternareBuilderAbstract{
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean halat;
    private boolean papuci;
    private String numePacient;

    public InternareBuilderAlternativ(String numePacient) {
        this.numePacient = numePacient;
    }

    public InternareBuilderAlternativ setPatRabatabil(boolean pat){
        this.patRabatabil = patRabatabil;
        return this;
    }

    public InternareBuilderAlternativ setHalat(boolean Halat){
        this.halat = Halat;
        return this;
    }

    public InternareBuilderAlternativ setPapuci(boolean papuci){
        this.papuci = papuci;
        return this;
    }

    public InternareBuilderAlternativ setMicDejun(boolean mic) {
        this.micDejun = mic;
        return this;
    }

    public InternareBuilderAlternativ setNume(String nume){
        this.numePacient = nume;
        return this;
    }

    @Override
    public Internare build(){
        Internare internare = new Internare(this.patRabatabil, this.micDejun,this.halat,this.papuci,this.numePacient);
        return internare;
    }


}
