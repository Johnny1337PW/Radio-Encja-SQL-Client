package bdbt_grc_proj;

public class Audycje {

    private int numer_audycji;
    private String typ_audycji;
    private String czas_rozpoczecia;
    private String czas_zakonczenia;
    private int numer_radia;

    public Audycje(int numer_audycji, String typ_audycji, String czas_rozpoczecia, String czas_zakonczenia, int numer_radia) {
        super();
        this.numer_audycji = numer_audycji;
        this.typ_audycji = typ_audycji;
        this.czas_rozpoczecia = czas_rozpoczecia;
        this.czas_zakonczenia = czas_zakonczenia;
        this.numer_radia = numer_radia;
    }
    public Audycje() { super();}



    public int getNumer_audycji() {
        return numer_audycji;
    }

    public void setNumer_audycji(int numer_audycji) {
        this.numer_audycji = numer_audycji;
    }

    public String getTyp_audycji() {
        return typ_audycji;
    }

    public void setTyp_audycji(String typ_audycji) {
        this.typ_audycji = typ_audycji;
    }

    public String getCzas_rozpoczecia() {
        return czas_rozpoczecia;
    }

    public void setCzas_rozpoczecia(String czas_rozpoczecia) {
        this.czas_rozpoczecia = czas_rozpoczecia;
    }

    public String getCzas_zakonczenia() {
        return czas_zakonczenia;
    }

    public void setCzas_zakonczenia(String czas_zakonczenia) {
        this.czas_zakonczenia = czas_zakonczenia;
    }

    public int getNumer_radia() {
        return numer_radia;
    }

    public void setNumer_radia(int numer_radia) {
        this.numer_radia = numer_radia;
    }


    public String toString() {
        return "Audycje{" +
                "numer_audycji=" + numer_audycji +
                ", typ_audycji='" + typ_audycji + '\'' +
                ", czas_rozpoczecia='" + czas_rozpoczecia + '\'' +
                ", czas_zakonczenia='" + czas_zakonczenia + '\'' +
                ", numer_radia=" + numer_radia +
                '}';
    }
}
