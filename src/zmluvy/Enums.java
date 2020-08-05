package zmluvy;

public class Enums {
    public enum TypNehnutelnosti{
        Byt,
        RodinnyDomMurovany,
        RodinnyDomDreveny
    }

    public enum UcelCesty{
        Pracovne,
        Rekreacne,
        Sport,
        Ine
    }

    public enum UzemnaPlatnost{
        Slovensko,
        Svet,
        SvetSlovensko
    }

    public enum PouzivatelParam {
        Meno,
        Priezvisko,
        RodneCislo,
        Email,
        AdresaTrv,
        AdresaKor
    }

    public enum PoistenieDomacnostiParam {
    CisloZmluvy,
    DatumVzniku,
    ZaciatokPoistenia,
    KoniecPoistenia,
    VyskaPoistnehoPlnenia,
    VyskaMesacnejSplatky,
    TypNehnutelnosti,
    AdresaNehnutelnosti,
    HodnotaNehnutelnostiEuro,
    HodnotaZariadeniaDomacnostiEuro
    }

    public enum PoistenieDomuBytuParam {
        CisloZmluvy,
        DatumVzniku,
        ZaciatokPoistenia,
        KoniecPoistenia,
        VyskaPoistnehoPlnenia,
        VyskaMesacnejSplatky,
        TypNehnutelnosti,
        AdresaNehnutelnosti,
        HodnotaNehnutelnostiEuro,
        PripoistenieGaraze
    }

    public enum CestovnePoistenieParam {
        CisloZmluvy,
        DatumVzniku,
        ZaciatokPoistenia,
        KoniecPoistenia,
        VyskaPoistnehoPlnenia,
        VyskaMesacnejSplatky,
        Poistenec,
        RamecEU,
        UcelCesty
    }

    public enum UrazovePoistenieParam {
        CisloZmluvy,
        DatumVzniku,
        ZaciatokPoistenia,
        KoniecPoistenia,
        VyskaPoistnehoPlnenia,
        VyskaMesacnejSplatky,
        Poistenec,
        TrvaleNasledkyUrazuEuro,
        SmrtDosledkuUrazuEuro,
        DenneOdskodneHospitalizaciuEuro,
        UzemnaPlatnost
    }
}
