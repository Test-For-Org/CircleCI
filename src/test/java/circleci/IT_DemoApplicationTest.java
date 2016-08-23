package circleci;

import org.junit.Test;

import static org.junit.Assert.assertThat;

import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import circleci.DemoApplication;
import circleci.controller.CircleController;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class IT_DemoApplicationTest {
	
	@Autowired
	CircleController controller;
	
	@Test
	public void contextLoaded() {
		assertThat(controller, is(notNullValue()));
	}
}
