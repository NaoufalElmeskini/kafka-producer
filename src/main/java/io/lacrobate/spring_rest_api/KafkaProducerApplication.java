package io.lacrobate.spring_rest_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class KafkaProducerApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(KafkaProducerApplication.class, args);
    }
}