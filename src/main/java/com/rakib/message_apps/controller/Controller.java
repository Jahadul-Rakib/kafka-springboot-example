package com.rakib.message_apps.controller;

import com.rakib.message_apps.config.Constant;
import com.rakib.message_apps.model.Message;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/")
public class Controller {

    private final KafkaTemplate<String, Message> kafkaTemplate;

    public Controller(KafkaTemplate<String, Message> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("send")
    public ResponseEntity<?> postMessage(@RequestBody Message message) {
        ListenableFuture<SendResult<String, Message>> send = kafkaTemplate.send(Constant.TOPIC_CHAT, message);
        return ResponseEntity.ok().body(send);
    }

}
