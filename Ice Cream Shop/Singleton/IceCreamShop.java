package Singleton;

public class IceCreamShop {
    private static IceCreamShop instance;

    private IceCreamShop() {}

    public static IceCreamShop getInstance() {
        if (instance == null) {
            instance = new IceCreamShop();
        }
        return instance;
    }
}
