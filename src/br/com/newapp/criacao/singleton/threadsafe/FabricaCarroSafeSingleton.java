package br.com.newapp.criacao.singleton.threadsafe;

import br.com.newapp.criacao.singleton.Carro;

public class FabricaCarroSafeSingleton {
	
private static Carro carro;
	
	private FabricaCarroSafeSingleton() {
		
	}

	public static Carro getInstance() {
		if(carro == null) {
			synchronized (carro) {
				carro = new Carro();
			}
		}
		return carro;
	}

}
