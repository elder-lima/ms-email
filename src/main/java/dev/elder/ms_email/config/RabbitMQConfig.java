package dev.elder.ms_email.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue userCreatedQueue() {
        return new Queue("user.created.queue");
    }

    @Bean
    public Queue userLoggedQueue() {
        return new Queue("user.logged.queue");
    }

    @Bean
    public Queue pedidoEmailQueue() {
        return new Queue("pedido.email.queue");
    }

    @Bean
    public TopicExchange pedidoExchange() {
        return new TopicExchange("pedido.exchange");
    }

    @Bean
    public Binding pedidoEmailBinding(Queue pedidoEmailQueue, TopicExchange pedidoExchange) {
        return BindingBuilder
                .bind(pedidoEmailQueue)
                .to(pedidoExchange)
                .with("pedido.criado");
    }

    @Bean
    public Jackson2JsonMessageConverter messageConverter() {
        return new Jackson2JsonMessageConverter();
    }

}
