package com.app.item.springbootservicioitem;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @Bean("clienteRest")
    @LoadBalanced // With this annotation we user Ribbon for the load balancing
    public RestTemplate registrarRestTemplate() {
        return new RestTemplate();
    }

}
