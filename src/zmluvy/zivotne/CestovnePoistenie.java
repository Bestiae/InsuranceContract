package zmluvy.zivotne;

import users.User;
import zmluvy.Enums;
import zmluvy.ZivotnePoistenie;

import java.time.LocalDateTime;

public class CestovnePoistenie extends ZivotnePoistenie {
    User poistenec;
    boolean ramecEU;
    Enums.UcelCesty ucelCesty;

//    int cisloZmluvy,
    public CestovnePoistenie(LocalDateTime datumVzniku, LocalDateTime zaciatokPoistenia, LocalDateTime koniecPoistenia, int vyskaPoistnehoPlnenia, int vyskaMesacnejSplatky,
                User poistenec, boolean ramecEU, Enums.UcelCesty ucelCesty) {
        super(datumVzniku, zaciatokPoistenia, koniecPoistenia, vyskaPoistnehoPlnenia, vyskaMesacnejSplatky);
//        this.poistenec = poistenec;
        setPoistenec(poistenec);
//        this.ramecEU = ramecEU;
        setRamecEU(ramecEU);
//        this.ucelCesty = ucelCesty;
        setUcelCesty(ucelCesty);
        System.out.println("-> Zmluva cestovne poitenie vytvorena..\n");
    }

    @Override
    public String getZmluvaInfo() {
        return super.getZmluvaInfo() +
                "Poistenec " + this.getPoistenec() + "\n" +
                "V ramci EU " + this.isRamecEU() + "\n" +
                "Ucel cesty " + this.getUcelCesty() + "\n";
    }

    public String  getPoistenec() {
        return poistenec.getUserInfo();
    }

    public void setPoistenec(User poistenec) {
        if(poistenec == null){
            System.out.println("Poistenec nezadan, skus znovu.");
            return;
        }else {
            this.poistenec = poistenec;
            System.out.println("Poistenec nastaveny..");
        }
    }

    public boolean isRamecEU() {
        return ramecEU;
    }

    public void setRamecEU(boolean ramecEU) {
        this.ramecEU = ramecEU;
        System.out.println("Ramec EU nastaveny..");
    }

    public Enums.UcelCesty getUcelCesty() {
        return ucelCesty;
    }

    public void setUcelCesty(Enums.UcelCesty ucelCesty) {
        if(ucelCesty == null){
            System.out.println("Neni zadany ucel cesty, skus znovy..");
            return;
        }else {
            this.ucelCesty = ucelCesty;
            System.out.println("Ucel cesty nastaveny..");
        }
    }
}
