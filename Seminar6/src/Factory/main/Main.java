package Factory.main;

import Factory.enums.TipDesert;
import Factory.enums.TipMancare;
import Factory.enums.TipSupa;
import Factory.fabrici.FabricaDesert;
import Factory.fabrici.FabricaSupa;

public class Main {
    public static void main(String[] args) {
        FabricaDesert fb = new FabricaDesert();
        FabricaSupa fs = new FabricaSupa();

        TipMancare supaCiuperci = fs.getFelMancare(TipSupa.SUPACIUPERCI,500,35);
        TipMancare papanasi = fb.getFelMancare(TipDesert.CLATITE, 400, 30, 800);


        System.out.println(supaCiuperci.toString());
        System.out.println(papanasi.toString());
    }
}
