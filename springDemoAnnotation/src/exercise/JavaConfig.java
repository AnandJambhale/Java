package exercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("exercice")
public class JavaConfig {
        @Bean
        public Coach battingcoach(){

            BadFortuneService badFortuneService = new BadFortuneService; return badFortuneService;
        }
}
