package com.example.kafka_example.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
public class KafkaConsumerProps {

    @Value("${spring.kafka.bootstrapServers}")
    private String bootstrapUrl;

    @Value("${spring.kafka.consumer.groupId}")
    private String groupId;

    @Value("${spring.kafka.consumer.topicName}")
    private String topicName;

}
