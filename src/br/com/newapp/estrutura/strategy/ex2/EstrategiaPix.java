package br.com.newapp.estrutura.strategy.ex2;

public class EstrategiaPix implements IEstrategiaPagamento{

	@Override
	public void pagar(Compra compra) {
		System.out.println("pagando via pix o valor de" + compra.getValor());
	}

}
