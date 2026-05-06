package Strategy1.main;

import Strategy1.clase.FacturaPacient;
import Strategy1.clase.PlataCard;

public class Main {

    public static void main(String[] args) {
        FacturaPacient factura = new FacturaPacient("Florian", 289);

        factura.setModPlata(new PlataCard());
        factura.efectueazaPlata();
    }
}
