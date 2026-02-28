package seminar1.ro.ase.cts.main;

import java.io.FileNotFoundException;
import java.util.List;

import seminar1.ro.ase.cts.clase.Aplicant;
import seminar1.ro.ase.cts.clase.reader.AngajatReader;
import seminar1.ro.ase.cts.clase.reader.AplicantReader;

public class Program {

	public static void main(String[] args) {
		AplicantReader aplicantReader= new AngajatReader();
		try {
			List<Aplicant> listaAngajati = aplicantReader.readAplicanti("angajati.txt");

			for(Aplicant angajat:listaAngajati) {
				System.out.println(angajat.toString());
				angajat.finantare(200);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
