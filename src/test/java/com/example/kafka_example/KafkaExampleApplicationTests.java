package com.example.kafka_example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class KafkaExampleApplicationTests {

	@Test
	void contextLoads() {
	}

}
