package zmluvy;

import adresy.Adresa;

import java.time.LocalDateTime;

public class NezivotnePoistenie extends Zmluva{
    public NezivotnePoistenie(LocalDateTime datumVzniku, LocalDateTime zaciatokPoistenia, LocalDateTime koniecPoistenia, int vyskaPoistnehoPlnenia, int vyskaMesacnejSplatky) {
        super(datumVzniku, zaciatokPoistenia, koniecPoistenia, vyskaPoistnehoPlnenia, vyskaMesacnejSplatky);
    }
}
