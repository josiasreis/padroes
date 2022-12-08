package br.com.newapp.criacao.factory;

public abstract class IVeiculo {

	private String id;
	private Integer nivelGasolina;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getNivelGasolina() {
		return nivelGasolina;
	}

	public void setNivelGasolina(Integer nivelGasolina) {
		this.nivelGasolina = nivelGasolina;
	}
	
	public abstract boolean temGasolina();
}
