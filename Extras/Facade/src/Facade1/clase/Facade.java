package Facade1.clase;

public class Facade {

    private Pacient pacient1;
    private Medic medic1;
    private Salon salon1;

    public Facade() {
        this.pacient1 = new Pacient();
        this.medic1 = new Medic();
        this.salon1 = new Salon();
    }

    public void efectueazaInternareRapida(String numePacient){
        boolean stare = pacient1.areStareGrava(numePacient);
        boolean internare = medic1.trebuieInternat(numePacient);
        boolean patLiber = salon1.existaPatDisponibil();

        if(stare && internare && patLiber){
            System.out.println("Internare reusita pentru " + numePacient);
        }else{
            System.out.println("Internare REFUZATA!");
        }

    }

}
