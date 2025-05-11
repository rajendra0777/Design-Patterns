package patterns.builderpattern;

public interface CarBuilder {
	
	public void buildBodystyle();
	public void buildPower();
	public void buildEngine();
	public void buildBreaks();
	public void buildSeats();
	public void buildWindow();
	public void buildFuelType();
	public Car getCar();
	

}
