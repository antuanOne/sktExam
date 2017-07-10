package com.skytouch.examen;

import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.support.converter.MessageConverter;

public class Consumer implements MessageListener {
    private MessageConverter converter;
    public Consumer(MessageConverter converter) {
        this.converter = converter;
    }

    @Override
    public void onMessage(Message message) {
        CustomObject objectFromQueue = (CustomObject) converter.fromMessage(message);
        System.out.println("Received <" + objectFromQueue.toString() + ">");
    }
}
