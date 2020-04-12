package com.app.usuarios.springbootserviciousuarios;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

@EntityScan({"com.app.usuarios.commons.springbootserviciousuarioscommons.models.entity"})
@SpringBootApplication
public class SpringbootServicioUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioUsuariosApplication.class, args);
	}

	@Bean
	public ApplicationRunner runner(AmqpTemplate template) {
		return args -> template.convertAndSend("myqueue", "foo");
	}

	@Bean
	public Queue myQueue() {
		return new Queue("myqueue");
	}

	@RabbitListener(queues = "myqueue")
	public void listen(String in) {
		System.out.println(in);
	}
}
