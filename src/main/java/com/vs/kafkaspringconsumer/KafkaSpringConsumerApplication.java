package com.vs.kafkaspringconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class KafkaSpringConsumerApplication {

    public static void main(String[] args) {

        SpringApplication.run(KafkaSpringConsumerApplication.class, args);
    }
}
