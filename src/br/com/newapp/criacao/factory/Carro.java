package br.com.newapp.criacao.factory;

import java.util.List;

/**
 * a entrega do carro deve ter o chassi setado pelo milisegundo corrente mais a letra c
 * 
 * @author User
 *
 */
public class Carro extends IVeiculo{

	private List<String> produtos;
	
	public List<String> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<String> produtos) {
		this.produtos = produtos;
	}
	
	@Override
	public String toString() {
		return this.getId();
	}
	@Override
	public boolean temGasolina() {
		return this.getNivelGasolina() > 50;
	}
}
