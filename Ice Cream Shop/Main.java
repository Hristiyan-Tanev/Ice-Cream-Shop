import Decorator.ChocolateFrosting;
import Decorator.ChocolateSprinkles;
import Factory.IceCream;
import Factory.IceCreamFactory;
import Singleton.IceCreamShop;
import Strategy.EatAtPark;
import Strategy.EatingStrategy;

public class Main {
    public static void main(String[] args) {
        // Singleton shop instance
        IceCreamShop shop = IceCreamShop.getInstance();

        // Create ice cream
        IceCream iceCream = IceCreamFactory.createIceCream("vanilla");

        // Add toppings
        iceCream = new ChocolateFrosting(iceCream);
        iceCream = new ChocolateSprinkles(iceCream);

        System.out.println(iceCream.getDescription());

        // Choose where to eat
        EatingStrategy strategy = new EatAtPark();
        strategy.eat();
    }
}
