package dev.elder.ms_email.consumer;

import dev.elder.ms_email.dto.PedidoCreatedEvent;
import dev.elder.ms_email.dto.UserCreatedEvent;
import dev.elder.ms_email.service.EmailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class UserCreatedConsumer {

    private final EmailService emailService;

    public UserCreatedConsumer(EmailService emailService) {
        this.emailService = emailService;
    }

    @RabbitListener(queues = "user.created.queue")
    public void consumeCreatedQueue(UserCreatedEvent event) {
        emailService.sendWelcomeEmail(
                String.valueOf(event.userId()),
                event.email()
        );
    }

    @RabbitListener(queues = "user.logged.queue")
    public void consumeLoggedQueue(UserCreatedEvent event) {
        emailService.sendLoggedEmail(
                String.valueOf(event.userId()),
                event.email()
        );
    }

    @RabbitListener(queues = "pedido.email.queue")
    public void consumePedidoCreatedQueue(PedidoCreatedEvent event) {
        emailService.sendPedidoCreated(event);
    }
}
