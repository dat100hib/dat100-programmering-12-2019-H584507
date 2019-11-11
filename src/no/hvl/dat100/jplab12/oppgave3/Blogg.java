package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;
import no.hvl.dat100.jplab12.oppgave2.Tekst;

public class Blogg {

	// TODO: objektvariabler
	private Innlegg[] innleggtabell;
	private int nesteledig = 0;
	
	public Blogg() {
		innleggtabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
	}
	
	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		if(getAntall() > 0) {
			for(int i = 0; i < nesteledig; i++) {
				if(innleggtabell[i].erLik(innlegg))
					return i;
			}
		}
		
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		if(getAntall() > 0) {
			for(int i = 0; i < nesteledig; i++) {
				if(innleggtabell[i].erLik(innlegg))
					return true;
			}
		}
		
		return false;
	}
	
	public boolean ledigPlass() {
		if(nesteledig == innleggtabell.length)
			return false;
					
		return true;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		if(!finnes(innlegg) && ledigPlass()) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			
			return true;
		}
		
		return false;
	}
	
	public String toString() {
		String txt = getAntall() +"\n";
		
		for(int i = 0; i < getAntall(); i++) {
			txt += innleggtabell[i].toString();
		}
		
		return txt;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		if(!ledigPlass()) {
			Innlegg[] tempTab = new Innlegg[innleggtabell.length*2];
			
			for(int i = 0; i < innleggtabell.length; i++) {
				tempTab[i] = innleggtabell[i];
			}
			
			innleggtabell = tempTab;
		}
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {
		if(!ledigPlass()) 
			utvid();
		
		return leggTil(innlegg);
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	// Testing

	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}