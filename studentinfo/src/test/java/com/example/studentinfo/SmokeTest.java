package com.example.studentinfo;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
public class SmokeTest extends StudentinfoApplicationTests {
	GreetingController gre = new GreetingController();
			
						
	@Test
	void contextLoads() {
		assertThat(gre).isNotNull();
		
		

}
}
