package br.com.newapp.criacao.singleton.unsafedthread;

import br.com.newapp.criacao.singleton.Carro;

public class Principal {

	public static void main(String[] args) {
		Carro carro = FabricaCarrosSingleton.getInstance();
		System.out.println(carro);
	}
}
