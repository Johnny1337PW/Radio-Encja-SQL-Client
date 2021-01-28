package bdbt_grc_proj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
public class PracownicyDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public PracownicyDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Pracownicy> list() {
		String sql = "SELECT * FROM Pracownicy ";
		List<Pracownicy> listPracownicy = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Pracownicy.class));
		return listPracownicy;
	}

	public void save(Pracownicy pracownicy) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("Pracownicy").usingColumns("Numer_Pracownika", "Imie", "Nazwisko", "Data_Urodzenia",
				"Plec", "Data_Zatrudnienia", "Data_Zwolnienia", "Numer_Adresu", "Numer_Stanowiska");
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(pracownicy);
		insertActor.execute(param);
	}

	/* Odczytaj */
	public Pracownicy get(int id) {
		Object[] args = { id };
		String sql = "SELECT * FROM Pracownicy WHERE Numer_Pracownika=" + args[0];
		Pracownicy pracownicy = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Pracownicy.class));

		return pracownicy;
	}

	/* Zapisz */

	public void update(Pracownicy pracownicy) {
		String sql = "UPDATE Pracownicy SET imie=:imie, nazwisko=:nazwisko, data_urodzenia=:data_urodzenia, plec=:plec, data_zatrudnienia=:data_zatrudnienia, numer_adresu=:numer_adresu, numer_stanowiska=:numer_stanowiska WHERE Numer_pracownika=:Numer_pracownika";
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(pracownicy);
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);

		template.update(sql, param);
	}

	/* Usun */

	public void delete(int numer_pracownika) {
		String sql = "DELETE FROM Pracownicy WHERE Numer_Pracownika =: Numer_pracownika";
		jdbcTemplate.update(sql, numer_pracownika);

	}

}
