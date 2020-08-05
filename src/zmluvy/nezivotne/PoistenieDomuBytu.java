package zmluvy.nezivotne;

import adresy.Adresa;
import zmluvy.Enums;
import zmluvy.ZivotnePoistenie;

import java.time.LocalDateTime;

public class PoistenieDomuBytu extends ZivotnePoistenie {
    Enums.TypNehnutelnosti typNehnutelnosti;
    Adresa adresaNehnutelnosti;
    int hodnotaNehnutelnostiEuro;
    boolean pripoistenieGaraze;

//    int cisloZmluvy,
    public PoistenieDomuBytu( LocalDateTime datumVzniku, LocalDateTime zaciatokPoistenia, LocalDateTime koniecPoistenia, int vyskaPoistnehoPlnenia, int vyskaMesacnejSplatky,
                             Enums.TypNehnutelnosti typNehnutelnosti, Adresa adresaNehnutelnosti, int hodnotaNehnutelnostiEuro, boolean pripoistenieGaraze) {
        super(datumVzniku, zaciatokPoistenia, koniecPoistenia, vyskaPoistnehoPlnenia, vyskaMesacnejSplatky);
//        this.typNehnutelnosti = typNehnutelnosti;
        setTypNehnutelnosti(typNehnutelnosti);
//        this.adresaNehnutelnosti = adresaNehnutelnosti;
        setAdresaNehnutelnosti(adresaNehnutelnosti);
//        this.hodnotaNehnutelnostiEuro = hodnotaNehnutelnostiEuro;
        setHodnotaNehnutelnostiEuro(hodnotaNehnutelnostiEuro);
//        this.pripoistenieGaraze = pripoistenieGaraze;
        setPripoistenieGaraze(pripoistenieGaraze);
        System.out.println("-> Zmluva poistenie domu a bytu vytvorena..\n");
    }

    @Override
    public String getZmluvaInfo() {
        return super.getZmluvaInfo() +
                "Typ nehnutelnosti " + this.getTypNehnutelnosti() + "\n" +
                "Adresa nehnutelnosti " + this.getAdresaNehnutelnosti() + "\n" +
                "Hodnota nehnutelnosti(cena v Euro) " + this.getHodnotaNehnutelnostiEuro() + "\n" +
                "Pripoistnenie garaze(ano/nie) " + this.isPripoistenieGaraze() + "\n";
    }

    public Enums.TypNehnutelnosti getTypNehnutelnosti() {
        return typNehnutelnosti;
    }

    public void setTypNehnutelnosti(Enums.TypNehnutelnosti typNehnutelnosti) {
        if(typNehnutelnosti == null){
            System.out.println("Typ hehnutelnosti nezadany, skus znovu.");
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
            System.out.println("Adresa nehnutelnosti zadana zle, skus znovu.");
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
            System.out.println("Hodnota nehnutelnosti zadana zle, skus znovu.");
            return;
        }else {
            this.hodnotaNehnutelnostiEuro = hodnotaNehnutelnostiEuro;
            System.out.println("Hodnota nehnutelnosti nastavena..");
        }
    }

    public boolean isPripoistenieGaraze() {
        return pripoistenieGaraze;
    }

    public void setPripoistenieGaraze(boolean pripoistenieGaraze) {
        this.pripoistenieGaraze = pripoistenieGaraze;
        System.out.println("Pripoistenie garage nastavene..");
    }
}
