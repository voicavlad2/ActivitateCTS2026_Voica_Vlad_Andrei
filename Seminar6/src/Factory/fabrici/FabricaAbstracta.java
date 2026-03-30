package Factory.fabrici;

import Factory.enums.TipMancare;

public interface FabricaAbstracta {

    public TipMancare getFelMancare(TipMancare tipMancare, float gramaj, float pret);

    public TipMancare getFelMancare(TipMancare tipMancare, float gramaj, float pret, int calorii);

}
