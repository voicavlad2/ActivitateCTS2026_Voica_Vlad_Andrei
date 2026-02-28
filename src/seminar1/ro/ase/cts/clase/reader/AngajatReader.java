package seminar1.ro.ase.cts.clase.reader;

import seminar1.ro.ase.cts.clase.Angajat;
import seminar1.ro.ase.cts.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader extends AplicantReader{
    @Override
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {

        Scanner fileScanner = new Scanner(new File(file));
        fileScanner.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while (fileScanner.hasNext()) {
            Angajat angajat = new Angajat();
            super.readApplicant(fileScanner, angajat);
            angajat.setSalariu(fileScanner.nextInt());
            angajat.setOcupatie(fileScanner.next());
            angajati.add(angajat);
        }

        fileScanner.close();
        return angajati;
    }
}
