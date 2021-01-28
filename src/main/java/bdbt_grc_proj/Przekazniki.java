package bdbt_grc_proj;

public class Przekazniki {

    private int numer_przekaznika;
    private int moc;
    private int czestotliwosc;
    private int numer_adresu;
    private int numer_radia;

    public Przekazniki(int numer_przekaznika, int moc, int czestotliwosc, int numer_adresu, int numer_radia) {
        super();
        this.numer_przekaznika = numer_przekaznika;
        this.moc = moc;
        this.czestotliwosc = czestotliwosc;
        this.numer_adresu = numer_adresu;
        this.numer_radia = numer_radia;
    }

    public Przekazniki() { super(); }

    public int getNumer_przekaznika() {
        return numer_przekaznika;
    }

    public void setNumer_przekaznika(int numer_przekaznika) {
        this.numer_przekaznika = numer_przekaznika;
    }

    public int getMoc() {
        return moc;
    }

    public void setMoc(int moc) {
        this.moc = moc;
    }

    public int getCzestotliwosc() {
        return czestotliwosc;
    }

    public void setCzestotliwosc(int czestotliwosc) {
        this.czestotliwosc = czestotliwosc;
    }

    public int getNumer_adresu() {
        return numer_adresu;
    }

    public void setNumer_adresu(int numer_adresu) {
        this.numer_adresu = numer_adresu;
    }

    public int getNumer_radia() {
        return numer_radia;
    }

    public void setNumer_radia(int numer_radia) {
        this.numer_radia = numer_radia;
    }


    public String toString() {
        return "Przekazniki{" +
                "numer_przekaznika=" + numer_przekaznika +
                ", moc=" + moc +
                ", czestotliwosc=" + czestotliwosc +
                ", numer_adresu=" + numer_adresu +
                ", numer_radia=" + numer_radia +
                '}';
    }
}
