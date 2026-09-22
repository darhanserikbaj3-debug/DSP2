public class LatteBrewer extends CoffeeBrewer{
    @Override 
    public AbstractCoffee createCoffee() {
        return new Latte();
    }
}
