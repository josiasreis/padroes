package br.com.newapp.estrutura.strategy.ex3;

public class EstrategiaNotificacaoSMS implements IEstrategiaNotificacao {

	@Override
	public void enviar(Mensagem mensagem) {
		System.out.println("enviando mensagem de " + mensagem.getRemetente() + " para " + mensagem.getDestinatario() + " via SMS");
	}

}
