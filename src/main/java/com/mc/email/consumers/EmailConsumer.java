package com.mc.email.consumers;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.mc.email.dtos.EmailDto;
import com.mc.email.services.EmailService;

@Component
public class EmailConsumer {
    
    @Autowired
    private EmailService emailService;

    @RabbitListener(queues = "${spring.rabbitmq.template.queue}")
    public void listen(@Payload EmailDto emailDto){
        emailService.sendEmail(emailDto.convertToEmailModel());
    }
}
