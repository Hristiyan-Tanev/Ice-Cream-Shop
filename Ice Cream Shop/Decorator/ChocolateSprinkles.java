package Decorator;

import Factory.IceCream;

public class ChocolateSprinkles extends IceCreamDecorator{
    IceCream iceCream;
      public ChocolateSprinkles(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription() {
        return iceCream.getDescription() + ", Chocolate Sprinkles";
    }
}
