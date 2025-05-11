package patterns.singleton;

public class SingletonEagers {

	
	
	public static SingletonEagers sc = new SingletonEagers();

	// 0 - param private constructors
	private SingletonEagers() {
	}

	public static SingletonEagers getInstance() {
		return sc;
	}
}
