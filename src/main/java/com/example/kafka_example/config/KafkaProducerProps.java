package com.example.kafka_example.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
public class KafkaProducerProps {

    @Value("${spring.kafka.bootstrapServers}")
    private String bootstrapUrl;

    @Value("${spring.kafka.producer.topicName}")
    private String topicName;

}
