package no.hvl.dat100.oppgave4;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

import no.hvl.dat100.oppgave1.Innlegg;
import no.hvl.dat100.oppgave3.Blogg;

public class SkrivBlogg {

    public static boolean skriv(Blogg samling, String mappe, String filnavn) {

        String fullFilBane = mappe + "/" + filnavn;

        try (PrintWriter skriver = new PrintWriter(new FileWriter(fullFilBane))) {

            skriver.println(samling.getAntall());

            Innlegg[] innleggstabell = samling.getSamling();
            for (int i = 0; i < samling.getAntall(); i++) {
                skriver.print(innleggstabell[i].toString());
            }

            return true;

        } catch (IOException e) {
            System.out.println("Feil ved skriving til fil: " + e.getMessage());
            return false;
        }
    }
}
