package Factory.clase;

import Factory.enums.TipMancare;

public abstract class Desert implements TipMancare {
    protected float pret;
    protected float gramaj;
    protected float calorii;

    public Desert(float pret, float gramaj, float calorii) {
        this.pret = pret;
        this.gramaj = gramaj;
        this.calorii = calorii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Desert{");
        sb.append("pret=").append(pret);
        sb.append(", gramaj=").append(gramaj);
        sb.append(", calorii=").append(calorii);
        sb.append('}');
        return sb.toString();
    }
}
