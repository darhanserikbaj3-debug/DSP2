//conc cre
public class CappuccinoBrewer extends CoffeeBrewer {
    @Override
    public AbstractCoffee createCoffee() {
        return new Cappuccino();
    }
}