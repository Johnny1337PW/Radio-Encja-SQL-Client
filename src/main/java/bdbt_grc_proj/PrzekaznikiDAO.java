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
public class PrzekaznikiDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public PrzekaznikiDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }
    public List<Przekazniki> list() {
        String sql = "SELECT * FROM Przekazniki ";
        List<Przekazniki> listPrzekazniki = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Przekazniki.class));
        return listPrzekazniki;
    }


    public void save(Przekazniki przekazniki) {
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName("Przekazniki").usingColumns("Numer_Przekaznika", "Moc", "Czestotliwosc",
                "Numer_Adresu");
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(przekazniki);
        insertActor.execute(param);
    }
    public Przekazniki get(int id) {
        Object[] args = { id };
        String sql = "SELECT * FROM Przekazniki WHERE Numer_Przekaznika=" + args[0];
        Przekazniki przekazniki = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Przekazniki.class));

        return przekazniki;
    }

    public void update(Przekazniki przekazniki) {
        String sql = "UPDATE Przekazniki SET moc=:moc, czestotliwosc=:czestotliwosc, numer_adresu=:numer_adresu WHERE Numer_Przekaznika=:Numer_przekaznika";
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(przekazniki);
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);

        template.update(sql, param);
    }
    public void delete(int numer_przekaznika) {
        String sql = "DELETE FROM Przekazniki WHERE Numer_Przekaznika =: Numer_przekaznika";
        jdbcTemplate.update(sql, numer_przekaznika);

    }
}
