package circleci;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import circleci.DemoApplication;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class TestDemoApplication {
	
	@Test
	public void contextLoaded() {
		
	}
}
