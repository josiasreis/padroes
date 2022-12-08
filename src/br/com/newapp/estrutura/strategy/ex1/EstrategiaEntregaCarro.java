package br.com.newapp.estrutura.strategy.ex1;

import br.com.newapp.criacao.factory.IVeiculo;

public class EstrategiaEntregaCarro implements IEstrategia {

private IVeiculo veiculo;
	
	@Override
	public void entregar() {
		if(veiculo.temGasolina()) {
			System.out.println("entregando de moto com id" + veiculo.getId());
		}
	}

	@Override
	public void setVeiculo(IVeiculo veiculo) {
		this.veiculo = veiculo;
	}

}
