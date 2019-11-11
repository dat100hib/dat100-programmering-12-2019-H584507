package no.hvl.dat100.jplab12.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab12.oppgave3.*;

public class SkrivBlogg {
	
	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab12/tests/";
	
	public static boolean skriv (Blogg samling, String filnavn) {
	
		try {
			PrintWriter skriver = new PrintWriter(MAPPE+filnavn);
			skriver.print(samling.toString());
			
			skriver.close();
			return true;
			
		} catch (FileNotFoundException fe) {
			System.out.println("Fil ikke funnet.");
			
			return false;
		}
	}
}
