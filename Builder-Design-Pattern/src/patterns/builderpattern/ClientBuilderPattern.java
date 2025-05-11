package patterns.builderpattern;

public class ClientBuilderPattern {
	
	public static void main(String[] args) {
		
		CarBuilder carBuilder = new SedanCarBuilder();
		CarDirector director = new CarDirector(carBuilder);
		director.build();
		
		Car car = carBuilder.getCar();
		System.out.println(car);
		
		/*
		 * CarBuilder sports = new SportsCarBuilder(); CarDirector carDirector = new
		 * CarDirector(sports); carDirector.build();
		 */
		 System.out.println("**********************");
		
		//Car car2 = sports.getCar();
		//System.out.println(car2);
		
		
	}

}
