package Prototype.clase;

public class Rezervare implements RezervareAbstracta {
    public String numeClient;
    public int oraRezervare;
    private int ziuaRezervarii;
    private String numarTelefon;

    public Rezervare(String numeClient, int oraRezervare, int ziuaRezervarii, String numarTelefon) {
        if(numeClient.length()>1){
            this.numeClient = numeClient;
        }
        else
        {
            this.numeClient = "Ion";
        }
        if(oraRezervare > 23 && oraRezervare < 9){
            this.oraRezervare = oraRezervare;
        }
        else
        {
            this.oraRezervare = 9;
        }
        if(ziuaRezervarii > 30){
            this.ziuaRezervarii = ziuaRezervarii;
        }
        else
        {
            this.ziuaRezervarii = 1;
        }
        if(numarTelefon.length() == 10){
            this.numarTelefon = numarTelefon;
        }
        else
        {
            this.numarTelefon= "000000000";
        }

    }

    private Rezervare() {
    }

    @Override
    public RezervareAbstracta clone(){
        Rezervare rezervareNoua = new Rezervare();
        rezervareNoua.numeClient = this.numeClient;
        rezervareNoua.ziuaRezervarii = this.ziuaRezervarii;
        rezervareNoua.oraRezervare = this.oraRezervare;
        rezervareNoua.numarTelefon = this.numarTelefon;

        return rezervareNoua;
    }

}
