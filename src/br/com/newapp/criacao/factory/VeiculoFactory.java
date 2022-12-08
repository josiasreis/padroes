package br.com.newapp.criacao.factory;

import java.util.Date;

public class VeiculoFactory {

	public static IVeiculo criarVeiculo(TipoEntrega tipoEntrega) throws EntregaNaoSuportadaException {
		if(TipoEntrega.CARRO.equals(tipoEntrega)) {
			Carro c = new Carro();
			long milisegundosCorrente = new Date().getTime();
			c.setId(milisegundosCorrente + "C");
			c.setNivelGasolina(51);
			return c;
		}else if(TipoEntrega.MOTO.equals(tipoEntrega)) {
			Moto c = new Moto();
			long milisegundosCorrente = new Date().getTime();
			c.setNivelGasolina(11);
			c.setId(milisegundosCorrente + "M");
			return c;
		}else {
			throw new EntregaNaoSuportadaException();
		}
	}
}
