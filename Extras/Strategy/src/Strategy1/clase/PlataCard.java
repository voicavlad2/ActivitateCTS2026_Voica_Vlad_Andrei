package Strategy1.clase;

public class PlataCard implements ModPlata{

    @Override
    public void plateste(double suma) {
        System.out.println("Suma " + suma + " platita cu cardul");
    }
}
