package patterns.builderpattern;

public class Car {

	private String bodyStyle;
	private String power;
	private String engine;
	private String breaks;
	private String seats;
	private String window;
	private String fuelType;
	private String carType;

	public Car(String carType) {
		this.carType = carType;

	}

	public String getBodyStyle() {
		return bodyStyle;
	}

	public void setBodyStyle(String bodyStyle) {
		this.bodyStyle = bodyStyle;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getBreaks() {
		return breaks;
	}

	public void setBreaks(String breaks) {
		this.breaks = breaks;
	}

	public String getSeats() {
		return seats;
	}

	public void setSeats(String seats) {
		this.seats = seats;
	}

	public String getWindow() {
		return window;
	}

	public void setWindow(String window) {
		this.window = window;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	@Override
	public String toString() {
		return "Cars [bodyStyle=" + bodyStyle + ", power=" + power + ", engine=" + engine + ", breaks=" + breaks
				+ ", seats=" + seats + ", window=" + window + ", fuelType=" + fuelType + ", carType=" + carType + "]";
	}

}
