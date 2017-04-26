package sails.factory.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import sails.components.service.MessageService;


@Configuration
@Import(DataSourceConfig.class)
@ComponentScan("sails.components")
public class ApplicationConfiguration {

    @Bean(name = "componentOne")
    MessageService messageServiceImpl() {
        return new MessageService() {
            public void printMessage() {
                System.out.println("Message from MessageService interface implementation component 1");
            }
        };
    }

    @Bean(name = "componentTwo")
    MessageService messageServiceImpl2() {
        return new MessageService() {
            public void printMessage() {
                System.out.println("Message from MessageService interface implementation component 2");
            }
        };
    }

}
