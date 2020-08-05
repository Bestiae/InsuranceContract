package zmluvy;

import users.User;

import java.time.LocalDateTime;

public class Zmluva {
    protected int  cisloZmluvy;
    protected LocalDateTime datumVzniku;
    protected User poistovatel;
    protected LocalDateTime zaciatokPoistenia;
    protected LocalDateTime koniecPoistenia;
    protected int  vyskaPoistnehoPlnenia;
    protected int  vyskaMesacnejSplatky;

//    int cisloZmluvy,
    public Zmluva(LocalDateTime datumVzniku,
                  LocalDateTime zaciatokPoistenia, LocalDateTime koniecPoistenia,
                  int vyskaPoistnehoPlnenia, int vyskaMesacnejSplatky) {
//        this.cisloZmluvy = cisloZmluvy;
//        setCisloZmluvy(cisloZmluvy);
//        this.datumVzniku = datumVzniku;
        setDatumVzniku(datumVzniku);
//        this.poistovatel = poistovatel;
//        this.zaciatokPoistenia = zaciatokPoistenia;
        setZaciatokPoistenia(zaciatokPoistenia);
//        this.koniecPoistenia = koniecPoistenia;
        setKoniecPoistenia(koniecPoistenia);
//        this.vyskaPoistnehoPlnenia = vyskaPoistnehoPlnenia;
        setVyskaPoistnehoPlnenia(vyskaPoistnehoPlnenia);
//        this.vyskaMesacnejSplatky = vyskaMesacnejSplatky;
        setVyskaMesacnejSplatky(vyskaMesacnejSplatky);
    }

    public  String getZmluvaInfo(){
        return "Cislo zmluvuy " + getCisloZmluvy() + ". " +
                "Datum vzniku " + getDatumVzniku() + "\n" +
                "Poistovatel " + getPoistovatel() + "\n" +
                "Zacatok poistenia " + getZaciatokPoistenia() + "\n" +
                "Konec poistenia " + getKoniecPoistenia() + "\n" +
                "Vuska poistneho plnenia " + getVyskaPoistnehoPlnenia() + "\n" +
                "Vyska mesacnej splatky " + getVyskaMesacnejSplatky() + "\n";
    }

    public int getCisloZmluvy() {
        return cisloZmluvy;
    }

    public LocalDateTime getDatumVzniku() {
        return datumVzniku;
    }

    public String getPoistovatel() {
        return poistovatel.getUserInfo();
    }

    public LocalDateTime getZaciatokPoistenia() {
        return zaciatokPoistenia;
    }

    public LocalDateTime getKoniecPoistenia() {
        return koniecPoistenia;
    }

    public int getVyskaPoistnehoPlnenia() {
        return vyskaPoistnehoPlnenia;
    }

    public int getVyskaMesacnejSplatky() {
        return vyskaMesacnejSplatky;
    }

    public void setUser(User user) {
        if(user == null){
            System.out.println("Zle nastaveny pouzivatel, skus znovu.");
            return;
        }else {
            this.poistovatel = user;
            System.out.println("Pouzivatel nastaveny..");
        }
    }

    public void setCisloZmluvy(int cisloZmluvy) {
        if(cisloZmluvy < 0){
            System.out.println("Cislo zmluvy nastavene zle, skus znovy..");
            return;
        }else{
//            this.cisloZmluvy = poistovatel.getId() +1;
            this.cisloZmluvy = cisloZmluvy;
            System.out.println("Cislo zmluvy nastavene..");
        }
    }

    public void setDatumVzniku(LocalDateTime datumVzniku) {
        this.datumVzniku = datumVzniku;
        System.out.println("Datum vzniku nastaveny..");
    }

    public void setZaciatokPoistenia(LocalDateTime zaciatokPoistenia) {
        this.zaciatokPoistenia = zaciatokPoistenia;
        System.out.println("Zaciatok poisteniea nastaveny..");
    }

    public void setKoniecPoistenia(LocalDateTime koniecPoistenia) {
        this.koniecPoistenia = koniecPoistenia;
        System.out.println("Konec poistenia nastaveny..");
    }

    public void setVyskaPoistnehoPlnenia(int vyskaPoistnehoPlnenia) {
        if(vyskaPoistnehoPlnenia < 0){
            System.out.println("Vyska poistneho plnenia nastavena zle, skus znovu.");
            return;
        }else {
            this.vyskaPoistnehoPlnenia = vyskaPoistnehoPlnenia;
            System.out.println("Vyska poistneho plnenia nastavena..");
        }
    }

    public void setVyskaMesacnejSplatky(int vyskaMesacnejSplatky) {
        if(vyskaMesacnejSplatky < 0){
            System.out.println("Vyska mesacnej splatky nemoze existovat, skus znovu..");
            return;
        }else {
            this.vyskaMesacnejSplatky = vyskaMesacnejSplatky;
            System.out.println("Vyska mesacnej splatky nastavena..");
        }
    }

}
