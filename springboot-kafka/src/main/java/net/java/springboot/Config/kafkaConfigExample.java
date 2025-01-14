package net.java.springboot.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaConfigExample {

    @Bean
    public NewTopic javaTopic() {
        return TopicBuilder.name("javaexample").build();
    }

    @Bean
    public NewTopic javaJsonTopic() {
        return TopicBuilder.name("javaexample_json").build();
    }
}
