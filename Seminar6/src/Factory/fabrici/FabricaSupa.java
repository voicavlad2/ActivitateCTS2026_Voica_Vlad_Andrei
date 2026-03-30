package Factory.fabrici;

import Factory.clase.SupaCiuperci;
import Factory.clase.SupaLegume;
import Factory.enums.TipMancare;
import Factory.enums.TipSupa;

public class FabricaSupa implements FabricaAbstracta{

    @Override
    public TipMancare getFelMancare(TipMancare tipMancare, float gramaj, float pret) {
        if(tipMancare instanceof TipSupa) {
            TipSupa tip = (TipSupa) tipMancare;

            switch (tip) {
                case SUPALEGUME:
                    return new SupaLegume(pret, gramaj);
                case SUPACIUPERCI:
                    return new SupaCiuperci(pret, gramaj);
            }
        }
        return null;
    }

    @Override
    public TipMancare getFelMancare(TipMancare tipMancare, float gramaj, float pret, int calorii) {
        return null;
    }

}
