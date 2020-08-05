package users;

import adresy.Adresa;
import zmluvy.Zmluva;

import java.util.ArrayList;
import java.util.List;

public class User {
   private int id;
   private String meno;
   private String priezvisko;
   private int rodneCislo;
   private String email;
   private Adresa adresaTrv;
   private Adresa adresaKor;
    List<Zmluva> zmluvy;

//    int id,
    public User(String meno, String priezvisko, int rodneCislo,
                String email, Adresa adresaTrv, Adresa adresaKor) {
        if ((
//                setId(id)                 +
                        setMeno(meno)             +
                        setPriezvisko(priezvisko) +
                        setRodneCislo(rodneCislo) +
                        setEmail(email)           +
                        setAdresaTrv(adresaTrv)   +
                        setAdresaKor(adresaKor)   < 0))
        {
            System.out.println("Zadaj spravne udaje.");
            // check return; fch doto
            return;
        }
        this.zmluvy = new ArrayList<Zmluva>();
        System.out.println("-> Pouzivatel je vytvoreny..\n");
    }

    public String getUserInfo(){
        return  "id: "           + this.getId()         + "\n" +
                "meno: "         + this.getMeno()       + "\n" +
                "priezvisko: "   + this.getPriezvisko() + "\n" +
                "rodne cislo: "  + this.getRodneCislo() + "\n" +
                "email: "        + this.getEmail()      + "\n" +
                "adresa tp: "    + this.getAdresaTrv().getAdresaInfo()  + "\n" +
                "adresa kor: "   + this.getAdresaKor().getAdresaInfo()  + "\n" +
                "zoznam zmluv: " + this.getZmluvy();
    }

    public void VypisZmluvPouzivatela(){
        for (Zmluva zmluva: this.zmluvy){
            System.out.println(zmluva.getZmluvaInfo());
        }
    }

    public int getId() {
        return id;
    }

    public String getMeno() {
        return meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public int getRodneCislo() {
        return rodneCislo;
    }

    public String getEmail() {
        return email;
    }

    public Adresa getAdresaTrv() {
        return adresaTrv;
    }

    public Adresa getAdresaKor() {
        return adresaKor;
    }

    public List<Zmluva> getZmluvy() {
        return zmluvy;
    }

    //------------------------------------------------------------------------------------------------------------

    public int setId(int id) {
        if(id < 0){
            System.out.println("Zle cislo ID, skus znovu");
            return -1;
        }else{
            this.id = id;
            System.out.println("Cislo ID zadane spravne..");
            return 0;
        }
    }

    public int setMeno(String meno) {
        if(meno != null && !meno.isEmpty()){
            this.meno = meno;
            System.out.println("Meno nastavene..");
            return 0;
        }else {
            System.out.println("Zle zadane meno, skus znovu.");
            return -1;
        }
    }

    public int setPriezvisko(String priezvisko) {
        if (priezvisko != null && !priezvisko.isEmpty()) {
            this.priezvisko = priezvisko;
            System.out.println("Priezvisko nastavene..");
            return 0;
        }else {
            System.out.println("Zle zadane priezvisko, skus znovu.");
            return -1;
        }
    }

    public int setRodneCislo(int rodneCislo) {
        if(rodneCislo <= 0){
            System.out.println("Zle zadane rodne cislo, skus znovu.");
            return -1;
        }else {
            this.rodneCislo = rodneCislo;
            System.out.println("Rodne cislo nastavene..");
            return 0;
        }
    }

    public int setEmail(String email) {
        if (email != null && !email.isEmpty()) {
            this.email = email;
            System.out.println("Email nastaveny..");
            return 0;
        }else{
            System.out.println("Zle zadany email, skus znovu.");
            return -1;
        }
    }

    public int setAdresaTrv(Adresa adresaTrv) {
        if (adresaTrv == null)
        {
            System.out.println("Zle zadane udaje, skus znovu.");
            return -1;
        }
        this.adresaTrv = adresaTrv;
        System.out.println("Adresa trvaleho pobytu nastavene..");
        return 0;
    }

    public int setAdresaKor(Adresa adresaKor) {
        if (adresaKor == null)
        {
            this.adresaKor = this.adresaTrv;
            System.out.println("Adresa korespondecna nastavena ako adresa trvaleho pobytu..");
            return 0;
        }
        this.adresaKor = adresaKor;
        System.out.println("Adresa korespondecna nastavena..");
        return 0;
    }

    public int addZmluva(Zmluva zmluva) {
        //to ma byt nastavenie id zmluvy

        zmluva.setUser(this);
        this.zmluvy.add(zmluva);
        System.out.println("Zmluva nastavena..");
        return 0;
    }
}