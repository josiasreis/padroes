package br.com.newapp.estrutura.strategy.ex3;

public class Principal {

	public static void main(String[] args) {
		Mensagem mensagem1 = new Mensagem();
		mensagem1.setRemetente("josias");
		mensagem1.setDestinatario("galinha");
		
		Mensagem mensagem2 = new Mensagem();
		mensagem2.setRemetente("galinha");
		mensagem2.setDestinatario("josias");
		
		new EstrategiaNotificacaoSMS().enviar(mensagem1);
		new EstrategiaNotificacaoSMS().enviar(mensagem2);
		
		new EstrategiaNotificacaoWhatsApp().enviar(mensagem2);
	}
}
