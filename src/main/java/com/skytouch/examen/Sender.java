package com.skytouch.examen;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("sender")
@Component
public class Sender implements CommandLineRunner {

    @Value("${counter}")
    private int counter;

    private final RabbitTemplate rabbitTemplate;
    private final ConfigurableApplicationContext context;

    public Sender(RabbitTemplate rabbitTemplate,
                  ConfigurableApplicationContext context) {
        this.rabbitTemplate = rabbitTemplate;
        this.context = context;
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < counter; i++) {
            System.out.println("Sending message... " + i);
            CustomObject co = new CustomObject();
            co.build();
            rabbitTemplate.convertAndSend(RabbitExamApplication.queueName, co);
        }
        context.close();
    }
}
