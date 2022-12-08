package br.com.newapp.estrutura.strategy.ex2;

public class Compra {

	private double valor;
	private IEstrategiaPagamento estrategia;
	

	public Compra(IEstrategiaPagamento estrategia) {
		this.estrategia = estrategia;
	}

	public void pagar() {
		this.estrategia.pagar(Compra.this);
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
