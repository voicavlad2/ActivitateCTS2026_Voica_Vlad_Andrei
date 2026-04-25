package src.acs.ase.ro.main;

import src.acs.ase.ro.builder.Internare;
import src.acs.ase.ro.builder.InternareBuilder;
import src.acs.ase.ro.builder.InternareBuilderAlternativ;

public class Main {
    public static void main(String[] args){
        Internare internare1 = new Internare(false,false,false,false,"Mihai Popescu");
        Internare internare2 = new Internare(true,true,false,true,"Dumitru Iolea");

        InternareBuilder builder = new InternareBuilder("Florentin Petre");
        Internare internare3 = builder.build();
        Internare internare4 = builder.setNume("Ionel Ridiche").setPat(false).setHalat(true).setMicDejun(true).setPapuci(true).build();

        InternareBuilderAlternativ builderAlternativ = new InternareBuilderAlternativ("Florian");
        builderAlternativ.setMicDejun(true);
        Internare upu101 =  builderAlternativ.build().setNumePacient("Bobix");
        Internare upu102 =  builderAlternativ.build().setNumePacient("Hamdulila");

        System.out.println(upu101);
        System.out.println(upu102);


    }
}
