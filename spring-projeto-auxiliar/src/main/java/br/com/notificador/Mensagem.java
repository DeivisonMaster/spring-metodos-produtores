package br.com.notificador;

public class Mensagem {

	private String assunto;
	private String msg;

	public Mensagem(String assunto, String msg) {
		this.assunto = assunto;
		this.msg = msg;
	}
	
	@Override
	public String toString() {
		return "Mensagem [assunto=" + this.assunto + ", mensagem=" + this.msg + "]";
	}
	

}
