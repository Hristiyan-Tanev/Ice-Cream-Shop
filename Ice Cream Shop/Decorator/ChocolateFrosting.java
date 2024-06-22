package Decorator;

import Factory.IceCream;

public class ChocolateFrosting extends IceCreamDecorator{
        IceCream iceCream;
      public ChocolateFrosting(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription() {
        return iceCream.getDescription() + ", Chocolate Frosting";
    }
}
