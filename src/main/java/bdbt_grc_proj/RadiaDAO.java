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
public class RadiaDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public RadiaDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Radia> list() {
		String sql = "SELECT * FROM Radia ";
		List<Radia> listRadia = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Radia.class));
		return listRadia;
	}

	public void save(Radia radia) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("Radia").usingColumns("Numer_Radia", "Obszar_nadawania", "Data_zalozenia",
				"Numer_Adresu");
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(radia);
		insertActor.execute(param);
	}

	/* Odczytaj */
	public Radia get(int id) {
		Object[] args = { id };
		String sql = "SELECT * FROM Radia WHERE Numer_Radia=" + args[0];
		Radia radia = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Radia.class));

		return radia;
	}

	/* Zapisz */

	public void update(Radia radia) {
		String sql = "UPDATE Radia SET obszar_nadawania=:obszar_nadawania, data_zalozenia=:data_zalozenia WHERE Numer_Radia=:Numer_Radia";
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(radia);
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);

		template.update(sql, param);
	}

	/* Usun */

	public void delete(int numer_radia) {
		String sql = "DELETE FROM Radia WHERE Numer_Radia =: Numer_Radia";
		jdbcTemplate.update(sql, numer_radia);
		
	}

}
