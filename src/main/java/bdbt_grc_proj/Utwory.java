package bdbt_grc_proj;

public class Utwory {
	
	private int numer_utworu;
    private String wykonawca;
    private String tytul;
    private String album;
	
    public Utwory(int numer_utworu, String wykonawca, String tytul, String album) {
		super();
		this.numer_utworu = numer_utworu;
		this.wykonawca = wykonawca;
		this.tytul = tytul;
		this.album = album;
	}

    
    public Utwory() {
        super();
    }

    
    
	public int getNumer_utworu() {
		return numer_utworu;
	}

	public void setNumer_utworu(int numer_utworu) {
		this.numer_utworu = numer_utworu;
	}

	public String getWykonawca() {
		return wykonawca;
	}

	public void setWykonawca(String wykonawca) {
		this.wykonawca = wykonawca;
	}

	public String getTytul() {
		return tytul;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	
	public String toString() {
		return "Utwory [Numer_Utworu=" + numer_utworu + ", wykonawca=" + wykonawca + ", tytul=" + tytul + ", album="
				+ album + "]";
	}

    







}
