package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.EmailService;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.beans.MessageSender;

public class SpringDiApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld bean = context.getBean(HelloWorld.class);
        System.out.println(bean.getMessage());
        System.out.println("Hello Spring");

        EmailService emailService = context.getBean(EmailService.class);
        emailService.send();
        System.out.println("-----Zadanie 4-----");
        MessageSender messageSender = context.getBean(MessageSender.class);
        messageSender.sendMessage();

        System.out.println("-----Zadanie 5-----");
        messageSender.sendMessageFromProperty();
        context.close();
    }
}
