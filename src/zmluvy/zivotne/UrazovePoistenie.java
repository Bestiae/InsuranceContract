package zmluvy.zivotne;

import users.User;
import zmluvy.Enums;
import zmluvy.ZivotnePoistenie;

import java.time.LocalDateTime;

public class UrazovePoistenie extends ZivotnePoistenie {
    User poistenec;
    int trvaleNasledkyUrazuEuro;
    int smrtDosledkuUrazuEuro;
    int denneOdskodneHospitalizaciuEuro;
    Enums.UzemnaPlatnost uzemnaPlatnost;

//    int cisloZmluvy,
    public UrazovePoistenie(LocalDateTime datumVzniku, LocalDateTime zaciatokPoistenia,
                            LocalDateTime koniecPoistenia, int vyskaPoistnehoPlnenia, int vyskaMesacnejSplatky, User poistenec, int trvaleNasledkyUrazuEuro, int smrtDosledkuUrazuEuro, int denneOdskodneHospitalizaciuEuro, Enums.UzemnaPlatnost uzemnaPlatnost) {
        super(datumVzniku, zaciatokPoistenia, koniecPoistenia, vyskaPoistnehoPlnenia, vyskaMesacnejSplatky);
//        this.poistenec = poistenec;
        setPoistenec(poistenec);
//        this.trvaleNasledkyUrazuEuro = trvaleNasledkyUrazuEuro;
        setTrvaleNasledkyUrazuEuro(trvaleNasledkyUrazuEuro);
//        this.smrtDosledkuUrazuEuro = smrtDosledkuUrazuEuro;
        setSmrtDosledkuUrazuEuro(smrtDosledkuUrazuEuro);
//        this.denneOdskodneHospitalizaciuEuro = denneOdskodneHospitalizaciuEuro;
        setDenneOdskodneHospitalizaciuEuro(denneOdskodneHospitalizaciuEuro);
//        this.uzemnaPlatnost = uzemnaPlatnost;
        setUzemnaPlatnost(uzemnaPlatnost);
        System.out.println("-> Zmluva urazove poitenie vytvorena..\n");
    }

    @Override
    public String getZmluvaInfo() {
        return super.getZmluvaInfo() +
                "Poistenec" + this.getPoistenec() + "\n" +
                "Trvale nasledky urazu(poistna suma v Euro) " + this.getTrvaleNasledkyUrazuEuro() + "\n" +
                "Smrt v dosledku urazu(poistna suma v Euro) " + this.getSmrtDosledkuUrazuEuro() + "\n" +
                "Denne odskodne za hospitalilzaciu(poistna suma v Euro) " + this.getDenneOdskodneHospitalizaciuEuro() + "\n" +
                "Uzemna platnost " + this.getUzemnaPlatnost() + "\n";
    }

    public String getPoistenec() {
        return poistenec.getUserInfo();
    }

    public void setPoistenec(User poistenec) {
        if(poistenec == null){
            System.out.println("Poistenec neni nastaveny, skus znovy.");
            return;
        }else {
            this.poistenec = poistenec;
            System.out.println("Poistenec nastaveny..");
        }
    }

    public int getTrvaleNasledkyUrazuEuro() {
        return trvaleNasledkyUrazuEuro;
    }

    public void setTrvaleNasledkyUrazuEuro(int trvaleNasledkyUrazuEuro) {
        if(trvaleNasledkyUrazuEuro < 0) {
            System.out.println("Travale nasledky urazu su snastavene zle, skus znovy.");
            return;
        }else {
            this.trvaleNasledkyUrazuEuro = trvaleNasledkyUrazuEuro;
            System.out.println("Trvale nasledky urazu nastavene..");
        }
    }

    public int getSmrtDosledkuUrazuEuro() {
        return smrtDosledkuUrazuEuro;
    }

    public void setSmrtDosledkuUrazuEuro(int smrtDosledkuUrazuEuro) {
        if(smrtDosledkuUrazuEuro < 0){
            System.out.println("Smrt v dosledku urazu nastavene zle, skus znovu.");
            return;
        }else {
            this.smrtDosledkuUrazuEuro = smrtDosledkuUrazuEuro;
            System.out.println("Suma smrti v dosledku urazu nastavena..");
        }
    }

    public int getDenneOdskodneHospitalizaciuEuro() {
        return denneOdskodneHospitalizaciuEuro;
    }

    public void setDenneOdskodneHospitalizaciuEuro(int denneOdskodneHospitalizaciuEuro) {
        if(denneOdskodneHospitalizaciuEuro < 0){
            System.out.println("Denne odskodne hospitalizacie nastavene zle, skus znovu.");
            return;
        }else {
            this.denneOdskodneHospitalizaciuEuro = denneOdskodneHospitalizaciuEuro;
            System.out.println("Denne odskodne na hospitalizaciu nastavene..");
        }
    }

    public Enums.UzemnaPlatnost getUzemnaPlatnost() {
        return uzemnaPlatnost;
    }

    public void setUzemnaPlatnost(Enums.UzemnaPlatnost uzemnaPlatnost) {
        if(uzemnaPlatnost == null){
            System.out.println("Uzemna platnost nastavena zle, skus znovu.");
            return;
        }else {
            this.uzemnaPlatnost = uzemnaPlatnost;
            System.out.println("Uzemna platnost nastavena..");
        }
    }
}
