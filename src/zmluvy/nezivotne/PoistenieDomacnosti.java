package zmluvy.nezivotne;

import adresy.Adresa;
import zmluvy.Enums;
import zmluvy.ZivotnePoistenie;

import java.time.LocalDateTime;

public class PoistenieDomacnosti extends ZivotnePoistenie {
    Enums.TypNehnutelnosti typNehnutelnosti;
    Adresa adresaNehnutelnosti;
    int hodnotaNehnutelnostiEuro;
    int hodnotaZariadeniaDomacnostiEuro;

//    int cisloZmluvy,
    public PoistenieDomacnosti(LocalDateTime datumVzniku, LocalDateTime zaciatokPoistenia, LocalDateTime koniecPoistenia, int vyskaPoistnehoPlnenia, int vyskaMesacnejSplatky,
                               Enums.TypNehnutelnosti typNehnutelnosti, Adresa adresaNehnutelnosti, int hodnotaNehnutelnostiEuro, int hodnotaZariadeniaDomacnostiEuro) {
        super(datumVzniku, zaciatokPoistenia, koniecPoistenia, vyskaPoistnehoPlnenia, vyskaMesacnejSplatky);
        setTypNehnutelnosti(typNehnutelnosti);
//        this.typNehnutelnosti = typNehnutelnosti;
        setAdresaNehnutelnosti(adresaNehnutelnosti);
//        this.adresaNehnutelnosti = adresaNehnutelnosti;
        setHodnotaNehnutelnostiEuro(hodnotaNehnutelnostiEuro);
//        this.hodnotaNehnutelnostiEuro = hodnotaNehnutelnostiEuro;
        setHodnotaZariadeniaDomacnostiEuro(hodnotaZariadeniaDomacnostiEuro);
//        this.hodnotaZariadeniaDomacnostiEuro = hodnotaZariadeniaDomacnostiEuro;
        System.out.println("-> Zmluva poitenie domacnosti vytvorena..\n");
    }


    @Override
    public String getZmluvaInfo() {
        return super.getZmluvaInfo() +
                "Typ nehnytelnosti " + this.getTypNehnutelnosti() + "\n" +
                "Adresa nehnutelnosti " + this.getAdresaNehnutelnosti() + "\n" +
                "Hodnota nehnutelnosti(cena v Euro) " + this.getHodnotaNehnutelnostiEuro() + "\n" +
                "Hodnota zariadenia domacnosti(cena v Euro)" + this.getHodnotaZariadeniaDomacnostiEuro() + "\n" ;

    }


    public Enums.TypNehnutelnosti getTypNehnutelnosti() {
        return typNehnutelnosti;
    }

    public void setTypNehnutelnosti(Enums.TypNehnutelnosti typNehnutelnosti) {
        if(typNehnutelnosti == null){
            System.out.println("Zle zadany typ nehnutelnosti, skus znovu.");
            return;
        }else {
            this.typNehnutelnosti = typNehnutelnosti;
            System.out.println("Typ nehnutelnosti nastaveny..");
        }
    }

    public String getAdresaNehnutelnosti() {
        return adresaNehnutelnosti.getAdresaInfo();
    }

    public void setAdresaNehnutelnosti(Adresa adresaNehnutelnosti) {
        if(adresaNehnutelnosti == null){
            System.out.println("Andresa nehnutelnosti zadana zle, skus znovu.");
            return;
        }else {
            this.adresaNehnutelnosti = adresaNehnutelnosti;
            System.out.println("Adresa nehnutelnosti nastavena..");
        }
    }

    public int getHodnotaNehnutelnostiEuro() {
        return hodnotaNehnutelnostiEuro;
    }

    public void setHodnotaNehnutelnostiEuro(int hodnotaNehnutelnostiEuro) {
        if(hodnotaNehnutelnostiEuro < 0){
            System.out.println("Hodnota nehnutelnosti zdana zle, skus znovu.");
            return;
        }else {
            this.hodnotaNehnutelnostiEuro = hodnotaNehnutelnostiEuro;
            System.out.println("Hodnota nehnutelnosti nastavena..");
        }
    }

    public int getHodnotaZariadeniaDomacnostiEuro() {
        return hodnotaZariadeniaDomacnostiEuro;
    }

    public void setHodnotaZariadeniaDomacnostiEuro(int hodnotaZariadeniaDomacnostiEuro) {
        if(hodnotaZariadeniaDomacnostiEuro < 0){
            System.out.println("Hodnota zariadenia domacnosti zadana zle, skus znovu.");
            return;
        }else {
            this.hodnotaZariadeniaDomacnostiEuro = hodnotaZariadeniaDomacnostiEuro;
            System.out.println("Hodnota zariadenia domacnosti nastavena..");
        }
    }
}
