package ro.ase.cts.singleton;

public class Hotel {
    private String numeHotel;
    private int numarCamere;
    private int numarCamereOcupate;

    private static Hotel instance = null;

    private Hotel(String numeHotel, int numarCamere, int numarCamereOcupate) {
        this.numeHotel = numeHotel;
        this.numarCamere = numarCamere;
        this.numarCamereOcupate = numarCamereOcupate;
    }

    public static Hotel getInstance(String numeHotel, int numarCamere, int numarCamereOcupate){
        if(instance == null)
            instance = new Hotel(numeHotel,numarCamere,numarCamereOcupate);
        return instance;
    }

    public void rezervaCamera(){
        if(this.numarCamereOcupate < this.numarCamere) {
            System.out.println("Se primi!");
            this.numarCamereOcupate ++;
        }else
            System.out.println("Fara camere");
    }

    public void afiseazaDetaliiHotel(){
        StringBuilder mesaj = new StringBuilder();
        mesaj.append("Nume: ");
        System.out.println(mesaj);
    }
}
