package br.com.newapp.estrutura.strategy.ex2;

/**
 * 
 * @author User
 *
 */
public class EstrategiaBoleto implements IEstrategiaPagamento {

	@Override
	public void pagar(Compra compra) {
		System.out.println("pagando via boleto o valor de " + compra.getValor());
	}

}
