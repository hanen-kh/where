package where.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import where.services.servicesIMPL.EmailService;

@Configuration
public class EmailConfig {
    @Bean
    public EmailService emailService() {
        return new EmailService();
    }
}
