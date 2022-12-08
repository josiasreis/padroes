package br.com.newapp.criacao.singleton.unsafedthread;

import br.com.newapp.criacao.singleton.Carro;

public class FabricaCarrosSingleton {

	private static Carro carro;
	
	private FabricaCarrosSingleton() {
		
	}

	public static Carro getInstance() {
		if(carro == null) {
			carro = new Carro();
		}
		return carro;
	}
	
}
