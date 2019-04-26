package br.cesed.si.map.spring.exemplo1.sample2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
 
@Configuration
@ComponentScan(value={"br.cesed.si.map.spring.exemplo1.sample2"})
public class DIConfiguration {
 
    @Bean
    public MessageService getMessageService(){
        return new EmailService();
    }
}