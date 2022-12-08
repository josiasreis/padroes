package br.com.newapp.estrutura.strategy.ex1;

import br.com.newapp.criacao.factory.IVeiculo;

public interface IEstrategia {

	void entregar();
	void setVeiculo(IVeiculo veiculo);
}
