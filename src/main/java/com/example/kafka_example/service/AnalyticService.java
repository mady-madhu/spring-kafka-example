package com.example.kafka_example.service;

import com.example.kafka_example.config.KafkaProducerProps;
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
    private KafkaTemplate<String,Object> kafkaTemplate;


    @Autowired
    private KafkaProducerProps kafkaProducerProps;



    //using spring SpEL fetching props

    @KafkaListener(topics = "#{kafkaConsumerProps.topicName}", groupId = "#{kafkaConsumerProps.groupId}")
    public void processMessage(ConsumerRecord<String,String> record, Acknowledgment acknowledgment){

        System.out.println(record);
        kafkaTemplate.send(kafkaProducerProps.getTopicName(), record.value());
        acknowledgment.acknowledge();
    }
}
