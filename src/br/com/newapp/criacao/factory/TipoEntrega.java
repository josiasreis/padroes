package br.com.newapp.criacao.factory;

import br.com.newapp.estrutura.strategy.ex1.EstrategiaEntregaMoto;
import br.com.newapp.estrutura.strategy.ex1.IEstrategia;

public enum TipoEntrega {
	CARRO,MOTO;
	
	public IEstrategia getStrategy() throws EntregaNaoSuportadaException{
		IVeiculo veiculo = VeiculoFactory.criarVeiculo(this);
		IEstrategia estrategia = null;
		if(this.equals(CARRO)) {
			estrategia = new EstrategiaEntregaMoto();
		}else if(this.equals(MOTO)) {
			estrategia = new EstrategiaEntregaMoto();
		}
		estrategia.setVeiculo(veiculo);
		return estrategia;
	}
}
