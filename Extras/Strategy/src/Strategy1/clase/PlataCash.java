package Strategy1.clase;

public class PlataCash implements ModPlata{
    @Override
    public void plateste(double suma) {
        System.out.println("Suma " + suma + " platita cash");
    }
}
