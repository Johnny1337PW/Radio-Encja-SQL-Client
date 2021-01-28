package bdbt_grc_proj;

public class Stanowiska {

    private int numer_stanowiska;
    private String nazwa_stanowiska;
    private String opis_stanowiska;

    public Stanowiska(int numer_stanowiska, String nazwa_stanowiska, String opis_stanowiska) {
        super();
        this.numer_stanowiska = numer_stanowiska;
        this.nazwa_stanowiska = nazwa_stanowiska;
        this.opis_stanowiska = opis_stanowiska;
    }

    public Stanowiska() { super(); }

    public int getNumer_stanowiska() {
        return numer_stanowiska;
    }

    public void setNumer_stanowiska(int numer_stanowiska) {
        this.numer_stanowiska = numer_stanowiska;
    }

    public String getNazwa_stanowiska() {
        return nazwa_stanowiska;
    }

    public void setNazwa_stanowiska(String nazwa_stanowiska) {
        this.nazwa_stanowiska = nazwa_stanowiska;
    }

    public String getOpis_stanowiska() {
        return opis_stanowiska;
    }

    public void setOpis_stanowiska(String opis_stanowiska) {
        this.opis_stanowiska = opis_stanowiska;
    }


    public String toString() {
        return "Stanowiska{" +
                "numer_stanowiska=" + numer_stanowiska +
                ", nazwa_stanowiska='" + nazwa_stanowiska + '\'' +
                ", opis_stanowiska='" + opis_stanowiska + '\'' +
                '}';
    }
}
