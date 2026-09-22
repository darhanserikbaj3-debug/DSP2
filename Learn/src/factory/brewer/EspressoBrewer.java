public class EspressoBrewer extends CoffeeBrewer {
    @Override 
    public AbstractCoffee createCoffee() {
        return new Espresso();
    }
}
