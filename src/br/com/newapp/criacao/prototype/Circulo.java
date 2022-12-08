package br.com.newapp.criacao.prototype;

public class Circulo extends FormaGeometrica {

	 public int raio;
	 
	public Circulo() {
		super();
	}

	public Circulo(FormaGeometrica target) {
		super(target);
		// TODO Auto-generated constructor stub
	}

	public Circulo(Circulo circulo) {
		 super(circulo);
	}

	@Override
	public FormaGeometrica clone() {
		return new Circulo(this);
	}

}
