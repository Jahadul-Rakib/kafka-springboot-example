package com.rakib.message_apps.util_service;

import com.rakib.message_apps.config.Constant;
import com.rakib.message_apps.model.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerData {

    @KafkaListener(topics = Constant.TOPIC_CHAT,
            groupId = Constant.CONSUMER_GROUP,
            containerFactory = "messageListenerContainerFactory")
    public void listenTopic(Message message) {
        System.out.println(message);
    }
}
