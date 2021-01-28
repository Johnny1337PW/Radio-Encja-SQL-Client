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
public class StanowiskaDAO {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    public StanowiskaDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }
    public List<Stanowiska> list() {
        String sql = "SELECT * FROM Stanowiska ";
        List<Stanowiska> listStanowiska = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Stanowiska.class));
        return listStanowiska;
    }
    public void save(Stanowiska stanowiska) {
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName("Stanowiska").usingColumns("Numer_Stanowiska", "Nazwa_Stanowiska", "Opis_Stanowiska");
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(stanowiska);
        insertActor.execute(param);
    }
    public Stanowiska get(int id) {
        Object[] args = { id };
        String sql = "SELECT * FROM Stanowiska WHERE Numer_Stanowiska=" + args[0];
        Stanowiska stanowiska = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Stanowiska.class));

        return stanowiska;
    }

    public void update(Stanowiska stanowiska) {
        String sql = "UPDATE Stanowiska SET numer_stanowiska=:numer_stanowiska, nazwa_stanowiska=:nazwa_stanowiska, opis_stanowiska=:opis_stanowiska WHERE Numer_Stanowiska=:Numer_stanowiska";
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(stanowiska);
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);

        template.update(sql, param);
    }

    public void delete(int numer_stanowiska) {
        String sql = "DELETE FROM Stanowiska WHERE Numer_Stanowiska =: Numer_stanowiska";
        jdbcTemplate.update(sql, numer_stanowiska);

    }

    
    
    
}
