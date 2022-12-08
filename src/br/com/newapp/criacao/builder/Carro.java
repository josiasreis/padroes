package br.com.newapp.criacao.builder;

public class Carro {

	    private final CarType carType;
	    private final int seats;
	    private final Engine engine;
	    private final Transmission transmission;
	    private final TripComputer tripComputer;
	    private final GPSNavigator gpsNavigator;
	    private double fuel = 0;
	    
	    public Carro(CarType carType, int seats, Engine engine, Transmission transmission,
	               TripComputer tripComputer, GPSNavigator gpsNavigator) {
	        this.carType = carType;
	        this.seats = seats;
	        this.engine = engine;
	        this.transmission = transmission;
	        this.tripComputer = tripComputer;
	        this.gpsNavigator = gpsNavigator;
	    }

		@Override
		public String toString() {
			return "Carro [carType=" + carType + ", seats=" + seats + ", engine=" + engine + ", transmission="
					+ transmission + ", tripComputer=" + tripComputer + ", gpsNavigator=" + gpsNavigator + ", fuel="
					+ fuel + "]";
		}
	    
	    
}
