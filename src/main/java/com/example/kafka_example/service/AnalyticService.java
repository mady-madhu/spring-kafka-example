package com.example.kafka_example.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

@Service
public class AnalyticService {



    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;
    @KafkaListener(topics = "test-topic",groupId = "test-group")
    public void processMessage(ConsumerRecord<String,String> record, Acknowledgment acknowledgment){

        System.out.println(record);
        acknowledgment.acknowledge();
    }
}
