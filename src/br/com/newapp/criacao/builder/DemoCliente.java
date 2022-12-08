package br.com.newapp.criacao.builder;

public class DemoCliente {

	public static void main(String[] args) {
		CarroBuilder builder = new CarroBuilder();
		CarroDirector director = new CarroDirector();
		director.constructSportsCar(builder);
		Carro carro = builder.getResult();
		System.out.println(carro);
	}
}
