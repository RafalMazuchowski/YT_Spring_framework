package pl.javasolution.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.javasolution.api.IPizza;
import pl.javasolution.implementation.ExoticPizza;

@Configuration
public class Config {
    @Bean
    public IPizza pizza(){
        return new ExoticPizza(17,"Egzotyczna");
    }
}
