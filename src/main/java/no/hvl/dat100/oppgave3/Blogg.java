package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;
import no.hvl.dat100.oppgave2.Bilde;
import no.hvl.dat100.oppgave2.Tekst;

public class Blogg {

    private Innlegg[] innleggstabell;
    private int nesteLedig;

	public Blogg() {
		this.innleggstabell = new Innlegg[20];
        this.nesteLedig = 0;
	}

	public Blogg(int lengde) {
        this.innleggstabell = new Innlegg[lengde];
        this.nesteLedig = 0;
	}

	public int getAntall() {
		return nesteLedig;
	}
	
	public Innlegg[] getSamling() {
		return innleggstabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
        for (int i = 0; i < nesteLedig; i++) {
            if (innleggstabell[i].erLik(innlegg)) {
                return i;
            }
        } return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		for (int i = 0; i < nesteLedig; i++) {
            if(innleggstabell[i].erLik(innlegg)) {
                return true;
            }
        } return false;
	}

	public boolean ledigPlass() {
        return nesteLedig < innleggstabell.length;

	}
	
	public boolean leggTil(Innlegg innlegg) {

		if (ledigPlass()) {
            innleggstabell[nesteLedig] = innlegg;
            nesteLedig++;
            return true;
        }
        return false;
	}

    @Override
	public String toString() {
        throw new UnsupportedOperationException(TODO.method());
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}