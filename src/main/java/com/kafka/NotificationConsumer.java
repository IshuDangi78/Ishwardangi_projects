package com.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumer {
    @KafkaListener(topics = "order_topic", groupId = "notification_group")
    public void handleOrderUpdate(String message) {
        System.out.println("Received Message: " + message);
    }
}
