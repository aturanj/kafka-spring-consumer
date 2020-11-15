package com.vs.kafkaspringconsumer.service;

import com.vs.model.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "messages-topic", groupId = "messages_group_id")
    public void consume(Message message) {
        System.out.println("Consuming the message : " + message.getMessage());
    }
}
