package br.com.newapp.criacao.builder;

public class Engine {

	  private final double volume;
	    private double mileage;
	    private boolean started;
	    
	    public Engine(double volume, double mileage) {
	        this.volume = volume;
	        this.mileage = mileage;
	    }
	    
		public double getMileage() {
			return mileage;
		}
		public void setMileage(double mileage) {
			this.mileage = mileage;
		}
		public boolean isStarted() {
			return started;
		}
		public void setStarted(boolean started) {
			this.started = started;
		}
		public double getVolume() {
			return volume;
		}
	    
	
	
}
