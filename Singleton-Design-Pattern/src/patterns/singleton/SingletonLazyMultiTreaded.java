package patterns.singleton;

public class SingletonLazyMultiTreaded {

	public static SingletonLazyMultiTreaded sc = null;

	private SingletonLazyMultiTreaded() {
	}

	public static synchronized SingletonLazyMultiTreaded getInstance() {

		if (sc == null) {
			sc = new SingletonLazyMultiTreaded();

		}
		return sc;
	}

}
