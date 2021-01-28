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
public class LicencjeDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public LicencjeDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Licencje> list() {
        String sql = "SELECT * FROM Licencje ";
        List<Licencje> listLicencje = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Licencje.class));
        return listLicencje;
    }
    public void save(Licencje licencje) {
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName("Licencje").usingColumns("Numer_Pozwolenia", "Cena", "Data_nabycia","Data_wygasniecia");
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(licencje);
        insertActor.execute(param);
    }

    public Licencje get(int id) {
        Object[] args = { id };
        String sql = "SELECT * FROM Licencje WHERE Numer_Pozwolenia=" + args[0];
        Licencje licencje = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Licencje.class));

        return licencje;
    }
    public void update(Licencje licencje) {
        String sql = "UPDATE Licencje SET cena=:cena, data_nabycia=:data_nabycia, data_wygasniecia=:data_wygasniecia WHERE Numer_Pozwolenia=:Numer_pozwolenia";
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(licencje);
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);

        template.update(sql, param);
    }
    public void delete(int numer_pozwolenia) {
        String sql = "DELETE FROM Licencje WHERE Numer_Pozwolenia =: Numer_pozwolenia";
        jdbcTemplate.update(sql,numer_pozwolenia);

    }

}
