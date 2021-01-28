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
public class UtworyDAO {


	@Autowired
	private JdbcTemplate jdbcTemplate;

	public UtworyDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Utwory> list() {
		String sql = "SELECT * FROM Utwory ";
		List<Utwory> listUtwory = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Utwory.class));
		return listUtwory;
	}
	
	
	
	public void save(Utwory utwory) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("Utwory").usingColumns("Numer_Utworu", "Wykonawca", "Tytul",
				"Album");
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(utwory);
		insertActor.execute(param);
	}

	
	public Utwory get(int id) {
		Object[] args = { id };
		String sql = "SELECT * FROM Utwory WHERE Numer_Utworu=" + args[0];
		Utwory utwory = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Utwory.class));

		return utwory;
	}
	
	public void update(Utwory utwory) {
		String sql = "UPDATE Utwory SET wykonawca=:wykonawca, tytul=:tytul, album=:album WHERE Numer_Utworu=:Numer_utworu";
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(utwory);
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);

		template.update(sql, param);
	}
	
	public void delete(int numer_utworu) {
		String sql = "DELETE FROM Utwory WHERE Numer_Utworu =: Numer_utworu";
		jdbcTemplate.update(sql, numer_utworu);
		
	}
}
