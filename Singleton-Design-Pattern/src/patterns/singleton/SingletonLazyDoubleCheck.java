package patterns.singleton;

public class SingletonLazyDoubleCheck {
	public static volatile SingletonLazyDoubleCheck sc = null;

	private SingletonLazyDoubleCheck() {
	}

	public static synchronized SingletonLazyDoubleCheck getInstance() {

		synchronized (SingletonLazyDoubleCheck.class) {
			if (sc == null) {
				sc = new SingletonLazyDoubleCheck();
			}
			return sc;
		}
	}

}
