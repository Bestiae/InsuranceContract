package adresy;

public class Adresa {
    private int psc;
    private String nazovObce;
    private String nazovUlice;
    private int cisloDomu;

    public Adresa(int psc, String nazovObce, String nazovUlice, int cisloDomu) {
        setPsc(psc);
        setNazovObce(nazovObce);
        setNazovUlice(nazovUlice);
        setCisloDomu(cisloDomu);
    }

    public String getAdresaInfo() {
        return this.getNazovUlice() + ", " + this.getCisloDomu() + ", " + this.getNazovObce() + ", " + this.getPsc();
    }

    public int getPsc() {
        return psc;
    }

    public void setPsc(int psc) {
        if(psc <= 0){
            System.out.println("Zle cislo PSC, skus znovu.");
            return;
        }else{
            this.psc = psc;
            System.out.println("PSC nastavene..");
        }
    }

    public String getNazovObce() {
        return nazovObce;
    }

    public void setNazovObce(String nazovObce) {
        if(nazovObce != null && !nazovObce.isEmpty()){
            this.nazovObce = nazovObce;
            System.out.println("Nazov obce nastaveny..");
        }else {
            System.out.println("Zly nazov obce, skus zadat znovu.");
            return;
        }
    }

    public String getNazovUlice() {
        return nazovUlice;
    }

    public void setNazovUlice(String nazovUlice) {
        if(nazovUlice != null && !nazovUlice.isEmpty()){
            this.nazovUlice = nazovUlice;
            System.out.println("Nazov ulice nastavene..");
        }else {
            System.out.println("Zly nazov ulice, skus znovu.");
            return;
        }
    }

    public int getCisloDomu() {
        return cisloDomu;
    }

    public void setCisloDomu(int cisloDomu) {
        if(cisloDomu <= 0){
            System.out.println("Zle zadane cislo domu, skus zadat znovu.");
            return;
        }
        this.cisloDomu = cisloDomu;
        System.out.println("Cislo domu nastavene..");
    }
}
