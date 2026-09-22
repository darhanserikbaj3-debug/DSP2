//conc prod
public class Cappuccino implements AbstractCoffee {
    @Override
    public void prepare() {
        System.out.println("Making a shot of cappuccino. Wait about 5 minutes");
    }
}
