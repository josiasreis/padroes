package br.com.newapp.estrutura.strategy.ex1;

import br.com.newapp.criacao.factory.IVeiculo;

public class EstrategiaEntregaMoto implements IEstrategia{

	private IVeiculo veiculo;
	
	@Override
	public void entregar() {
		if(veiculo.temGasolina()) {
			System.out.println("entregando de moto com id" + veiculo.getId());
		}else{
			System.out.println("veiculo sem gasolina");
		}
	}

	public IVeiculo getVeiculo() {
		return veiculo;
	}

	@Override
	public void setVeiculo(IVeiculo veiculo) {
		this.veiculo = veiculo;
	}

}
