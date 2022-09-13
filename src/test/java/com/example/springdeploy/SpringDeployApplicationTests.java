package com.example.springdeploy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class SpringDeployApplicationTests {

	@Test
	void contextLoads() {
		// Obtener variables de entorno del SO
		System.getenv().forEach(
				(key, value) -> System.out.println(key + " -> " + value)
		);
	}

}
