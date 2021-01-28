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
public class AudycjeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public AudycjeDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Audycje> list() {
		String sql = "SELECT * FROM Audycje ";
		List<Audycje> listAudycje = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Audycje.class));
		return listAudycje;
	}

	public void save(Audycje audycje) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("Audycje").usingColumns("Numer_Audycji", "Typ_Audycji", "Czas_rozpoczecia",
				"Czas_zakonczenia");
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(audycje);
		insertActor.execute(param);
	}

	public Audycje get(int id) {
		Object[] args = { id };
		String sql = "SELECT * FROM Audycje WHERE Numer_Audycji=" + args[0];
		Audycje audycje = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Audycje.class));

		return audycje;
	}

	public void update(Audycje audycje) {
		String sql = "UPDATE Audycje SET typ_audycji=:typ_audycji, czas_rozpoczecia=:czas_rozpoczecia, czas_zakonczenia=:czas_zakonczenia WHERE Numer_Audycji=:Numer_audycji";
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(audycje);
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);

		template.update(sql, param);
	}

	public void delete(int numer_audycji) {
		String sql = "DELETE FROM Audycje WHERE Numer_Audycji =: Numer_audycji";
		jdbcTemplate.update(sql, numer_audycji);

	}

}
