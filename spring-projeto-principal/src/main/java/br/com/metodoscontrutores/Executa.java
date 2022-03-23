package br.com.metodoscontrutores;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.com.metodoscontrutores.model.Usuario;
import br.com.metodoscontrutores.servico.UsuarioServico;

public class Executa {
	public static void main(String[] args) {
		
		// recupera o contexto dos pacotes das classes para projeto não web
		AnnotationConfigApplicationContext appContext = 
				new AnnotationConfigApplicationContext(Executa.class.getPackage().getName());
		
		Usuario usuario = new Usuario("Deivison");
		
		// carregando a implementação do bean UsuarioServico gerenciado pelo Spring
		UsuarioServico servico = appContext.getBean(UsuarioServico.class);
		servico.cadastrar(usuario);
		
	}
}
