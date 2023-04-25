package net.codejava.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.codejava.model.TodoValidator;

@Configuration
public class TodoConfig {
    /**
     * Tạo ra Bean TodoValidator để sử dụng sau này
     * @return
     */
    @Bean
    public TodoValidator validator() {
        return new TodoValidator();
    }
}