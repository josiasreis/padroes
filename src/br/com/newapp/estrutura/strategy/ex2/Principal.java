package br.com.newapp.estrutura.strategy.ex2;

public class Principal {

	public static void main(String[] args) {
		Compra compra1 = new Compra(new EstrategiaPix());
		compra1.pagar();
		new Compra(new EstrategiaBoleto()).pagar();
	}
}
