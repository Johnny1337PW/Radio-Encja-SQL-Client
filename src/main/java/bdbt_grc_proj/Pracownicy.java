package bdbt_grc_proj;

public class Pracownicy {

	private int numer_pracownika;
	private String imie;
	private String nazwisko;
	private String data_urodzenia;
	private String plec;
	private String data_zatrudnienia;
	private String data_zwolnienia;
	private int numer_adresu;
	private int numer_stanowiska;
	private int numer_radia;

	public Pracownicy(int numer_pracownika, String imie, String nazwisko, String data_urodzenia, String plec,
			String data_zatrudnienia, String data_zwolnienia, int numer_adresu, int numer_stanowiska, int numer_radia) {
		this.numer_pracownika = numer_pracownika;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.data_urodzenia = data_urodzenia;
		this.plec = plec;
		this.data_zatrudnienia = data_zatrudnienia;
		this.data_zwolnienia = data_zwolnienia;
		this.numer_adresu = numer_adresu;
		this.numer_stanowiska = numer_stanowiska;
		this.numer_radia = numer_radia;

	}

	public Pracownicy() {
		super();
	}

	public int getNumer_pracownika() {
		return numer_pracownika;
	}

	public void setNumer_pracownika(int numer_pracownika) {
		this.numer_pracownika = numer_pracownika;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getData_urodzenia() {
		return data_urodzenia;
	}

	public void setData_urodzenia(String data_urodzenia) {
		this.data_urodzenia = data_urodzenia;
	}

	public String getPlec() {
		return plec;
	}

	public void setPlec(String plec) {
		this.plec = plec;
	}

	public String getData_zatrudnienia() {
		return data_zatrudnienia;
	}

	public void setData_zatrudnienia(String data_zatrudnienia) {
		this.data_zatrudnienia = data_zatrudnienia;
	}

	public String getData_zwolnienia() {
		return data_zwolnienia;
	}

	public void setData_zwolnienia(String data_zwolnienia) {
		this.data_zwolnienia = data_zwolnienia;
	}

	public int getNumer_adresu() {
		return numer_adresu;
	}

	public void setNumer_adresu(int numer_adresu) {
		this.numer_adresu = numer_adresu;
	}

	public int getNumer_stanowiska() {
		return numer_stanowiska;
	}

	public void setNumer_stanowiska(int numer_stanowiska) {
		this.numer_stanowiska = numer_stanowiska;
	}

	public int getNumer_radia() {
		return numer_radia;
	}

	public void setNumer_radia(int numer_radia) {
		this.numer_radia = numer_radia;
	}

	public String toString() {
		return "Pracownicy{" + "numer_pracownika=" + numer_pracownika + ", imie='" + imie + '\'' + ", nazwisko='"
				+ nazwisko + '\'' + ", data_urodzenia='" + data_urodzenia + '\'' + ", plec='" + plec + '\''
				+ ", data_zatrudnienia='" + data_zatrudnienia + '\'' + ", data_zwolnienia='" + data_zwolnienia + '\''
				+ ", numer_adresu=" + numer_adresu + ", numer_stanowiska=" + numer_stanowiska + ", numer_radia="
				+ numer_radia + '}';
	}
}
