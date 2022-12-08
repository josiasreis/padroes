package br.com.newapp.criacao.factory;

/**
 * a placa tem que ser calculada os milisegundos corrente + a letra M
 * @author User
 *
 */
public class Moto extends IVeiculo{

	
	private String produto;
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	
	@Override
	public String toString() {
		return this.getId();
	}
	@Override
	public boolean temGasolina() {
		return this.getNivelGasolina() > 10;
	}

}
