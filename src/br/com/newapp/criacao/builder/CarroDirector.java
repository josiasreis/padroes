package br.com.newapp.criacao.builder;

public class CarroDirector {

	 public void constructSportsCar(CarroBuilder builder) {
	        builder.setCarType(CarType.SPORTS_CAR);
	        builder.setSeats(2);
	        builder.setEngine(new Engine(3.0, 0));
	        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
	        builder.setTripComputer(new TripComputer());
	        builder.setGPSNavigator(new GPSNavigator());
	    }
}
