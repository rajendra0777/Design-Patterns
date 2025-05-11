package patterns.singleton;

public class SingletonLazy {

	public static SingletonLazy sc = null;

	private SingletonLazy() {
	}
	
	public static SingletonLazy getInstance() {
		if(sc==null) {
			sc = new SingletonLazy();
		}
		return sc;
	}
}
