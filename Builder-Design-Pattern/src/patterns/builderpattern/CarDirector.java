package patterns.builderpattern;

public class CarDirector {

	private CarBuilder carBuilder;

	public CarDirector(CarBuilder carBuilder) {
		this.carBuilder = carBuilder;
	}

	
	public void build() {
		carBuilder.buildBodystyle();
		carBuilder.buildBreaks();
		carBuilder.buildEngine();
		carBuilder.buildFuelType();
		carBuilder.buildPower();
		carBuilder.buildSeats();
		carBuilder.buildWindow();
	}
}
