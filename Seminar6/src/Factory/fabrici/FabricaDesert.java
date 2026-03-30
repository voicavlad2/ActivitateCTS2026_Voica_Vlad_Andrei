package Factory.fabrici;

import Factory.clase.Clatite;
import Factory.clase.Papanasi;
import Factory.enums.TipDesert;
import Factory.enums.TipMancare;

public class FabricaDesert implements FabricaAbstracta{

    @Override
    public TipMancare getFelMancare(TipMancare tipMancare, float gramaj, float pret) {
        return null;
    }

    @Override
    public TipMancare getFelMancare(TipMancare tipMancare, float gramaj, float pret, int calorii) {

        if(tipMancare instanceof TipDesert){
            TipDesert tip = (TipDesert) tipMancare;
            switch (tip) {
                case CLATITE:
                    return new Clatite(gramaj, pret, calorii);
                case PAPANASI:
                    return new Papanasi(gramaj, pret, calorii);
            }
        }
        return null;

    }
}
