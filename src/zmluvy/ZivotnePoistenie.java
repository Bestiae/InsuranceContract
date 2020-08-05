package zmluvy;

import users.User;

import java.time.LocalDateTime;

public class ZivotnePoistenie extends Zmluva{

//    int cisloZmluvy,
    public ZivotnePoistenie( LocalDateTime datumVzniku,
                            LocalDateTime zaciatokPoistenia, LocalDateTime koniecPoistenia,
                            int vyskaPoistnehoPlnenia, int vyskaMesacnejSplatky) {
        super(datumVzniku, zaciatokPoistenia, koniecPoistenia, vyskaPoistnehoPlnenia, vyskaMesacnejSplatky);
    }
}
