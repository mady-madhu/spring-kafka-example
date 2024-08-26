package com.example.kafka_example;

import org.springframework.boot.SpringApplication;

public class TestKafkaExampleApplication {

	public static void main(String[] args) {
		SpringApplication.from(KafkaExampleApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
