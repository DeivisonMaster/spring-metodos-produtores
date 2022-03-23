package br.com.metodoscontrutores.servico.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.metodoscontrutores.model.Usuario;
import br.com.metodoscontrutores.servico.UsuarioServico;
import br.com.notificador.Mensagem;
import br.com.notificador.Notificador;

@Service
public class UsuarioServicoImpl implements UsuarioServico{
	
	@Autowired
	private Notificador notificador;

	@Override
	public void cadastrar(Usuario usuario) {
		System.out.println("Novo usuario: " + usuario);
		
		notificador.notificar(new Mensagem("Bem-vindo!", "Olá"));
	}
	
}
