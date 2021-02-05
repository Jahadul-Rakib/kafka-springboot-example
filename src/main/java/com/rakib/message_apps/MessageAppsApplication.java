package com.rakib.message_apps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class MessageAppsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessageAppsApplication.class, args);
    }

}
