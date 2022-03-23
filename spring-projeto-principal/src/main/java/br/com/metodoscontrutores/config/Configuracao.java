package br.com.metodoscontrutores.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.notificador.Email;
import br.com.notificador.Notificador;

/**
 * Classe responsável por produzir e disponibilizar uma instancia de e-mail 
 * */
@Configuration
public class Configuracao {
	
	@Bean
	public Notificador email() {
		return new Email();
	}
}
