package circleci;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.sql.Timestamp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class DemoApplicationTest {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Test
	public void contextLoaded() {
		assertThat(jdbcTemplate, is(notNullValue()));
	}
	
	@Test
	public void dbConTest() {
		jdbcTemplate.queryForObject("select now()", Timestamp.class);
	}
}
