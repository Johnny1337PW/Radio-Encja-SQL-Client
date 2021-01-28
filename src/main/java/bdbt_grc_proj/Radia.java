package bdbt_grc_proj;

public class Radia {

	private int numer_radia;
    private String obszar_nadawania;
    private String data_zalozenia;
    private int numer_adresu;


    public Radia(int numer_radia, String obszar_nadawania, String data_zalozenia, int numer_adresu) {
        super();
        this.numer_radia = numer_radia;
        this.obszar_nadawania = obszar_nadawania;
        this.data_zalozenia = data_zalozenia;
        this.numer_adresu = numer_adresu;
        
       
    }
    
    
    
    public Radia() {
        super();
    }

    public int getNumer_Radia() {
        return numer_radia;
    }

    public void setNumer_Radia(int numer_radia) {
        this.numer_radia = numer_radia;
    }

    public String getObszar_nadawania() {
        return obszar_nadawania;
    }

    public void setObszar_nadawania(String obszar_nadawania) {
        this.obszar_nadawania = obszar_nadawania;
    }

    public String getData_zalozenia() {
        return data_zalozenia;
    }

    public void setData_zalozenia(String data_zalozenia) {
        this.data_zalozenia = data_zalozenia;
    }

    public int getNumer_Adresu() {
        return numer_adresu;
    }

    public void setNumer_Adresu(int numer_adresu) {
        this.numer_adresu = numer_adresu;
    }
    
    
    
    public String toString() {
        return "Radia [Numer Radia=" + numer_radia + ", obszar nadawania=" + obszar_nadawania + ", data zalozenia=" + data_zalozenia + ", numer_adresu="
                + numer_adresu + "]";
    }

}
