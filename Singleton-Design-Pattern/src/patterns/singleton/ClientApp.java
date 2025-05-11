package patterns.singleton;

public class ClientApp {

	public static void main(String[] args) {

		SingletonEagers obj1 = SingletonEagers.getInstance();
		SingletonEagers obj2 = SingletonEagers.getInstance();

		// System.out.println(obj1 == obj2);

		SingletonLazy obj3 = SingletonLazy.getInstance();
		SingletonLazy obj4 = SingletonLazy.getInstance();
		// System.out.println(obj3==obj4);

		SingletonLazyDoubleCheck obj5 = SingletonLazyDoubleCheck.getInstance();
		SingletonLazyDoubleCheck obj6 = SingletonLazyDoubleCheck.getInstance();
		// System.out.println(obj5==obj6);

		SingletonLazyMultiTreaded obj7 = SingletonLazyMultiTreaded.getInstance();
		SingletonLazyMultiTreaded obj8 = SingletonLazyMultiTreaded.getInstance();
		System.out.println(obj7 == obj8);
	}

}
