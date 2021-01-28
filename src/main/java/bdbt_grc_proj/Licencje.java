package bdbt_grc_proj;

public class Licencje {

    private int numer_pozwolenia;
    private int cena;
    private String data_nabycia;
    private String data_wygasniecia;
    private int numer_radia;


    public Licencje(int numer_pozwolenia, int cena, String data_nabycia, String data_wygasniecia, int numer_radia) {
        super();
        this.numer_pozwolenia = numer_pozwolenia;
        this.cena = cena;
        this.data_nabycia = data_nabycia;
        this.data_wygasniecia = data_wygasniecia;
        this.numer_radia = numer_radia;
    }

    public Licencje() { super(); }

    public int getNumer_pozwolenia() {
        return numer_pozwolenia;
    }

    public void setNumer_pozwolenia(int numer_pozwolenia) {
        this.numer_pozwolenia = numer_pozwolenia;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getData_nabycia() {
        return data_nabycia;
    }

    public void setData_nabycia(String data_nabycia) {
        this.data_nabycia = data_nabycia;
    }

    public String getData_wygasniecia() {
        return data_wygasniecia;
    }

    public void setData_wygasniecia(String data_wygasniecia) {
        this.data_wygasniecia = data_wygasniecia;
    }

    public int getNumer_radia() {
        return numer_radia;
    }

    public void setNumer_radia(int numer_radia) {
        this.numer_radia = numer_radia;
    }

    public String toString() {
        return "Licencje{" +
                "numer_pozwolenia=" + numer_pozwolenia +
                ", cena=" + cena +
                ", data_nabycia='" + data_nabycia + '\'' +
                ", data_wygasniecia='" + data_wygasniecia + '\'' +
                ", numer_radia=" + numer_radia +
                '}';
    }
}
