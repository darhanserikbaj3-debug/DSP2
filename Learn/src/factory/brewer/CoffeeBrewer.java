//abb cre new
public abstract class CoffeeBrewer {
    
    public abstract AbstractCoffee createCoffee();

    public void brew() {
        AbstractCoffee coffee = createCoffee();
        coffee.prepare();
    }
}
//afm