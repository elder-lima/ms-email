package dev.elder.ms_email.service;

import dev.elder.ms_email.dto.Itens;
import dev.elder.ms_email.dto.PedidoCreatedEvent;
//import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private final JavaMailSender mailSender;

    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendWelcomeEmail(
            String userId,
            String email
    ) {

//        SimpleMailMessage message = new SimpleMailMessage();
//
//        message.setTo(email);
//        message.setSubject("Cadastro realizado com Sucesso!");
//        message.setText(
//                "Seja bem vindo(a)! \nAgradecemos o seu cadastro, aproveite agora todos os recursos da nossa plataforma! \nUserId: "+userId
//        );
//
//        mailSender.send(message);

        System.out.println("========== EMAIL DE BEM VINDO ==========");
        System.out.println("Para: " + email);
        System.out.println("UserId: " + userId);
        System.out.println("===========================");

    }

    public void sendLoggedEmail(
            String userId,
            String email
    ) {

//        SimpleMailMessage message = new SimpleMailMessage();
//
//        message.setTo(email);
//        message.setSubject("Login realizado com Sucesso!");
//        message.setText(
//                "Novo Login Identificado \nUserId: "+userId
//        );
//
//        mailSender.send(message);

        System.out.println("========== EMAIL DE LOGADO  ==========");
        System.out.println("Email: " + email);
        System.out.println("UserId: " + userId);
        System.out.println("===========================");


    }

    public void sendPedidoCreated(PedidoCreatedEvent event) {
        System.out.println("========== PEDIDO CRIADO  ==========");
        System.out.println("UserId: "+event.userId());
        System.out.println("Email: " + event.email());
        System.out.println("PedidoId: " + event.pedidoId());
        System.out.println("==Itens Pedido: ==");
        for (Itens item : event.itens()) {
            System.out.println("ProdutoId:"+item.produtoId());
            System.out.println("Nome Produto:"+item.nome());
            System.out.println("Preço: "+item.preco());
            System.out.println("Quantidade: "+item.quantidade());
            System.out.println("====");
        }
        System.out.println("Total: "+event.total());
        System.out.println("===========================");
    }

}
