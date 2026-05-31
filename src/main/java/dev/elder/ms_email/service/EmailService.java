package dev.elder.ms_email.service;

import org.springframework.mail.SimpleMailMessage;
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

}
