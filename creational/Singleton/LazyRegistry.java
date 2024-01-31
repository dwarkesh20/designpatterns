package designpatterns.creational.Singleton;

public class LazyRegistry {	
	private LazyRegistry() {
		System.out.println("Lazy Registry");
	}

	private static class RegistryHolder {
		static LazyRegistry INSTANCE = new LazyRegistry();
	}

	public static LazyRegistry getInstance() {
		return RegistryHolder.INSTANCE;
	}

}

class LazyRegistryWithDCL {
	private LazyRegistryWithDCL() {
		System.out.println("LazyRegistryWithDCL");
	}

	private static LazyRegistryWithDCL INSTANCE;

	public static LazyRegistryWithDCL getInstance() {
		if (INSTANCE != null)
			return INSTANCE;

		synchronized (LazyRegistryWithDCL.class) {
			if (INSTANCE != null)
				return INSTANCE;
			INSTANCE = new LazyRegistryWithDCL();
		}

		return INSTANCE;
	}

}