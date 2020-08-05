package zmluvyAPI;

import adresy.Adresa;
import jdk.nashorn.internal.ir.CallNode;
import users.User;
import zmluvy.Enums;
import zmluvy.Zmluva;
import zmluvy.nezivotne.PoistenieDomacnosti;
import zmluvy.nezivotne.PoistenieDomuBytu;
import zmluvy.zivotne.CestovnePoistenie;
import zmluvy.zivotne.UrazovePoistenie;

import java.time.LocalDateTime;
import java.util.List;

public class ZmluvyAPI implements IZmluvy {

    @Override
    public void ZalozeniePoistnejZmluvyPouzivatelovi(Zmluva zmluva, User user) {
        // zadavame unikatne cislo pre pouzivatela.
        int id = user.getZmluvy().size()+1;
        zmluva.setCisloZmluvy(id);
        user.addZmluva(zmluva);
    }

    @Override
    public void VylistovanieVsetkychPoistnychZmluv(List<User> users) {
        for (User user : users) {
            System.out.println("-");
            user.VypisZmluvPouzivatela();
        }
    }

    @Override
    public void VylistovaniePoistnychZmluvPouzivatela(List<User> users, int id) {
        for (User user : users) {
            if (user.getId() == id) {
                System.out.println("-");
                user.VypisZmluvPouzivatela();
            }
        }
    }

    @Override
    public void UpravaExistujucejZmluvy(Zmluva zmluva, Enums.PoistenieDomacnostiParam poistenieDomacnostiParam, Object value) {
        if (poistenieDomacnostiParam == null) {
            System.out.println("User nema take udaje. Zadajte spravne udaje");
            return;
        } else {
            switch (poistenieDomacnostiParam) {
                case CisloZmluvy:
                    ((PoistenieDomacnosti) zmluva).setCisloZmluvy((Integer) value);
                    break;
                case DatumVzniku:
                    ((PoistenieDomacnosti) zmluva).setDatumVzniku((LocalDateTime) value);
                    break;
                case KoniecPoistenia:
                    ((PoistenieDomacnosti) zmluva).setKoniecPoistenia((LocalDateTime) value);
                    break;
                case TypNehnutelnosti:
                    ((PoistenieDomacnosti) zmluva).setTypNehnutelnosti((Enums.TypNehnutelnosti) value);
                    break;
                case ZaciatokPoistenia:
                    ((PoistenieDomacnosti) zmluva).setZaciatokPoistenia((LocalDateTime) value);
                    break;
                case AdresaNehnutelnosti:
                    ((PoistenieDomacnosti) zmluva).setAdresaNehnutelnosti((Adresa) value);
                    break;
                case VyskaMesacnejSplatky:
                    ((PoistenieDomacnosti) zmluva).setVyskaMesacnejSplatky((Integer) value);
                    break;
                case VyskaPoistnehoPlnenia:
                    ((PoistenieDomacnosti) zmluva).setVyskaPoistnehoPlnenia((Integer) value);
                    break;
                case HodnotaNehnutelnostiEuro:
                    ((PoistenieDomacnosti) zmluva).setHodnotaNehnutelnostiEuro((Integer) value);
                    break;
                case HodnotaZariadeniaDomacnostiEuro:
                    ((PoistenieDomacnosti) zmluva).setHodnotaZariadeniaDomacnostiEuro((Integer) value);
                    break;
            }
        }
    }

    @Override
    public void UpravaExistujucejZmluvy(Zmluva zmluva, Enums.PoistenieDomuBytuParam poistenieDomuBytuParam, Object value) {
        if (poistenieDomuBytuParam == null) {
            System.out.println("User nema take udaje. Zadajte spravne udaje");
            return;
        } else {
            switch (poistenieDomuBytuParam) {
                case HodnotaNehnutelnostiEuro:
                    ((PoistenieDomuBytu) zmluva).setHodnotaNehnutelnostiEuro((Integer) value);
                    break;
                case VyskaPoistnehoPlnenia:
                    ((PoistenieDomuBytu) zmluva).setVyskaPoistnehoPlnenia((Integer) value);
                    break;
                case VyskaMesacnejSplatky:
                    ((PoistenieDomuBytu) zmluva).setVyskaMesacnejSplatky((Integer) value);
                    break;
                case AdresaNehnutelnosti:
                    ((PoistenieDomuBytu) zmluva).setAdresaNehnutelnosti((Adresa) value);
                    break;
                case ZaciatokPoistenia:
                    ((PoistenieDomuBytu) zmluva).setZaciatokPoistenia((LocalDateTime) value);
                    break;
                case TypNehnutelnosti:
                    ((PoistenieDomuBytu) zmluva).setTypNehnutelnosti((Enums.TypNehnutelnosti) value);
                    break;
                case KoniecPoistenia:
                    ((PoistenieDomuBytu) zmluva).setKoniecPoistenia((LocalDateTime) value);
                    break;
                case DatumVzniku:
                    ((PoistenieDomuBytu) zmluva).setDatumVzniku((LocalDateTime) value);
                    break;
                case CisloZmluvy:
                    ((PoistenieDomuBytu) zmluva).setCisloZmluvy((Integer) value);
                    break;
                case PripoistenieGaraze:
                    ((PoistenieDomuBytu) zmluva).setPripoistenieGaraze((Boolean) value);
                    break;
            }
        }
    }


    @Override
    public void UpravaExistujucejZmluvy(Zmluva zmluva, Enums.CestovnePoistenieParam cestovnePoistenieParam, Object value) {
        if(cestovnePoistenieParam == null){
            System.out.println("User nema take udaje. Zadajte spravne udaje");
            return;
        }else {
            switch (cestovnePoistenieParam){
                case CisloZmluvy:
                    ((CestovnePoistenie) zmluva).setCisloZmluvy((Integer) value);
                    break;
                case DatumVzniku:
                    ((CestovnePoistenie) zmluva).setDatumVzniku((LocalDateTime) value);
                    break;
                case KoniecPoistenia:
                    ((CestovnePoistenie) zmluva).setKoniecPoistenia((LocalDateTime) value);
                    break;
                case ZaciatokPoistenia:
                    ((CestovnePoistenie) zmluva).setZaciatokPoistenia((LocalDateTime) value);
                    break;
                case VyskaMesacnejSplatky:
                    ((CestovnePoistenie) zmluva).setVyskaMesacnejSplatky((Integer) value);
                    break;
                case VyskaPoistnehoPlnenia:
                    ((CestovnePoistenie) zmluva).setVyskaPoistnehoPlnenia((Integer) value);
                    break;
                case RamecEU:((CestovnePoistenie) zmluva).setRamecEU((Boolean) value);
                    break;
                case Poistenec:
                    ((CestovnePoistenie) zmluva).setPoistenec((User) value);
                    break;
                case UcelCesty:
                    ((CestovnePoistenie) zmluva).setUcelCesty((Enums.UcelCesty) value);
                    break;
            }
        }
    }

    @Override
    public void UpravaExistujucejZmluvy(Zmluva zmluva, Enums.UrazovePoistenieParam urazovePoistenieParam, Object value) {
        if(urazovePoistenieParam == null){
            System.out.println("User nema take udaje. Zadajte spravne udaje");
            return;
        }else {
            switch (urazovePoistenieParam){
                case Poistenec:
                    ((UrazovePoistenie) zmluva).setPoistenec((User) value);
                    break;
                case VyskaPoistnehoPlnenia:
                    ((UrazovePoistenie) zmluva).setVyskaPoistnehoPlnenia((Integer) value);
                    break;
                case SmrtDosledkuUrazuEuro:
                    ((UrazovePoistenie) zmluva).setSmrtDosledkuUrazuEuro((Integer) value);
                    break;
                case VyskaMesacnejSplatky:
                    ((UrazovePoistenie) zmluva).setVyskaMesacnejSplatky((Integer) value);
                    break;
                case ZaciatokPoistenia:
                    ((UrazovePoistenie) zmluva).setZaciatokPoistenia((LocalDateTime) value);
                    break;
                case KoniecPoistenia:
                    ((UrazovePoistenie) zmluva).setKoniecPoistenia((LocalDateTime) value);
                    break;
                case DatumVzniku:
                    ((UrazovePoistenie) zmluva).setDatumVzniku((LocalDateTime) value);
                    break;
                case CisloZmluvy:
                    ((UrazovePoistenie) zmluva).setCisloZmluvy((Integer) value);
                    break;
                case UzemnaPlatnost:
                    ((UrazovePoistenie) zmluva).setUzemnaPlatnost((Enums.UzemnaPlatnost) value);
                    break;
                case TrvaleNasledkyUrazuEuro:
                    ((UrazovePoistenie) zmluva).setTrvaleNasledkyUrazuEuro((Integer) value);
                    break;
                case DenneOdskodneHospitalizaciuEuro:
                    ((UrazovePoistenie) zmluva).setDenneOdskodneHospitalizaciuEuro((Integer) value);
                    break;
            }
        }
    }
}




